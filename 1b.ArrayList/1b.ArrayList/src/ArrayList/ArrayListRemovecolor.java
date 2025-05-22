//1b.2 Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList
package ArrayList;
import java.util.*;
public class ArrayListRemovecolor {

	public static void main(String Args[]) {
		  // Create an ArrayList of Strings
		List<String> color = new ArrayList<>();
		// Add elements to the list
		color.add("Pink");
		color.add("green");
		color.add("yellow");
		color.add("red");
		color.add("Blue");
		//to remove second element
		color.remove(2);
		System.out.println("After removing the second element :"+color);
		//to remove blue color
		color.remove("Blue");
		System.out.println("After removing the color blue :"+color);
		//remaining colors in the list
		System.out.println("Remaining colors :"+color);
	}

}