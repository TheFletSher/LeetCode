public class leet8 {
    public int myAtoi(String s) {
        int result = 0;
        
        boolean sign = true, checkSign = true;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                continue;
            } else if (c =='-' && checkSign) {
                sign = false;
            } else if (Character.isDigit(c)) {
                checkSign = false;
                int newNum = result * 10 + (c - '0');
                if (newNum < result) {
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
