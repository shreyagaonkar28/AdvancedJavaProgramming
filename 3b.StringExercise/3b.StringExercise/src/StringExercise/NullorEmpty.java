//3b.1 Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
package StringExercise;

public class NullorEmpty {

 
 // User-defined function to check for null or whitespace
 public static boolean isNullOrEmpty(String str) {
     return str == null || str.trim().isEmpty();
 }

 public static void main(String[] args) {
     String input1 = null;
     String input2 = "     ";
     String input3 = "Hello";

     System.out.println("Input1: " + isNullOrEmpty(input1)); // true
     System.out.println("Input2: " + isNullOrEmpty(input2)); // true
     System.out.println("Input3: " + isNullOrEmpty(input3)); // false
 }
}
