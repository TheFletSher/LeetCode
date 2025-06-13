public class otherSolution {
    public static void main(String[] args) {
        // for (int i = 1; i < 111; i++) {
        //     System.out.println(findKthNumber(5409, i));
        // }
        System.out.println(findKthNumber(100, 10));

    }

    public static int findKthNumber(int n, int k) {
        if (k == 1) {
            return 1;
        } else if (n < 10) {
            return k;
        }

        int groups = String.valueOf(n).length();
        // System.out.println(groups);

        int lastNum = (int) (n / (Math.pow(10, groups - 1)));
        // System.out.println(lastNum);

        int maxSize = 0;
        for (int i = 0; i < groups; i++) {
            maxSize += Math.pow(10, i);
        }
        System.out.println(maxSize);

        int result = 0;

        int groupSize = (int) Math.pow(10, groups - 1);
        int lastK = (maxSize * lastNum) - (n - (groupSize * lastNum) - 1);
        // System.out.println(lastK);
        if (k == lastK) {
            return n;
        } else if (k > lastK) {
            maxSize /= 10;
            System.out.println("HERE: " + maxSize);
            k -= lastK;
            System.out.println(k);
            int startNum = k / maxSize + 4;
            int num = k - (maxSize * (startNum - 4));
            int i = 0;
            System.out.println(startNum + ", " + num + ", " + i);
            while (Math.pow(10, i) < num) {
                num -= Math.pow(10, i);
                i++;
                System.out.println(i + ", " + num);
            }
            result = startNum * (int) Math.pow(10, i) + (num - 1);
            if (result > n) {
                result = startNum + 1;
            }
        } else {
            int startNum = k / maxSize + 1;
            int num = k - (maxSize * (startNum - 1));
            int i = 0;
            System.out.println(startNum + ", " + num + ", " + i);
            while (Math.pow(10, i) < num) {
                num -= Math.pow(10, i);
                i++;
                System.out.println(i + ", " + num);
            }
            result = startNum * (int) Math.pow(10, i) + (num - 1);
            if (result > n) {
                result = startNum + 1;
            }
        }

        return result;
    }
}
