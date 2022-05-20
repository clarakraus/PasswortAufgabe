import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {


    @Test
    void shouldReturnValidStringIfPasswordIsValid() {
        //given
        String password = "FGjhgf12457000";
        String expected = "Your password is valid";
        //when
        String actual = PasswortChecker.checkPassword(password);
        //then
        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnReminderForUpperCase() {
        //given
        String password = "1234hjhjhj";
        String expected = "Your password should contain lower AND uppercase letters";
        String actual = PasswortChecker.checkPassword(password);
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnReminderForLowerCase() {
        //given
        String password = "1234LPIUHNN";
        String expected = "Your password should contain lower AND uppercase letters";
        String actual = PasswortChecker.checkPassword(password);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnReminderForNumbers() {
        String password = "sdfghjkkiuzjh";
        String expected = "Your password should contain numbers";
        String actual = PasswortChecker.checkPassword(password);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnReminderIfPasswordLessThan8Char() {
        String password = "12jk";
        String expected = "Your Password should be at least 8 characters long";
        String actual = PasswortChecker.checkPassword(password);
        assertEquals(expected, actual);
    }
}