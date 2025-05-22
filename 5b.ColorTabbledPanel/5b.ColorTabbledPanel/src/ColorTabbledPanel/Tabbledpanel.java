//5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
//display the concerned color whenever the specific tab is selected in the Pan.
package ColorTabbledPanel;
import java.awt.Color;
import javax.swing.*;
public class Tabbledpanel {


  JFrame f; // Declare the main frame

  // Constructor to initialize the GUI
  Tabbledpanel() {
      // Create the JFrame
      f = new JFrame();

      // Create three different JPanel objects
      JPanel p1 = new JPanel(); // Panel for the BLUE tab
      JPanel p2 = new JPanel(); // Panel for the RED tab
      JPanel p3 = new JPanel(); // Panel for the GREEN tab

      // Set background colors for each panel
      p1.setBackground(Color.BLUE);
      p2.setBackground(Color.RED);
      p3.setBackground(Color.GREEN);

      // Create a JTabbedPane to hold the tabs
      JTabbedPane tp = new JTabbedPane();

      // Set the position and size of the tabbed pane
      tp.setBounds(50, 50, 200, 200); // x=50, y=50, width=200, height=200

      // Add tabs to the tabbed pane with associated panels
      tp.add("BLUE", p1);   // First tab named "BLUE"
      tp.add("RED", p2);    // Second tab named "RED"
      tp.add("GREEN", p3);  // Third tab named "GREEN"

      // Add the tabbed pane to the frame
      f.add(tp);

      // Set the frame size
      f.setSize(400, 400);

      // Set layout to null for absolute positioning
      f.setLayout(null);

      // Make the frame visible
      f.setVisible(true);
  }

  // Main method to launch the application
  public static void main(String[] args) {
      new Tabbledpanel(); // Create an instance of the class to display the GUI
  }
}
