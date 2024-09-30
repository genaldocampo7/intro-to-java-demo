import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float BaseRate = 29.99f;
    float under25SurCharge = 0.30f;
    float price1 = 0f;
    float price2 = 0f;
    float price3 = 0f;


        System.out.println("Choose Rental Car pick up date: ");
        String pickUpDate = scanner.nextLine();

        System.out.println("Number of days for rental");
        int numberOfDays = scanner.nextInt();

        float baseRentalCost = (BaseRate * numberOfDays);

        scanner.nextLine();

        System.out.println("Would you like a electronic toll tag ($3.95/Day)?: (Yes/No)");
        String answer1 = scanner.nextLine();


        if (answer1.equals("Yes")) {
            price1 = 3.95f;
        } else if (answer1.equals("No")) {
            price1 = 0f;
        }

        System.out.println("Would you like a GPS ($2.95/Day)?: (Yes/No)");
        String answer2 = scanner.nextLine();

        if (answer2.equals("Yes")) {
            price2 = 2.95f;
        } else if (answer2.equals("No")) {
            price2 = 0f;
        }

        System.out.println("Would you like roadside assistance ($3.95/Day)?: (Yes/No)");
        String answer3 = scanner.nextLine();
        if (answer3.equals("Yes")) {
            price3 = 3.95f;
        } else if (answer3.equals("No")) {
            price3 = 0f;
        }


        System.out.println("Enter current age");
        int age = scanner.nextInt();

        if (age < 25) {
            baseRentalCost += baseRentalCost * under25SurCharge;
        }

        float totalCost = (baseRentalCost + price1 + price2 + price3);


        System.out.printf("Your final cost is: $%.2f%n" , totalCost);

        scanner.close();
    }
}
