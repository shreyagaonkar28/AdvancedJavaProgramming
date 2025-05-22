//1c.3 Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
package LinkedList;
import java.util.*;
public class LinkedlistofferLast {

    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colorList = new LinkedList<>();

        // Adding elements
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");

        // Display the original list
        System.out.println("Original LinkedList: " + colorList);

        // Insert "Pink" at the end of the list
        colorList.offerLast("Pink");

        // Display the updated list
        System.out.println("LinkedList after inserting 'Pink' at the end: " + colorList);
    }
}
