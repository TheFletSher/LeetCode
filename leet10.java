public class leet10 {
    public boolean isMatch(String s, String p) {
        // easy base cases
        if (p.equals(".*")) {
            return true;
        } else if (p.equals(".") && s.length() == 1) {
            return true;
        }

        int index = 0;
        for (int i = 0; i < p.length() - 1; i++) {
            // p too long
            if (index == s.length()) {
                return false;
            }
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
            // check for '*'
            } else if (p.charAt(i) == '*') {
                // character to skip
                char skip = s.charAt(index++);
                // look through
                for (int j = index; j < s.length(); j++) {
                    // found different character; break
                    if (s.charAt(j) != skip) {
                        index = j;
                        break;
                    }
                    // character runs till end
                    if (j == s.length() - 1 && i == p.length() - 1) {
                        return true;
                    }
                }
            // check for '.'
            } else if (p.charAt(i) == '.') {
                index++;
            // match characters otherwise
            } else if (p.charAt(i) == s.charAt(index++));
        }

        return (index == s.length());
    }
}
