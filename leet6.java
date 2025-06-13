public class leet6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int m = s.length();
        int n = numRows - 1;

        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < numRows; i++) {
            boolean jump = true;
            int index = i;
            int firstJump = 2 * (n - i);
            int secondJump = (2 * n) - firstJump;

            if (secondJump == 0 || firstJump == 0) {
                firstJump = secondJump = 2 * n;
            }

            while (index < m) {
                result.append(s.charAt(index));
                index += jump ? firstJump : secondJump;
                jump = !jump;
            }
        }

        return result.toString();
    }
}
