public class PasswortChecker {


    public static boolean pwLength(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean pwNumber(String password) {
        if (password.matches("(.*[0-9].*)")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean pwLetter(String password) {
        if (password.matches("(.*[a-z].*)") && password.matches("(.*[A-Z].*)")) {
            return true;
        } else {
            return false;
        }
    }

    public static String checkPassword(String password) {
        if (pwLength(password) == true) {
            if (pwNumber(password) == true) {
                if (pwLetter(password) == true) {
                    return "Your password is valid";
                } else {
                    return "Your password should contain lower AND uppercase letters";
                }
            } else {
                return "Your password should contain numbers";
            }
        } else {
            return "Your Password should be at least 8 characters long";
        }
    }
}

