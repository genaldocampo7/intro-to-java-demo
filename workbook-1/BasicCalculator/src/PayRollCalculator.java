
import java.util.Scanner;

public class PayRollCalculator {
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = name();
        float hours = hours();
        float payRate = payRate();


        System.out.println("Hello " + name + "," + " your gross pay is: " + "$" + (hours * payRate));
        scanner.close();
    }


    public static String name() {
            System.out.println("Enter your name: ");
            return scanner.nextLine();
        }

    public static float hours() {
            System.out.println("Enter hours worked: ");
            return scanner.nextFloat();
        }

    public static float payRate() {
            System.out.println("Enter pay rate: ");
        System.out.print("$ "); return scanner.nextFloat();
        }
}
