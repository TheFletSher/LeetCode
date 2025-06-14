public class leet2566 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(minMaxDifference(11891));
    }

    public static int minMaxDifference(int num) {
        String digits = Integer.toString(num);
        int length = digits.length();
        
        int min = Integer.valueOf(digits.replace(Character.toString(digits.charAt(0)), "0"));
        for (int i = 0; i < length; i++) {
            char curr = digits.charAt(i);
            if (curr != '9') {
                digits = digits.replace(Character.toString(curr), "9");
                return Integer.valueOf(digits) - min;
            }
        }
        
        return num - min;
    }
}
