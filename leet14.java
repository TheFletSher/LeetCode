public class leet14 {
    public String longestCommonPrefix(String[] strs) {
        String min = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (min == null || strs[i].length() < min.length()) {
                min = strs[i];
            }
        }
        StringBuilder prefix = new StringBuilder(min.charAt(0));
        for (int i = 0; i < strs.length; i++) {
            for (int j = 1; j < min.length(); j++) {
                
            }
        }
    }
}
