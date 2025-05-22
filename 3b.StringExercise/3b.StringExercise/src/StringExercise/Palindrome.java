//3b.4 Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():
package StringExercise;

public class Palindrome {


  // User-defined function to check for palindrome
  public static boolean isPalindrome(String str) {
      if (str == null) return false;

      // Remove non-letter characters and convert to lowercase
      String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

      // Reverse the cleaned string
      String reversed = new StringBuilder(cleaned).reverse().toString();

      return cleaned.equals(reversed);
  }

  public static void main(String[] args) {
      String input1 = "Madam";
      String input2 = "Was it a car or a cat I saw?";
      String input3 = "Hello";

      System.out.println("\"" + input1 + "\" is palindrome? " + isPalindrome(input1));
      System.out.println("\"" + input2 + "\" is palindrome? " + isPalindrome(input2));
      System.out.println("\"" + input3 + "\" is palindrome? " + isPalindrome(input3));
  }
}
