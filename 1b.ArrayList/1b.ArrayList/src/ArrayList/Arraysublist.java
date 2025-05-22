//1b.4 Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()
package ArrayList;
import java.util.*;
public class Arraysublist {
    public static void main(String[] args) {
        // Creating a List of strings using ArrayList implementation
        List<String> ls = new ArrayList<>();

        // Adding color names to the list
        ls.add("Orange");
        ls.add("green");     // Possibly a typo, should be "green"
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Display the full list of colors
        System.out.println(ls);

        // Displaying a sublist from index 0 to 2 (excluding index 2)
        // This will print elements at index 0 and 1
        System.out.println("using sublist:");
        System.out.println(ls.subList(0, 2));  // Output will be [Orange, green]
    }
}
