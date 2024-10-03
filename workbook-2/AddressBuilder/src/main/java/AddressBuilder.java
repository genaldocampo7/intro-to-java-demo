import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please provide the following information:");
      scanner.nextLine();

      System.out.println(" Full name:");
      String name = scanner.nextLine();

      System.out.println("Billing address:");
      String address = scanner.nextLine();

      System.out.println("Billing State:");
      String billingState = scanner.nextLine();

      System.out.println("Billing Zip:");
      int billingZip = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Shipping Street:");
      String shippingStreet = scanner.nextLine();

      System.out.println("Shipping City:");
      String shippingCity = scanner.nextLine();

      System.out.println("Shipping State:");
      String shippingState = scanner.nextLine();

      System.out.println("Shipping Zip:");
      int shippingZip = scanner.nextInt();
      scanner.close();

      StringBuilder billingAddress = new StringBuilder();
       billingAddress.append("Full name: " + name +"\n");
       billingAddress.append("Billing Street: " + address +"\n");
       billingAddress.append("Billing State: " + billingState +"\n");
       billingAddress.append("Billing Zip: " + billingZip +"\n");
       String userInput = billingAddress.toString();
       System.out.println(userInput);

       StringBuilder shippingAddress = new StringBuilder();
       shippingAddress.append("Shipping Street: " + shippingStreet +"\n");
       shippingAddress.append("Shipping City: " + shippingCity +"\n");
       shippingAddress.append("Shipping State: " + shippingState +"\n");
       shippingAddress.append("Shipping Zip: " + shippingZip +"\n");
       String userInput2 = shippingAddress.toString();
        System.out.println(userInput2);
    }
}
