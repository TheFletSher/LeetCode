public class leet2566 {
    public int minMaxDifference(int num) {
        String digits = Integer.toString(num);
        int length = digits.length();
        
        int min = Integer.valueOf(digits.substring(1, length));
        for (int i = 0; i < length; i++) {
            char curr = digits.charAt(i);
            if (curr != '9') {
                digits.replaceFirst(Character.toString(curr), "9");
                return Integer.valueOf(digits) - min;
            }
        }
        
        return num - min - 1;
    }
}
