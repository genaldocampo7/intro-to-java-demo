import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    public static HashMap<String, Product> Inventory = new HashMap<>();

    public static void main(String[] args) {

        loadInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What item are you interested in? ");
        String itemName = scanner.nextLine();
        Product matchedProduct = Inventory.get(itemName);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f", matchedProduct.getName(), matchedProduct.getPrice());
    }

    public static void loadInventory() {
        try {
         FileReader fileReader = new FileReader("inventory.csv");
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String line = bufferedReader.readLine();
         while (line != null) {
             String[] data = line.split("\\|");
             int productID = Integer.parseInt(data[0]);
             Product item = new Product(productID, data[1], Float.parseFloat(data[2]));
             System.out.println(line);
             line = bufferedReader.readLine();
             Inventory.put(data[1], item);
         }
         bufferedReader.close();
         fileReader.close();
     } catch (IOException e) {
         System.out.println("Error loading file");
         e.printStackTrace();
     }













    }
}
