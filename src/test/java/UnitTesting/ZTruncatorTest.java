package UnitTesting;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;


class ZTruncatorTest {

    ZTruncator zTruncator = new ZTruncator();
    String expected;
    String actual;

    @Test
    public void truncate() {
        expected = "ABC";
        actual = zTruncator.truncateZInFirstTwoPositions("ZZABC");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void enterNull() {
        assertThrows(NullPointerException.class, () -> zTruncator.truncateZInFirstTwoPositions(null));
    }

    @Test
    public void nothingEntered() {
        assertThrows(IllegalArgumentException.class, () -> zTruncator.truncateZInFirstTwoPositions(""));
    }

    @Test
    public void lengthLessThanTwo() {
        expected = "A";
        actual = zTruncator.truncateZInFirstTwoPositions("ZA");
        Assertions.assertEquals(expected, actual);
    }
}