public class leet8 {
    public int myAtoi(String s) {
        int result = 0;
        
        boolean sign = true;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                continue;
            } else if (c =='-') {
                sign = false;
            } else {
                switch (c) {
                    case '1':
                        result = result * 10 + 1;
                        break;
                    case '2':
                        result = result * 10 + 2;
                        break;
                    case '3':
                        result = result * 10 + 3;
                        break;
                    case '4':
                        result = result * 10 + 4;
                        break;
                    case '5':
                        result = result * 10 + 5;
                        break;
                    case '6':
                        result = result * 10 + 6;
                        break;
                    case '7':
                        result = result * 10 + 7;
                        break;
                    case '8':
                        result = result * 10 + 8;
                        break;
                    case '9':
                        result = result * 10 + 9;
                        break;
                    case '0':
                        result = result * 10 + 0;
                        break;
                    default:
                        return result = sign ? result : -result;
                }
            }
        }
    }
}
