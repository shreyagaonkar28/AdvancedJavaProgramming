//3b.5 Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()
package StringExercise;

public class Removewhitespace {

  // User-defined function to remove all whitespace characters
  public static String removeWhitespace(String str) {
      if (str == null) return null;
      return str.replaceAll("\\s", ""); 
  }

  public static void main(String[] args) {
      String input = "  Java   is   awesome!  ";
      String result = removeWhitespace(input);

      System.out.println("Original: '" + input + "'");
      System.out.println("Without whitespace: '" + result + "'");
  }
}
