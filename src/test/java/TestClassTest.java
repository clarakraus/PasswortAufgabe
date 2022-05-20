import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {

    @Test
    void shouldBeTrueIfStringLongerThan8Char() {
        //given
        String password = "12345678";
        boolean expected = true;

        //when
        boolean actual = PasswortChecker.pwLength(password);

        //then
        assertEquals(actual, expected);

    }

    @Test
    void shouldBeFalseIfShorterThan8Char() {
        //given
        String password = "1234567";
        boolean expected = false;

        //when
        boolean actual = PasswortChecker.pwLength(password);

        //then
        assertEquals(actual, expected);

    }

    @Test
    void shouldBeTrueIfPasswordContainsNumbers() {
        // given
        String password = "Hallo123";
        boolean expected = true;
        //when
        boolean actual = PasswortChecker.pwNumber(password);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeFalseIfPasswordDoesNotContainsNumbers() {
        // given
        String password = "Halloserdftzguhijok";
        boolean expected = false;
        //when
        boolean actual = PasswortChecker.pwNumber(password);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeTrueIfPasswordContainsSmallLetters() {
        // given
        String password = "sdfghjLKjH";
        boolean expected = true;
        //when
        boolean actual = PasswortChecker.pwLetter(password);
        //then
        assertEquals(expected, actual);

    }

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
    void shouldReturnReminderForUpperLowerCases() {
        //given
        String password = "1234JKLHHZ";
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