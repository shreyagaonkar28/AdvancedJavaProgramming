//6a Build a servlet program to find the factorial of a number using HTML with step by step procedure.
// Define the package
package com.factorial;

// Import required Java and Servlet classes
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Map this servlet to the URL "/factorial"
@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handle POST requests (form submissions)
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Set the content type of the response to HTML
        response.setContentType("text/html");

        // Get the PrintWriter to write the HTML response
        PrintWriter out = response.getWriter();

        try {
            // Parse the number entered by the user from the request
            int number = Integer.parseInt(request.getParameter("number"));

            // Check for negative numbers
            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative.");
            }

            // Limit factorial to 20 to prevent long overflow
            if (number > 20) {
                throw new IllegalArgumentException("Number too large. Maximum allowed is 20.");
            }

            // Variable to store the factorial result
            long factorial = 1;

            // StringBuilder to store the calculation steps
            StringBuilder calculation = new StringBuilder("Calculation steps:<br>");

            // Handle special case for 0! and 1!
            if (number == 0 || number == 1) {
                calculation.append(number).append("! = 1");
            } else {
                calculation.append(number).append("! = ");
                // Loop to calculate factorial and build the step-by-step string
                for (int i = number; i >= 1; i--) {
                    factorial *= i;
                    calculation.append(i);
                    if (i > 1) {
                        calculation.append(" × ");
                    }
                }
                calculation.append(" = ").append(factorial);
            }

            // Begin HTML response
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Factorial Result</title>");
            // Basic CSS styling for better UI
            out.println("<style>");
            out.println(".container { margin: 20px; padding: 20px; width: 500px; border: 1px solid #ccc; border-radius: 5px; font-family: Arial, sans-serif; }");
            out.println(".result { margin: 10px 0; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h2>Factorial Result</h2>");
            out.println("<div class='result'>");
            out.println("<p>Number: " + number + "</p>");
            out.println("<p>Factorial: " + factorial + "</p>");
            out.println("<p>" + calculation.toString() + "</p>");
            out.println("</div>");
            out.println("<a href='index.html'>Calculate Another Factorial</a>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        } 
        // Catch invalid number format (e.g., non-numeric input)
        catch (NumberFormatException e) {
            displayError(out, "Please enter a valid number.");
        } 
        // Catch other errors such as negative or large number
        catch (IllegalArgumentException e) {
            displayError(out, e.getMessage());
        }
    }

    // Method to display error messages in HTML
    private void displayError(PrintWriter out, String message) {
        out.println("<html>");
        out.println("<head><title>Error</title></head>");
        out.println("<body>");
        out.println("<div style='margin: 20px; color: red;'>");
        out.println("<h2>Error</h2>");
        out.println("<p>" + message + "</p>");
        out.println("<a href='index.html'>Try Again</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    // Redirect GET requests to the form page
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
