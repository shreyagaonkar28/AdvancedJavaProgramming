//3c.8  Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()
package StringExercise;

public class isNumeric {
    // Check if string contains only digits
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) {
        System.out.println("12345 is numeric? " + isNumeric("12345"));   // true
        System.out.println("12a45 is numeric? " + isNumeric("12a45"));   // false
    }
}
