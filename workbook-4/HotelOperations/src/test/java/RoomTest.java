import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RoomTest {


    @Test
    void checkIn_successful() {
        Room room = new Room(2, 100, false, false);
        room.checkIn();

        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    void checkIn_dirtyRoom_failure() {
        Room room = new Room(2, 100, false, true);
        room.checkIn();

        assertFalse(room.isOccupied());
    }

    @Test
    void checkIn_occupiedRoom_failure() {
        Room room = new Room(2, 100, true, false);
        boolean success = room.checkIn();

        assertFalse(success);
    }

    @Test
    void checkout_occupiedRoom_successful() {
        Room room = new Room(2, 100, true, true);
        room.checkOut();

        assertFalse(room.isOccupied());
    }

    @Test
    void checkout_availableRoom_failure() {
        Room room = new Room(2, 100, false, false);

        assertThrows(IllegalStateException.class, () -> room.checkOut());
    }

    @Test
    void cleanRoom_dirtyRoom_successful() {
        Room room = new Room(2, 100, false, true);
        room.cleanroom();

        assertFalse(room.isDirty());
    }


}
