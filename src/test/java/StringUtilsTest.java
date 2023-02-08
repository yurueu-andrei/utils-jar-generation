import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.clevertec.utils.StringUtils;

public class StringUtilsTest {
    @Test
    public void isPositiveNumberTest_shouldReturnTrueForStringWithInteger() {
        //given
        boolean expected = true;

        //when
        boolean actual = StringUtils.isPositiveNumber("123");

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isPositiveNumberTest_shouldReturnFalseForStringWithChars() {
        //given
        boolean expected = false;

        //when
        boolean actual = StringUtils.isPositiveNumber("Hello world");

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isPositiveNumberTest_shouldReturnFalseForStringWithDoubleOrFloat() {
        //given
        boolean expected = false;

        //when
        boolean actual = StringUtils.isPositiveNumber("123.123");

        //then
        Assertions.assertEquals(expected, actual);
    }
}
