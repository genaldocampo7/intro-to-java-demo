import org.junit.jupiter.api.Test;
import java.security.InvalidParameterException;
import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void format_firstNameLastName() {
        String firstName = "Edward";
        String lastName = "Richtofen";

        String fullName = NameFormatter.format(firstName, lastName);

        assertEquals("Richtofen, Edward", fullName);
    }


    @Test
    void format_firstNameLastNameMiddleNamePrefixSuffix() {

        String firstName = "Edward";
        String lastName = "Richtofen";
        String middleName = "J";
        String prefix = "Dr.";
        String suffix = "PhD";


        String fullName = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);


        assertEquals("Richtofen, Edward, PhD", fullName);
    }

    @Test
    void format_fullname_null() {

        String fullName = null;


        String processedName = NameFormatter.format(fullName);


        assertNull(processedName);
    }

    @Test
    void format_fullname_5parts() {

        String fullName = "Dr. Edward Richtofen, PhD";


        String processedName = NameFormatter.format(fullName);


        assertEquals("Richtofen, Dr. Edward, PhD", processedName);
    }

    @Test
    void format_fullname_3parts() {

        String fullName = "Edward Richtofen";


        String processedName = NameFormatter.format(fullName);


        assertEquals("Richtofen, Edward", processedName);
    }

    @Test
    void format_fullname_4parts() {

        String fullName = "Edward Richtofen, PhD";


        String processedName = NameFormatter.format(fullName);


        assertEquals("Richtofen, Edward, PhD", processedName);
    }

    @Test
    void format_fullname_invalidLength() {

        String fullName = "Edward";

        assertThrows(InvalidParameterException.class, () -> NameFormatter.format(fullName));
    }
}