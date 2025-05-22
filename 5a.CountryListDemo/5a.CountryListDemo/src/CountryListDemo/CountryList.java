//5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
//Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display them on console whenever the countries are selected on the list.
package CountryListDemo;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class CountryList extends JFrame {

  // Declare the JList to hold country names
  private JList<String> countryList;

  // Constructor to set up the GUI
  public CountryList() {
      // Create a DefaultListModel to store the list items
      DefaultListModel<String> listModel = new DefaultListModel<>();

      // Add country names to the model
      listModel.addElement("USA");
      listModel.addElement("India");
      listModel.addElement("Vietnam");
      listModel.addElement("Canada");
      listModel.addElement("Denmark");
      listModel.addElement("France");
      listModel.addElement("Great Britain");
      listModel.addElement("Japan");
      listModel.addElement("Africa");
      listModel.addElement("Greenland");
      listModel.addElement("Singapore");
      listModel.addElement(""); // Empty string as a list item (not recommended, just for illustration)

      // Create the JList using the model
      countryList = new JList<>(listModel);

      // Add a listener to respond to selection changes
      countryList.addListSelectionListener(new ListSelectionListener() {
          @Override
          public void valueChanged(ListSelectionEvent e) {
              // Check if the user is done adjusting the selection
              if (!e.getValueIsAdjusting()) {
                  // Get the list of selected items
                  final List<String> selectedValuesList = countryList.getSelectedValuesList();
                  // Print the selected items to the console
                  System.out.println(selectedValuesList);
              }
          }
      });

      // Add the JList to a scroll pane and then to the frame
      add(new JScrollPane(countryList));

      // Set up basic JFrame properties
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit app when window closes
      this.setTitle("JList Example");                       // Set the window title
      this.setSize(200, 200);                               // Set window size
      this.setLocationRelativeTo(null);                     // Center the window on screen
      this.setVisible(true);                                // Make the window visible
  }

  // Main method to run the program
  public static void main(String[] args) {
      new CountryList(); // Create and show the GUI
  }
}
