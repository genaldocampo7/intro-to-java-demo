import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    public static void main(String[] args) {

// Exercise 1: favorite fruit
Map<String, String> studentFavoriteFruit = new HashMap<>();
studentFavoriteFruit.put("Van", "Durian");
studentFavoriteFruit.put("Shawn", "Apple");
studentFavoriteFruit.put("Jesus", "Watermelon");
studentFavoriteFruit.put("Genald", "Peach");

// Exercise 2: Numbers
Map<Integer, Integer> numberAndCounterparts = new HashMap<>();
numberAndCounterparts.put(1,1);
numberAndCounterparts.put(2,4);
numberAndCounterparts.put(3,6);
numberAndCounterparts.put(4,16);
numberAndCounterparts.put(5,25);

// Exercise 3: Owner and puppies

 List<String> AaronPuppies = new ArrayList<>();
 AaronPuppies.add("Sora, Siberian Husky");
 AaronPuppies.add("Kairi, Border Collie");
 AaronPuppies.add("Riku, Bullmastiff");

 List<String> SarahPuppies = new ArrayList<>();
 SarahPuppies.add("Pochita, Pug");
 SarahPuppies.add("Akira, Samoyed");
 SarahPuppies.add("Kurama, Shiba Inu");

 Map<String, List<String>> OwnerPuppies = new HashMap<>();
 OwnerPuppies.put("Aaron", AaronPuppies);
 OwnerPuppies.put("Sarah", SarahPuppies);












    }
}
