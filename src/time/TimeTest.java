
package time;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TimeTest {

    @Test
    void testGetTotalSeconds() {
        assertEquals(43505, Time.getTotalSeconds("12:05:05"));
    }

    @Test
    void testGetSeconds() {
        assertEquals(5, Time.getSeconds("12:05:05"));
    }

    @Test
    void testGetTotalMinutes() {
        assertEquals(725, Time.getTotalMinutes("12:05:05"));
    }

    @Test
    void testGetTotalHours() {
        assertEquals(12, Time.getTotalHours("12:05:05"));
    }

    @Test
    void testGetMilliseconds() {
        assertEquals(5, Time.getMilliseconds("12:05:05:05"));
    }

    @Test
    void testGetAllMillisecondsGood() {
        assertEquals(43505005,
                Time.getAllMilliseconds("12:05:05:05"));
    }

    @Test
    void testGetAllMillisecondsInvalidLength() {
        assertThrows(NumberFormatException.class,
                () -> Time.getAllMilliseconds("12:05:05"));
    }

    @Test
    void testGetAllMillisecondsInvalidFormat() {
        assertThrows(NumberFormatException.class,
                () -> Time.getAllMilliseconds("12-05:05:05"));
    }
}