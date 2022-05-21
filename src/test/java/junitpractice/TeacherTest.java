package junitpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Test Teacher")
public class TeacherTest {
    private Teacher teacher;

    @BeforeEach
    public void setup() {
        teacher = new Teacher(10, "Teacher", 5000);
    }

    @Test
    @DisplayName("Test constructor")
    public void testConstructor() {
        assertEquals(10, teacher.getId());
        assertEquals("Teacher", teacher.getName());
        assertEquals(5000, teacher.getSalary());
    }

    @AfterEach
    public void teardown() {
        teacher = null;
    }
}
