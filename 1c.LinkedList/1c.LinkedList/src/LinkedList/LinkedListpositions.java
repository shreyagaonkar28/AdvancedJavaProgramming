//1c.4 Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )
package LinkedList;
import java.util.*;
public class LinkedListpositions {
    public static void main(String[] args) {
        // Create a LinkedList of color names
        LinkedList<String> color = new LinkedList<>();

        // Add some elements to the list
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange");

        // Display elements along with their positions
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < color.size(); i++) {
        // Use get(i) to access element at position i
        System.out.println("Position " + i + ": " + color.get(i));
        }
    }
}
