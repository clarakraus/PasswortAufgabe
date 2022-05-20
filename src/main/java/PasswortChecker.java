public class PasswortChecker {
    private static boolean pwLength(String password) {
        return password.length() >= 8;
    }


    private static boolean pwNumber(String password) {
        return password.matches("(.*[0-9].*)");
    }

    private static boolean pwLetter(String password) {
        return password.matches("(.*[a-z].*)") && password.matches("(.*[A-Z].*)");
    }

    public static String checkPassword(String password) {
        if (pwLength(password)) {
            if (pwNumber(password)) {
                if (pwLetter(password)) {
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

    public static String[] checkArrayPassword(String[] passwordList) {
        String [] pswFeedback = new String[passwordList.length];
        for (int i = 0; i < passwordList.length; i++) {
            pswFeedback[i] = checkPassword(passwordList[i]);
        }
        return pswFeedback;
    }
}

