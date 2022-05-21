package junitpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Test DivideMethod")
public class DivideMethodTest {
    @Test
    @DisplayName("Test divide")
    public void testDivide() {
        assertEquals(5f, DivideMethod.divide(10, 2));
        assertEquals(2.5f, DivideMethod.divide(5, 2));
        assertTrue(Double.isInfinite(DivideMethod.divide(1, 0)));
    }
}
