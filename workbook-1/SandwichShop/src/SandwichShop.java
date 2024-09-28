import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose which size sandwich: 1 (Regular - $5.45) or 2 (Large - $8.95)");
        String size = scanner.nextLine();
        float price = 0f;

        System.out.println("Would you like the sandwich loaded? Yes/No");
        String loaded = scanner.nextLine();
        float additionalCharge = 0f;

       if (size.equals("1")) {
           price = 5.45f;
           if (loaded.equals("Yes")) {
               additionalCharge += 1f;
           }
       } else if (size.equals("2")) {
           price = 8.95f;
           if (loaded.equals("Yes")) {
               additionalCharge += 1.75f;
           } else if (loaded.equals("No")) {
               additionalCharge = 0f;
           }
       }

       float totalPrice = (price + additionalCharge);

       System.out.print("What is your age?: Student (17 years old or younger -receive a 10% discount)");
        System.out.println(" or Senior (65 years old or older -receive a 20% discount)");
        int age = scanner.nextInt();
        float discount = 0f;

        if (age <= 17) {
            discount = 0.10f;
        } else if (age >= 65) {
            discount = 0.20f;
        }

        float totalDiscount = (totalPrice * discount);
        float finalPrice = (totalPrice - totalDiscount);

        System.out.printf("Total price after discount: $%.2f%n" , finalPrice);

        scanner.close();
    }
}
