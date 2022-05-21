package junitpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Test Student")
public class StudentTest {
    private Student student;

    @BeforeEach
    public void setup() {
        student = new Student(0, "", 0);
    }

    @Test
    @DisplayName("Test default fees")
    public void testDefaultFees() {
        assertEquals(30000, student.getFeesTotal());
    }

    @Test
    @DisplayName("Test paying fees")
    public void testPayFees() {
        student.payFees(10000);
        assertEquals(10000, student.getFeesPaid());
        assertEquals(20000, student.getRemainingFees());
    }

    @Test
    @DisplayName("Test setting grade")
    public void testSetGrade() {
        student.setGrade(10);
        assertEquals(10, student.getGrade());
    }

    @AfterEach
    public void teardown() {
        student = null;
    }
}
