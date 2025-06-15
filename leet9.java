public class leet9 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        } else if (x < 100) {
            if (x / 10 == x % 10) {
                return true;
            }
            return false;
        }
        
        int exp = 0;

        int total = x;

        while (total > 0) {
            total /= 10;
            exp++;
        }

        exp--;

        int smallest = x / (int) Math.pow(10, (exp / 2) + 1);
        while (x > smallest) {
            int left = (x / (int) Math.pow(10, exp)) % 10;
            int right = x % 10;
            if (left != right) {
                return false;
            }
            x /= 10;
            exp -= 2;
        }

        return true;
    }
}
