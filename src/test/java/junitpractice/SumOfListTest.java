package junitpractice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.*;

@DisplayName("Test SumOfList")
public class SumOfListTest {
    @Test
    @DisplayName("Test sum")
    public void testSum() {
        var list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(5);
        assertEquals(10, SumOfList.sum(list));
    }
}
