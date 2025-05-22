//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is selected in the Pan
package ColorTabbledpanel2;
import javax.swing.*;
import java.awt.*;

public class Tabbledpanel extends JFrame {

  public Tabbledpanel() {
      // Set the frame title and layout
      setTitle("Color TabbedPane Example");
      setSize(400, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null); // Center the frame
      setLayout(null); // Using absolute positioning

      // Create the TabbedPane
      JTabbedPane tabbedPane = new JTabbedPane();
      tabbedPane.setBounds(50, 50, 280, 150);

      // Create panels for each tab
      JPanel cyanPanel = new JPanel();
      cyanPanel.setBackground(Color.CYAN);

      JPanel magentaPanel = new JPanel();
      magentaPanel.setBackground(Color.MAGENTA);

      JPanel yellowPanel = new JPanel();
      yellowPanel.setBackground(Color.YELLOW);

      // Add the panels to the tabs
      tabbedPane.add("Cyan", cyanPanel);
      tabbedPane.add("Magenta", magentaPanel);
      tabbedPane.add("Yellow", yellowPanel);

      // Add the tabbed pane to the frame
      add(tabbedPane);

      // Make the frame visible
      setVisible(true);
  }

  public static void main(String[] args) {
      new Tabbledpanel(); // Launch the GUI
  }
}
