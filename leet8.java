public class leet8 {
    public int myAtoi(String s) {
        int result = 0;
        double max = Integer.MAX_VALUE / 10;
        
        boolean sign = true, checking = true;
        for (char c : s.toCharArray()) {
            if (c == ' ' && checking) {
                continue;
            } else if (c =='-' && checking) {
                sign = false;
                checking = false;
            } else if (c == '+' && checking) {
                checking = false;
            } else if (Character.isDigit(c)) {
                checking = false;
                if (result >= max) {
                    return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                result = result * 10 + (c - '0');
            } else {
                break;
            }
        }

        return result = sign ? result : result * -1;
    }
}
