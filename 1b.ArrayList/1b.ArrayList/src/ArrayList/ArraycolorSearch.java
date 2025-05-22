//1b.1 Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not
package ArrayList;
import java.util.*; 
public class ArraycolorSearch {

    public static void main(String[] args) {
        // Creating a list of strings using ArrayList implementation
        List<String> ls = new ArrayList<>();

        // Adding color names to the list
        ls.add("Orange");
        ls.add("geen");  // Typo? Possibly meant "green"
        ls.add("pink");
        ls.add("red");

        // Display the list of colors
        System.out.println(ls);

        // Check if the list contains the color "red" (case-sensitive check)
        if (ls.contains("red")) {
            System.out.println("available");  // Print if "red" is found
        } else {
            System.out.println("available not");  // Print if "red" is not found
        }
    }
}
