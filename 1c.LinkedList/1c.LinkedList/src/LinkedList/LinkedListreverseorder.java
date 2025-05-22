//1c.2 Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
package LinkedList;
import java.util.*;
public class LinkedListreverseorder {

    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add some color elements to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original LinkedList
        System.out.println("Original LinkedList: " + colors);

        // Use descendingIterator() to iterate in reverse order
        System.out.println("LinkedList in reverse order:");
        Iterator<String> reverseIterator = colors.descendingIterator();

        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}

