public class leet10 {
    public boolean isMatch(String s, String p) {
        if (p.equals(".*")) {
            return true;
        } else if (p.equals(".") && s.length() == 1) {
            return true;
        }

        int index = 0;
        for (int i = 0; i < p.length() - 1; i++) {
            // check for '.*'
            if (p.charAt(i) == '.' && p.charAt(i + 1) == '*') {
                // ends with '.*'
                if (i + 2 == p.length()) {
                    return true;
                // goes till character
                } else {
                    // character to go till
                    char need = p.charAt(i + 2);
                    // loop till character index
                    for (int j = index; j < s.length(); j++) {
                        // looking for needed character
                        if (s.charAt(j) == need) {
                            index = j;
                            break;
                        }
                        // couldn't find character, false
                        if (j == s.length() - 1) {
                            return false;
                        }
                    }
                }
            // check for '.'
            } else if (p.charAt(i) == '.') {
                
            // check for '*'
            } else if (p.charAt(i) == '*') {
                
            }

            if (s.charAt(i) != p.charAt(index)) {
                return false;
            }
        }
    }
}
