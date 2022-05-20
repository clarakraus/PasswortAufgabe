public class PasswortChecker {


    public static boolean pwLength(String password) {
        if (password.length() >= 8){
            return true;
        }
        else {
            return false;
        }
    }


    public static boolean pwNumber(String password) {
        if(password.matches("(.*[0-9].*)")){
            return true;
        }
        else {
            return false;
        }
    }
}
