public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return !dirty && !occupied;
    }

    public boolean checkIn() {
        this.occupied = true;
        this.dirty = true;
        return false;
    }
    public void checkOut() {
        this.occupied = false;
}
    public void cleanroom() {
        this.dirty = false;

    }
}
