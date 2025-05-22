//1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed asfollows
//1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
package Listoperation;
import java.util.*;
public class ListoperationDemo1a {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("=== ArrayList Demonstration ===");

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("After adding elements: " + arrayList);

        arrayList.add(1, "Mango");
        System.out.println("After adding Mango to the index 1: " + arrayList);

        arrayList.addAll(Arrays.asList("Grape", "Pineapple"));
        System.out.println("After adding Multiple Elements: " + arrayList);

        String firstFruit = arrayList.get(0);
        System.out.println("First fruit: " + firstFruit);

        arrayList.set(1, "Kiwi");
        System.out.println("After updating index 1 to Kiwi: " + arrayList);

        arrayList.remove("Orange");
        arrayList.remove(0);
        System.out.println("After removing Orange and index 0: " + arrayList);

        System.out.println("Contains Kiwi? " + arrayList.contains("Kiwi"));

        System.out.println("List size: " + arrayList.size());

        System.out.println("Iterating using for-each:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collections.sort(arrayList);
        System.out.println("After sorting: " + arrayList);

        List<String> sublist = arrayList.subList(0, 2);
        System.out.println("Sublist (0-2): " + sublist);

        arrayList.clear();
        System.out.println("After clearing: " + arrayList);

        System.out.println("\n--- LinkedList Demo ---");

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("LinkedList: " + fruits);

        System.out.println("First element: " + fruits.getFirst());
        System.out.println("Last element: "+fruits.getLast());
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("After removing First and Last: " + fruits);
    }
}
