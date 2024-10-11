import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListExercise {
    public static void main(String[] args) {
      // Exercise 1: 3 fav songs
      String song1 = "Can't take me eyes off of you - Frankie Valli";
      String song2 = "Wouldn't it be nice - The Beach Boys";
      String song3 = "Mr. telephone man - New Edition";

      String[] favoriteSongs = {"Can't take my eyes off of you - Frankie Valli \n","Wouldn't be nice - The Beach Boys \n", "Mr. telephone man - New edition"};

      List<String> songList = new ArrayList<>();
      songList.add("Can't take my eyes off of you - Frankie Valli");
      songList.add("Wouldn't be nice - The Beach Boys");
      songList.add("Mr. telephone man - New edition");

        System.out.println("Favorite songs: " + songList);

        songList.remove("Wouldn't be nice - The Beach Boys");

        Collections.sort(songList);
        System.out.println(songList);

        // Exercise 2: Group age

        List<String> groupAge = new ArrayList<>(List.of("Shawn: 28 ", "Jesus: 29 ", "Van: 27"));
        System.out.println("Group Age: " + groupAge);

        List<Integer> sumOfAges = new ArrayList<>();
        sumOfAges.add(29);
        sumOfAges.add(28);
        sumOfAges.add(27);
        sumOfAges.add(24);

        int sum = 0;
        for (int sumOfAge: sumOfAges) {
            sum += sumOfAge;
        }
        System.out.println("Sum of Ages of group: Jesus(29), Shawn(28), Van(27), Me(24) " + sum);

        double average = (double) sum / sumOfAges.size();

        System.out.println("Average: " + average);

      // Exercise 3: Puppy List



    }
}
