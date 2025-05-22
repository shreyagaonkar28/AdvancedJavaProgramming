//1b.3  Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)
package ArrayList;
import java.util.*;
public class ArrayListSortedcolor {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        List<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Sort the list in alphabetical order
        Collections.sort(colors);

        // Display the sorted list
        System.out.println("Sorted color list: " + colors);
    }
}
