//1c.5 Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))
package LinkedList;
import java.util.*;
public class LinkedListswaps {

    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colorList = new LinkedList<>();

        // Add some elements to the list
        colorList.add("Red");    
        colorList.add("Green");  
        colorList.add("Blue");   
        colorList.add("Yellow");  
        // Display the original list
        System.out.println("Original LinkedList: " + colorList);

        // Swap the first and third elements (index 0 and 2)
        Collections.swap(colorList, 0, 2);

        // Display the list after swapping
        System.out.println("LinkedList after swapping first and third elements: " + colorList);
    }
}
