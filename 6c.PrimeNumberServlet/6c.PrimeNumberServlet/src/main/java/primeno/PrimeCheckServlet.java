/*6c. Build a servlet program to check the given number is prime number or not using HTML with step
by step procedure.*/
// Package declaration
package primeno;

// Required imports
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Map this servlet to the URL "/PrimeCheckServlet"
@WebServlet("/PrimeCheckServlet")
public class PrimeCheckServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handle GET requests (e.g., user opens servlet URL directly)
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Option 1: Redirect GET request to doPost() for simplicity
        doPost(request, response);

        // Option 2: Uncomment this section to show a message on GET requests
        /*
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Please submit the form via POST method.</h3>");
        out.println("<a href=\"index.html\">Go Back to form</a>");
        out.println("</body></html>");
        */
    }

    // Handle POST requests (form submission)
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        // Set response content type to HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Get the number entered in the form and convert it to an integer
            int number = Integer.parseInt(request.getParameter("number"));

            // Assume the number is prime by default
            boolean isPrime = true;

            // Prime check logic:
            // Any number <= 1 is not a prime
            if (number <= 1) {
                isPrime = false;
            } else {
                // Loop from 2 to √number to check if number is divisible
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        // If divisible, it's not a prime
                        isPrime = false;
                        break;
                    }
                }
            }

            // Begin HTML response
            out.println("<html><body>");
            out.println("<h2>Prime Number Checker Result</h2>");
            out.println("<p>Number entered: " + number + "</p>");

            // Show result based on `isPrime` value
            if (isPrime) {
                out.println("<p><b>" + number + " is a Prime Number.</b></p>");
            } else {
                out.println("<p><b>" + number + " is NOT a Prime Number.</b></p>");
            }

            // Link to go back to the form
            out.println("<a href=\"index.html\">Try another number</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            // Handle case where user input is not a valid number
            out.println("<html><body>");
            out.println("<p>Invalid input. Please enter a valid integer number.</p>");
            out.println("<a href=\"index.html\">Go back</a>");
            out.println("</body></html>");
        }
    }
}
