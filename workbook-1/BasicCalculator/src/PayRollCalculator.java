import java.util.Scanner;

public class PayRollCalculator {
public static void main(String[] args) {
    Scanner scannerObject = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = scannerObject.nextLine();

    System.out.println("Enter hours worked: ");
    float hours = scannerObject.nextFloat();
    scannerObject.nextLine();

    System.out.println("Enter pay rate: ");
    float payRate = scannerObject.nextFloat();
    scannerObject.nextLine();

    System.out.println("Hello " + name + "," + " your gross pay is: " + "$" + (hours * payRate));

    }
}
