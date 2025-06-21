public class leet3443 {
    public int maxDistance(String s, int k) {
        int n = 0, e = 0, so = 0, w = 0;

        for (char c : s.toCharArray()) {
            if (c == 'N') {
                n++;
            } else if (c == 'E') {
                e++;
            } else if (c == 'S') {
                so++;
            } else if (c == 'W') {
                w++;
            }
        }

        int distance = Math.abs(e - w) + Math.abs(n - so);

        if (k == 0) return distance;

        if (n > so) {
            if (k > so) {
                n += so;
                k -= so;
                so = 0;
            } else {
                n += k;
                so -= k;
                k = 0;
            }
        } else {
            if (k > n) {
                so += k;
                k -= so;
                so = 0;
            } else {
                so += k;
                n -= k;
                k = 0;
            }
        }

        if (e > w) {
            if (k > w) {
                e += w;
                k -= w;
                w = 0;
            } else {
                e += k;
                w -= k;
                k = 0;
            }
        } else {
            if (k > n) {
                w += k;
                k -= w;
                w = 0;
            } else {
                w += k;
                e -= k;
                k = 0;
            }
        }

        return distance;
    }
}
