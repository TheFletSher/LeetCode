public class leet10 {
    public boolean isMatch(String s, String p) {
        // // easy base cases
        // if (p.equals(".*")) {
        //     return true;
        // } else if (p.equals(".") && s.length() == 1) {
        //     return true;
        // }

        // int index = 0;
        // for (int i = 0; i < p.length() - 1; i++) {
        //     // p too long
        //     if (index == s.length()) {
        //         // possibility of '[a=z]*'
        //         if (i + 1 == p.length() - 1 && p.charAt(i + 1) == '*') {
        //             System.out.println("[a-z]*: " + p.charAt(i + 1));
        //             return true;
        //         }
        //         System.out.println("INDEX: " + p.charAt(i + 1));
        //         return false;
        //     }
        //     // check for '.*'
        //     if (p.charAt(i) == '.' && p.charAt(i + 1) == '*') {
        //         // ends with '.*'
        //         if (i + 2 == p.length()) {
        //             return true;
        //         // goes till character
        //         } else {
        //             // character to go till
        //             char need = p.charAt(i + 2);
        //             // loop till character index
        //             for (int j = index; j < s.length(); j++) {
        //                 // looking for needed character
        //                 if (s.charAt(j) == need) {
        //                     index = j;
        //                     System.out.println("NEED: " + index);
        //                     break;
        //                 }
        //                 // couldn't find character, false
        //                 if (j == s.length() - 1) {
        //                     return false;
        //                 }
        //             }
        //         }
        //         i++;
        //     // check for '*'
        //     } else if (p.charAt(i + 1) == '*') {
        //         // character to skip
        //         char skip = p.charAt(i);
        //         // look through
        //         boolean found = false;
        //         for (int j = index; j < s.length(); j++) {
        //             // found different character; break
        //             if (s.charAt(j) != skip) {
        //                 index = j;
        //                 break;
        //             }
        //             found = true;
        //             System.out.println("\'*\': " + i + ", " + j);
        //             // character runs till end
        //             if (j == s.length() - 1 && i == p.length() - 2) {
        //                 return true;
        //             } else {
        //                 index = j;
        //             }
        //         }
        //         // check for same char after '*'
        //         if (i + 2 < p.length() && p.charAt(i + 2) == skip && !found) {
        //             return false;
        //         }
        //         i++;
        //     // check for '.'
        //     } else if (p.charAt(i) == '.') {
        //         index++;
        //     // matching characters
        //     } else if (p.charAt(i) != s.charAt(index++)) return false;
        // }

        // System.out.println("END:" + index + ", " + (s.length() - 1));
        // return (index == s.length() - 1);

        /*
         * LEETCODE SOLUTION(S)
         */

        // SLOW SOLUTION
        if (p.isEmpty()) return s.isEmpty();
        boolean first_match =
            (!s.isEmpty() &&
                (p.charAt(0) == s.charAt(0) ||
                    p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (
                isMatch(s, p.substring(2)) ||
                (first_match && isMatch(s.substring(1), p))
            );
        } else {
            return (
                first_match && isMatch(s.substring(1), p.substring(1))
            );
        }

        // FAST SOLUTION
        int m = s.length();
        int n = p.length();
        Boolean memo[][]=new Boolean[m+1][n+1];
        return check(m,n,0,0,s,p,memo);
    }

    public boolean check(int m,int n,int i,int j,String t,String tt,Boolean[][]memo)
    {
        if(memo[i][j]!=null) return memo[i][j];
        if(i>=m && j>=n) return memo[i][j]=true;

        if(j>=n) return memo[i][j]= false;
        boolean match=false;
        if((i<m)   &&  (tt.charAt(j)=='.' || tt.charAt(j)==t.charAt(i)) )
        {
            match=true;
        }
        if((j+1)<n && tt.charAt(j+1)=='*')
        {
            return memo[i][j]=(check(m,n,i,j+2,t,tt,memo) ||  ( match && check(m,n,i+1,j,t,tt,memo)));
        }
        if(match)
        {
            return memo[i][j]=check(m,n,i+1,j+1,t,tt,memo);
        }
        memo[i][j]=false;
        return false;
    }
}
