import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactServiceTest {

    @Test
    public void testAddContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "Chuck",
                "Mills",
                "1234567890",
                "123 Main St"
        );
        service.addContact(contact);
    }

    @Test
    public void testDuplicateContactId() {

        ContactService service = new ContactService();

        Contact contact1 = new Contact(
                "123",
                "Chuck",
                "Mills",
                "1234567890",
                "123 Main St"
        );

        Contact contact2 = new Contact(
                "123",
                "Chuck",
                "Mills",
                "1234567890",
                "123 Main St"
        );

        service.addContact(contact1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact2);
        });
    }

    @Test
    public void testDeleteContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "Chuck",
                "Mills",
                "1234567890",
                "123 Main St"

        );

        service.addContact(contact);
        service.deleteContact("123");
    }

    @Test
    public void testUpdateFirstName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "Chuck",
                "Mills",
                "1234567890",
                "123 Main St"
        );
        service.addContact(contact);
        service.updateFirstName("123", "Mark");
        assertEquals("Mark", contact.getFirstName());
    }

    @Test
    public void testUpdateLastName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "Chuck",
                "Mills",
                "1234567890",
                "123 Main St"
        );
        service.addContact(contact);
        service.updateLastName("123", "Johnson");
        assertEquals("Johnson", contact.getLastName());
    }

    @Test
    public void testUpdatePhone() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "Chuck",
                "Mills",
                "1234567890",
                "123 Main St"
        );
        service.addContact(contact);
        service.updatePhone("123", "0987654321");
        assertEquals("0987654321", contact.getPhone());
    }

    @Test
    public void testUpdateAddress() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "Chuck",
                "Mills",
                "1234567890",
                "123 Main St"
        );
        service.addContact(contact);
        service.updateAddress("123", "321 Main St");
        assertEquals("321 Main St", contact.getAddress());
    }




}
