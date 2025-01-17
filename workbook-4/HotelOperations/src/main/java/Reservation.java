public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }



    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public double getPrice() {
        double price = 139.00; // when it's king
        if(roomType.equals("queen")) {
            price = 124;
        }
        if(weekend) {
            price *= 1.1;
        }
        return price;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}
