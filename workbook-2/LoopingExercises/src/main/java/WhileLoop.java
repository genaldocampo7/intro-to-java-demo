
public class WhileLoop {
    public static void main(String[] args) {

        int counter = 0;
        String text = "I love Java";
        while(counter < 5) {
            System.out.println(text);
            counter++;
        }

        counter = 0;
        do {
            System.out.println(text);
            counter++;
        } while(counter < 5);

        for(int i = 0; i < 5; i++) {
            System.out.println(text);
        }
    }
}
