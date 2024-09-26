
import java.util.Objects;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
     Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = myScanner.nextFloat();

        System.out.println("Enter the second number: ");
        float num2 = myScanner.nextFloat();
        myScanner.nextLine();

        System.out.println("Would you like to (A)dd, (S)ubtract, (M)ultiply, or (D)ivide?");
        String answer = myScanner.nextLine();
        myScanner.close();

        if (Objects.equals(answer,"A")) {
            System.out.println("Addition of the first number from second number is: " + (num1 + num2));
        } else if (Objects.equals(answer, "S")) {
            System.out.println("Subtraction of the first number from second numer is: " + (num1 - num2));
        } else if (Objects.equals(answer, "M")) {
            System.out.println("Multiplication of first number from second number is: " + (num1 * num2));
        } else if (Objects.equals(answer, "D")) {
            System.out.println("Division of the first number from the second number is: " + (num1 / num2));
        }
    }
}
