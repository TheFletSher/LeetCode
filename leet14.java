public class leet14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        // Find minimum string length
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }

        // Go through each string checking same index for same character
        StringBuilder prefix = new StringBuilder("");
        int index = 0;
        while (index < min) {
            char c = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(index) != c) return prefix.toString();
            }
            prefix.append(c);
            index++;
        }

        return prefix.toString();
    }
}
