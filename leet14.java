import java.util.HashSet;

public class leet14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        String min = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min.length()) {
                min = strs[i];
            }
        }
        StringBuilder prefix = new StringBuilder("");
        HashSet<Character> chars = new HashSet<>();
        int index = 0;
        while (index < min.length()) {
            chars.add(strs[0].charAt(index));
            for (int i = 1; i < strs.length; i++) {
                if (chars.add(strs[i].charAt(index))) return prefix.toString();
            }
            prefix.append(strs[0].charAt(index++));
        }

        return prefix.toString();
    }
}
