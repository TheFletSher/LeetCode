public class leet1432 {
    public static void main(String[] args) {
        int num = 111;
        System.out.println();
        System.out.println(maxDiff(num));
    }

    public static int maxDiff(int num) {
        if (num < 10) {
            return 8;
        }

        String max = Integer.toString(num);

        String min = "0";

        if (max.charAt(0) != '1') {
            min = max.replace(Character.toString(max.charAt(0)), "1");
        } else {
            for (int i = 1; i < max.length(); i++) {
                if (max.charAt(i) != '0' && max.charAt(i) != max.charAt(0)) {
                    min = max.replace(Character.toString(max.charAt(i)), "0");
                    break;
                }
            }
            if (min.equals("0")) {
                min = max;
            }
        }

        for (int i = 0; i < max.length(); i++) {
            if (max.charAt(i) != '9') {
                max = max.replace(Character.toString(max.charAt(i)), "9");
                break;
            }
        }

        return Integer.valueOf(max) - Integer.valueOf(min);
    }
}
