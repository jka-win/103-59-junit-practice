package junitpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Test Box")
public class BoxTest {
    @Test
    @DisplayName("Test isEqual")
    public void testIsEqual() {
        var box1 = new Box(5, 10);
        var box2 = new Box(5, 10);
        var box3 = new Box(10, 10);
        assertTrue(box1.isEqual(box2));
        assertFalse(box1.isEqual(box3));
    }

    @Test
    @DisplayName("Test duplicate")
    public void testDuplicate() {
        var box = new Box(5, 10);
        Box box2 = box.duplicate();
        assertTrue(box.isEqual(box2));
    }
}
