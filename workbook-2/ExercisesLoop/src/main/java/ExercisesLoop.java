public class ExercisesLoop {
    public static void main(String[] args) {
        // Excerise 1: While Loop
        int count = 0;
        while (true) {
            double randomValue = Math.random();
            if (randomValue < 0.05) {
                break;
            }
            System.out.println("Hi " + count);
            count++;
        }


// Exercise 2: For Loop
        for (int i = 0; i < 20; i += 2) {
            System.out.println(i);
        }

// Exercise 3: For each Loop
                String[] favorites = {"Apple", "Banana", "Watermelon", "Grape", "Peach", "Mango"};

                for (String item : favorites) {
                    System.out.println(" I like " + item);
                }

// Exercise 4:
                for (int i = 10; i > 0; i--) {
                    System.out.println(i + " little monkey" + (i > 1 ? "s" : "") + " jumping on the bed, one fell off and bumped his head, mommy called the doctor and the doctor said, \"No more monkey" + (i > 1 ? "s" : "") + " jumping on the bed.\"\n");
                }
            }
        }


