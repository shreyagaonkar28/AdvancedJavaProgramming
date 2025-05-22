//3c.7 Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
package StringExercise;

public class truncate {

  
  public static String truncate(String str, int length) {
      if (str == null || length < 0) return null;
      return str.length() <= length ? str : str.substring(0, length) + "...";
  }

  public static void main(String[] args) {
      String input = "This is a long string that needs to be shortened.";
      System.out.println(truncate(input, 20));
  }
}
