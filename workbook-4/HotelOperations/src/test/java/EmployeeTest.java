import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {

        Employee employee = new Employee(1, "Cesar", "IT", 20, 20);


        employee.punchIn(17);


        assertEquals(17, employee.getLatestPunchIn());
        assertTrue(employee.isCurrentlyWorking());
    }

    @Test
    void punchOut_notCurrentlyWorking_return0() {

        Employee employee = new Employee(1, "Cesar", "IT", 20, 20);


        double hoursLatestShift = employee.punchOut(17);


        assertEquals(0, hoursLatestShift);
    }

    @Test
    void punchOut_currentlyWorking() {

        Employee employee = new Employee(1, "Cesar", "IT", 20, 20);
        employee.punchIn(17);


        double hoursLatestShift = employee.punchOut(22);


        assertEquals(5, hoursLatestShift);
        assertEquals(25, employee.getHoursWorked());
        assertFalse(employee.isCurrentlyWorking());
    }
}
