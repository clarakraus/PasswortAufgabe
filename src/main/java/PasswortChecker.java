public class PasswortChecker {


    public static boolean pwLength(String password) {
        if (password.length() >= 8){
            return true;
        }
        else {
            return false;
        }
    }
}
