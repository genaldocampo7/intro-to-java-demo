import java.util.ArrayList;
import java.util.List;

public class PuppyAdoption {
    public static void main(String[] args) {

        Puppy puppy1 = new Puppy("Speedy", "Rottweiler");
        Puppy puppy2 = new Puppy("Zora", "Labrador");
        Puppy puppy3 = new Puppy("Asta", "Australian Cattle");

        List<Puppy> PuppyList = new ArrayList<>();
        PuppyList.add(puppy1);
        PuppyList.add(puppy2);
        PuppyList.add(puppy3);

        System.out.println("Puppies: Speedy(Rottweiler), Zora(Labrador), Asta(Australian Cattle)");

        PuppyList.remove(puppy2);


        System.out.println("Zora gets adopted. remaining puppies: " + PuppyList.size());

        
        


    }
}
