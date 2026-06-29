import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testValidContact() {

        Contact contact = new Contact(
                "123",
                "Chuck",
                "Mills",
                "6515551234",
                "123 Main St"
        );

        assertEquals("123", contact.getContactId());
        assertEquals("Chuck", contact.getFirstName());
        assertEquals("Mills", contact.getLastName());
        assertEquals("6515551234", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    public void testInvalidContactId() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345678901",
                    "Chuck",
                    "Mills",
                    "6515551234",
                    "123 Main St"
            );
        });

    }

    @Test
    public void testInvalidFirstName() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "SomethingThatIsTooLong",
                    "Mills",
                    "6515551234",
                    "123 Main St"
            );
        });
    }


    @Test
    public void testInvalidLastName() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Chuck",
                    "LastNameIsTooLong",
                    "6515551234",
                    "123 Main St"
            );
        });
    }


    @Test
    public void testInvalidPhone() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Chuck",
                    "Mills",
                    "65155512344567890",
                    "123 Main St"
            );
        });
    }


    @Test
    public void testInvalidAddress() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "123",
                    "Chuck",
                    "Mills",
                    "6515551234",
                    "An Address That Is Far Too Long To Be Valid"
            );
        });
    }
}

