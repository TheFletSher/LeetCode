public class leet9 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        System.out.println(num);
        
        int left = 0;
        int right = num.length() - 1;

        while (right - left <= 1) {
            System.out.println(num.charAt(left) + ", " + num.charAt(right));
            if (num.charAt(left) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
