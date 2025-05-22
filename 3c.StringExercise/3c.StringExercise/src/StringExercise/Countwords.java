//3c.10. Write a Java Program for Counting the number of words in a string using user defined function
//countWords()
package StringExercise;

public class Countwords {

    // Count words using space splitting
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "   Java is   simple and powerful   ";
        System.out.println("Word Count: " + countWords(input));
    }
}
