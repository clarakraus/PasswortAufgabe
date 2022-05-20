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

}