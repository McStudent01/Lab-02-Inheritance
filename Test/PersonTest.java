import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("123456", "John", "Doe", "Mr.", 1990);
    }

    @Test
    void testConstructor() {
        assertEquals("123456", person.getIDNum());
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals("Mr.", person.getTitle());
        assertEquals(1990, person.getYOB());
    }

    @Test
    void testSetIDNum() {
        person.setIDNum("654321");
        assertEquals("654321", person.getIDNum());
    }

    @Test
    void testSetFirstName() {
        person.setFirstName("Jane");
        assertEquals("Jane", person.getFirstName());
    }

    @Test
    void testSetLastName() {
        person.setLastName("Smith");
        assertEquals("Smith", person.getLastName());
    }

    @Test
    void testSetTitle() {
        person.setTitle("Mrs.");
        assertEquals("Mrs.", person.getTitle());
    }

    @Test
    void testSetYOB() {
        person.setYOB(1985);
        assertEquals(1985, person.getYOB());
    }

    @Test
    void testSetInvalidYOB() {
        // This should throw an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> person.setYOB(2025));
    }

    @Test
    void testToCSVDataRecord() {
        assertEquals("123456,John,Doe,Mr.,1990", person.toCSVDataRecord());
    }
}