
import javax.swing.JComboBox;

public class Validate {

    public static boolean isNum(String input) {
        if (input.length() == 0) {
            return false;
        }
        if (input.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWord(String input) {

        if (input.length() == 0) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isAlphabetic(input.charAt(i))) {
                return false;
            }
        }
        return true;

    }

    public static boolean COMPO_BOX(JComboBox select) {

        if (select.getSelectedItem() == null) {
            return false;
        }
        return true;

    }

    public static boolean isMobile(String input) {
        if (input.length() != 11) {
            return false;
        }
        if (input.charAt(0) != '0' || input.charAt(1) != '1') {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean isYear(String input) {
        if (input.length() != 4) {
            return false;
        }

        if (!isNum(input)) {
            return false;
        }

        return true;
    }

    public static boolean isGPA(String input) {
        if (input.length() == 0) {
            return false;
        }
        if (input.charAt(0) == '0') {
            return false;
        }
        boolean point = false;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                if (!point) {
                    if (input.charAt(i) != '.') {
                        return false;
                    } else {
                        point = true;
                        continue;
                    }

                }
                return false;
            }
        }
        if (Double.parseDouble(input) > 4) {
            return false;
        }
        return true;
    }

    public static boolean isPassword(String input) {
        if (input.length() < 8) {
            return false;
        }

        return true;
    }

    public static boolean isUsername(String input) {
        if (input.length() == 0) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetterOrDigit(input.charAt(i))) {
                return false;
            }
        }

        return true;
    }
     public static boolean isName(String input) {
        if (input.length() == 0) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isWhitespace(input.charAt(i))&&!Character.isAlphabetic(input.charAt(i))) {
                return false;
            }
        }

        return true;
    }

}
