public class leet3443 {
    public static void main(String[] args) {
        String s = "NWSE";
        System.out.println(maxDistance(s, 1));
    }

    public static int maxDistance(String s, int k) {
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

        System.out.println(n + ", " + so + ", " + e + ", " + w);

        if (k == 0) return Math.abs(e - w) + Math.abs(n - so);

        // NORTH SOUTH correction
        if (n >= so) {
            System.out.println("S->N");
            // ALL SOUTH -> NORTH
            if (k >= so) {
                System.out.println("ALL S->N");
                n += so;
                k -= so;
                so = 0;
            // AS MUCH SOUTH -> NORTH AS POSSIBLE
            } else {
                System.out.println("SOME S->N");
                n += k;
                so -= k;
                k = 0;
            }
        } else {
            System.out.println("N->S");
            // ALL NORTH -> SOUTH
            if (k >= n) {
                System.out.println("ALL N->S");
                so += n;
                k -= n;
                n = 0;
            // AS MUCH NORTH -> SOUTH AS POSSIBLE
            } else {
                System.out.println("SOME N->S");
                so += k;
                n -= k;
                k = 0;
            }
        }
        
        System.out.println(n + ", " + so + ", " + e + ", " + w);

        if (k == 0) return Math.abs(e - w) + Math.abs(n - so);

        // EAST WEST correction
        if (e >= w) {
            // ALL WEST -> EAST
            if (k >= w) {
                e += w;
                k -= w;
                w = 0;
            // AS MUCH WEST -> EAST AS POSSIBLE
            } else {
                e += k;
                w -= k;
                k = 0;
            }
        } else {
            // ALL EAST -> WEST
            if (k >= e) {
                w += e;
                k -= w;
                e = 0;
            // AS MUCH EAST -> WEST AS POSSIBLE
            } else {
                w += k;
                e -= k;
                k = 0;
            }
        }

        return Math.abs(e - w) + Math.abs(n - so);
    }
}
