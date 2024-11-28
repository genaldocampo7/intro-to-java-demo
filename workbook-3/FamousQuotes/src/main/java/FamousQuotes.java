import java.util.Scanner;
public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String[] quotes = {"“You miss 100% of the shots you don't take” - Wayne Gretzkey ", "“Hard work beats talent when talent doesn't work hard.” - Tim Notke ", "“If there is no struggle, there is no progress”. - Frederick Douglas ", "“Courage is grace under pressure”. - Ernest Hemingway\n", "“If you're going through hell, keep going.” - Winston Churchill\n ", "“With great power comes great responsibility” - Stan Lee ", "All our dreams can come true, if we have the courage to pursue them.” - Walt Disney ", "8. Character cannot be developed in ease and quiet. Only through experience of trial and suffering can the soul be strengthened, vision cleared, ambition inspired, and success achieved.\" - Helen keller", "“In the midst of chaos, there is also opportunity” - Sun Tzu\n ", "“Light shines in the darkness, and darkness has not overcome it”. John 1:5 "};

            System.out.println("Enter a number between 1-10 for a quote");
            int choice = scanner.nextInt();

            if (choice >=1-10) {
                System.out.println(quotes[choice-1]);
            }
        }
         catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid choice. Please enter a number between 1-10 ");
            }
            scanner.close();
        }
    }

