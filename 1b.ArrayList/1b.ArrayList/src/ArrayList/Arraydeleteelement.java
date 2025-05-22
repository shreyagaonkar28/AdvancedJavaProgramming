//1b.5 Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index
package ArrayList;
import java.util.*;
public class Arraydeleteelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> color = new ArrayList<>();
		color.add("Orange");
		color.add("green");
		color.add("pink");
		color.add("red");
		color.add("Blue");
		color.remove(3);
		System.out.println("After removing:"+color);
	}

}