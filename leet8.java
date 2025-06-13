public class leet8 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(myAtoi("-21474836482"));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        long result = 0;
        if (s.length() == 0) {
            return 0;
        }

        int index = 0, sign = 1;

        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = s.charAt(index++) == '-' ? -1 : 1;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index++) - '0') * sign;
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) result;
    }

    // public static int myAtoi(String s) {
    //     int result = 0;
    //     int max = Integer.MAX_VALUE / 10;
        
    //     boolean sign = true, checking = true;
    //     for (char c : s.toCharArray()) {
    //         if (checking && c == ' ') {
    //             continue;
    //         } else if (checking && c =='-') {
    //             sign = false;
    //             checking = false;
    //         } else if (checking && c == '+') {
    //             checking = false;
    //         } else if (Character.isDigit(c)) {
    //             checking = false;
    //             int digit = c - '0';
    //             if (result >= max) {
    //                 if (result == max && digit <= 8) {
    //                     if (sign && digit >= 7) {
    //                         return Integer.MAX_VALUE;
    //                     } else if (!sign && digit == 8) {
    //                         return Integer.MIN_VALUE;
    //                     } else {
    //                         result = result * 10 + digit;
    //                     }
    //                 } else {
    //                     return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    //                 }
    //             } else {
    //                 result = result * 10 + digit;
    //             }
    //         } else {
    //             System.out.println("BREAK");
    //             break;
    //         }
    //     }

    //     return result = sign ? result : -result;
    // }
}
