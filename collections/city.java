package collections;
import java.util.*;
public class city {
    public static void main(String[] args){
        List<String> cities = new ArrayList<>(Arrays.asList(
            "Chennai",  "Jaipur", "Mumbai", "Kolkata", "Bangalore",
            "Hyderabad", "Pune","Delhi", "karur", "namakkal"
        ));

        System.out.println("Original List:");
        System.out.println(cities);

        Collections.sort(cities);
        System.out.println("\nSorted List:");
        System.out.println(cities);

        Collections.reverse(cities);
        System.out.println("Reversed:");
        System.out.println(cities);

        Collections.shuffle(cities);
        System.out.println("Shuffled:");
        System.out.println(cities);
    }
}
