public class leet12 {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder("");

        /*
         * Adding backwards
         */

        // Ones place
        int curr = num % 10;
        if (curr > 0) {
            if (curr == 9) {
                roman.append("XI");
                curr = 0;
            }
            while (curr > 5) {
                roman.append('I');
                curr--;
            }
            if (curr == 5) {
                roman.append("V");
                curr = 0;
            }
            if (curr == 4) {
                roman.append("VI");
                curr = 0;
            }
            while (curr > 0) {
                roman.append("I");
                curr--;
            }
        }
        // Tens place
        curr = (num / 10) % 10;
        if (curr > 0) {
            if (curr == 9) {
                roman.append("CX");
                curr = 0;
            }
            while (curr > 5) {
                roman.append('X');
                curr--;
            }
            if (curr == 5) {
                roman.append("L");
                curr = 0;
            }
            if (curr == 4) {
                roman.append("LX");
                curr = 0;
            }
            while (curr > 0) {
                roman.append("X");
                curr--;
            }
        }
        // Hundreds place
        curr = (num / 100) % 10;
        if (curr > 0) {
            if (curr == 9) {
                roman.append("MC");
                curr = 0;
            }
            while (curr > 5) {
                roman.append('C');
                curr--;
            }
            if (curr == 5) {
                roman.append("D");
                curr = 0;
            }
            if (curr == 4) {
                roman.append("DC");
                curr = 0;
            }
            while (curr > 0) {
                roman.append("C");
                curr--;
            }
        }
        // Thousands place
        curr = (num / 1000);
        while (curr > 0) {
            roman.append("M");
        }

        return roman.reverse().toString();
    }
}
