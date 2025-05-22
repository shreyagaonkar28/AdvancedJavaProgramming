//3b.2 Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()

package StringExercise;

public class CountOccurances {
 
 // User-defined function to count occurrences
 public static int countOccurrences(String main, String sub) {
  if (main == null || sub == null || sub.isEmpty()) return 0;

     int count = 0;
     int index = 0;

     // Loop to find all non-overlapping occurrences
     while ((index = main.indexOf(sub, index)) != -1) {
         count++;
         index += sub.length();
     }

     return count;
 }

 public static void main(String[] args) {
     String mainStr = "Java is fun. Java is powerful. Java is everywhere.";
     String subStr = "Java";

     int occurrences = countOccurrences(mainStr, subStr);
     System.out.println("Occurrences of \"" + subStr + "\": " + occurrences);
 }
}
