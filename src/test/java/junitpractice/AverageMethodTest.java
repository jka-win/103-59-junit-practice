package junitpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Test AverageMethod")
public class AverageMethodTest {
    @Test
    @DisplayName("Test sum")
    public void testSum() {
        assertEquals(15f, AverageMethod.sum(2, 8, 5));
        assertEquals(0f, AverageMethod.sum(0, 0, 0));
        assertEquals(0f, AverageMethod.sum(0, -5, 5));
    }

    @Test
    @DisplayName("Test average")
    public void testAverage() {
        assertEquals(5f, AverageMethod.average(2, 8, 5));
        assertEquals(0f, AverageMethod.average(0, 0, 0));
    }
}
