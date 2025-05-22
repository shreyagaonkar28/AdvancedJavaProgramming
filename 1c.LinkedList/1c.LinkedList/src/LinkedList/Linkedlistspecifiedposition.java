//1c.1 Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
package LinkedList;
import java.util.*;
public class Linkedlistspecifiedposition {

    public static void main(String[] args) {
        // Create a LinkedList of color names
        LinkedList<String> colors = new LinkedList<>();

        // Add elements to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("yellow");
        colors.add("black");
        // Display the full list
        System.out.println("Full LinkedList: " + colors);

        // Start iterating from the 2nd element (index 1)
        System.out.println("Iterating from the 2nd element:");
        Iterator<String> iterator = colors.listIterator(1); 

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
