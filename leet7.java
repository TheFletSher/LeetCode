public class leet7 {
    public int reverse(int x) {
        String num = String.valueOf(Math.abs(x));
        StringBuilder reversed = new StringBuilder("");
        for (int i = num.length() - 1; i >= 0; i--) {
            reversed.append(num.charAt(i));
        }

        num = reversed.toString();
        int result = 0;
        try {
            result = Integer.valueOf(num);
        } catch (NumberFormatException e) {
            return 0;
        }

        if (x < 0) {
            return result * -1;
        }

        return result;
    }
}
