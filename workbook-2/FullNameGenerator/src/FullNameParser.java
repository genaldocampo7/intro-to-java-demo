
import java.util.Scanner;

public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter your name in one of the following formats: first last name or first middle last name");
        String fullname = scanner.nextLine();


        String[] usersName = fullname.split(" ");


        String firstName = "";
        String middleName = "(none)";
        String lastName = "";


        if(usersName.length == 2) {
            firstName = usersName[0];
            lastName = usersName[1];
        } else if(usersName.length == 3) {
            firstName = usersName[0];
            middleName = usersName[1];
            lastName = usersName[2];
        } else {
            System.out.println("Error");
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}



