import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose which size sandwich: 1 (Regular - $5.45) or 2 (Large - $8.95)");
        int sandwichChoice = scanner.nextInt();
        double price = 0;

        if (sandwichChoice == 1) {
            price = 5.45;
        } else if (sandwichChoice == 2) {
            price = 8.95;
        }

        System.out.print("What is your age?: Student (17 years old or younger -receive a 10% discount)");
        System.out.println(" or Senior (65 years old or older -receive a 20% discount)");
        int age = scanner.nextInt();
        double discount = 0;

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        double totalPrice = price - (price * discount);

        System.out.printf("Total price after discount: $%.2f%n" , totalPrice);

        scanner.close();


    }
}
