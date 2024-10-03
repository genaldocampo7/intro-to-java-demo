import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter full name:");
        String fullName = scanner.nextLine();
        System.out.println("Enter reservation date (MM/dd/yyyy):");
        String date = scanner.nextLine();
        System.out.println("How many tickets would you like?");
        int tickets = scanner.nextInt();

        DateTimeFormatter info = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservationDate = LocalDate.parse(date, info);

        String[] names = fullName.split(" ");
        String usersName = names[1] + ", " + names[0];

        String ticketPrompt = tickets == 1 ? "ticket" : "tickets";

        System.out.println(tickets + " " + ticketPrompt + "reserved for " + reservationDate.format(info) + " under " + usersName);
    }
}
