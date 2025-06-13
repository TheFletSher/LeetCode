public class leet3445 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(maxDifference("1122211", 3));
    }

    public static int maxDifference(String s, int k) {
        if (s.length() < 3 || s.length() > 3 * Math.pow(10, 4)) throw new IllegalArgumentException("Incorrect string length: " + s.length());
        if (s.length() < k) throw new IllegalArgumentException("String length must be longer or same size as k");

        char first = s.charAt(0), second = s.charAt(k - 1);

        int freq1 = 0, freq2 = 0;

        for (char c : s.toCharArray()) {
            if (c == first) {
                freq1++;
            } else if (c == second) {
                freq2++;
            }
        }

        if (freq2 % 2 == 1) {
            return freq2 - freq1;
        }

        return freq1 - freq2;
    }
}
