import java.util.HashMap;
import java.util.Set;

public class leet3442 {
    public static void main(String[] args) {
        
    }
    
    public static int maxDifference(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String check = String.valueOf(chars.putIfAbsent(c, 1));
            System.out.println(check);
            if (check != "null") {
                chars.put(c, Integer.valueOf(check) + 1);
            }
        }

        int odd = 0, even = 0;

        Set<Character> keys = chars.keySet();
        for (char c : keys) {
            int current = chars.get(c);
            if (current % 2 == 0) {
                if (even == 0 || current < even) {
                    even = current;
                }
            } else {
                if (odd == 0 || current > odd) {
                    odd = current;
                }
            }
        }

        return odd - even;
    }
}
