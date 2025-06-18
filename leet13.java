public class leet13 {
    public int romanToInt(String s) {
        int total = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == 'I') {
                if (total > 4) {
                    total--;
                } else {
                    total++;
                }
            } else if (c == 'V') {
                total += 5;
            } else if (c == 'X') {
                if (total > 30) {
                    total -= 10;
                } else {
                    total += 10;
                }
            } else if (c == 'L') {
                total += 50;
            } else if (c == 'C') {
                if (total > 300) {
                    total -= 100;
                } else {
                    total += 100;
                }
            } else if (c == 'D') {
                total += 500;
            } else if (c == 'M') {
                total += 1000;
            }
        }
        return total;
    }
}
