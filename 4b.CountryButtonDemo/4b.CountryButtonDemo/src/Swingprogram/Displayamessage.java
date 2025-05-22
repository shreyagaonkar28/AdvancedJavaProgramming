//4b  Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling mechanism with addActionListener( ).
package Swingprogram;
//Import necessary Swing and AWT classes
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Main class
public class Displayamessage {

  JLabel l1; // Label to display messages

  // Constructor - sets up the GUI
  Displayamessage() {
      // Create a new JFrame (main window)
      JFrame f = new JFrame("Button Example");

      // Create the label and set its position and font
      l1 = new JLabel(); // Empty label initially
      l1.setBounds(50, 50, 700, 100); // x, y, width, height
      l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30)); // Font settings (reduced size for better fit)

      // Create two buttons
      JButton b1 = new JButton(" India ");
      JButton b2 = new JButton(" Srilanka ");

      // Set bounds for the first button (India)
      b1.setBounds(100, 200, 100, 100); // x, y, width, height

      // Add ActionListener for the first button
      b1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              // Set label text when India button is pressed
              l1.setText("India is pressed");
          }
      });

      // Set bounds for the second button (Srilanka)
      b2.setBounds(400, 200, 100, 100);

      // Add ActionListener for the second button
      b2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              // Set label text when SriLanka button is pressed
              l1.setText("SriLanka is pressed");
          }
      });

      // Add components to the frame
      f.add(b1);
      f.add(b2);
      f.add(l1);

      // Set frame size (increased width for better layout)
      f.setSize(700, 500);

      // Set layout manager to null (absolute positioning)
      f.setLayout(null);

      // Make frame visible
      f.setVisible(true);

      // Exit application when frame is closed
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  // Main method to launch the application
  public static void main(String[] args) {
      new Displayamessage
      ();
}
}