public class leet10 {
    public boolean isMatch(String s, String p) {
        // easy base cases
        if (p.equals(".*")) {
            return true;
        } else if (p.equals(".") && s.length() == 1) {
            return true;
        }

        int index = 0;
        for (int i = 0; i < p.length() - 1; i++) {
            // p too long
            if (index == s.length()) {
                // possibility of '[a=z]*'
                if (i + 1 == p.length() - 1 && p.charAt(i + 1) == '*') {
                    System.out.println("[a-z]*: " + p.charAt(i + 1));
                    return true;
                }
                System.out.println("INDEX: " + p.charAt(i + 1));
                return false;
            }
            // check for '.*'
            if (p.charAt(i) == '.' && p.charAt(i + 1) == '*') {
                // ends with '.*'
                if (i + 2 == p.length()) {
                    return true;
                // goes till character
                } else {
                    // character to go till
                    char need = p.charAt(i + 2);
                    // loop till character index
                    for (int j = index; j < s.length(); j++) {
                        // looking for needed character
                        if (s.charAt(j) == need) {
                            index = j;
                            System.out.println("NEED: " + index);
                            break;
                        }
                        // couldn't find character, false
                        if (j == s.length() - 1) {
                            return false;
                        }
                    }
                }
                i++;
            // check for '*'
            } else if (p.charAt(i + 1) == '*') {
                // character to skip
                char skip = p.charAt(i);
                // look through
                boolean found = false;
                for (int j = index; j < s.length(); j++) {
                    // found different character; break
                    if (s.charAt(j) != skip) {
                        index = j;
                        break;
                    }
                    found = true;
                    System.out.println("\'*\': " + i + ", " + j);
                    // character runs till end
                    if (j == s.length() - 1 && i == p.length() - 2) {
                        return true;
                    } else {
                        index = j;
                    }
                }
                // check for same char after '*'
                if (i + 2 < p.length() && p.charAt(i + 2) == skip && !found) {
                    return false;
                }
                i++;
            // check for '.'
            } else if (p.charAt(i) == '.') {
                index++;
            // matching characters
            } else if (p.charAt(i) != s.charAt(index++)) return false;
        }

        System.out.println("END:" + index + ", " + (s.length() - 1));
        return (index == s.length() - 1);
    }
}
