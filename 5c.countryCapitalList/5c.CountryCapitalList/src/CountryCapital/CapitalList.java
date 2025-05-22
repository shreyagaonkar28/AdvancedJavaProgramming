//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the countries on console whenever the countries are selected on the list.
package CountryCapital;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.HashMap;
import java.util.List;



public class CapitalList extends JFrame {

  private JList<String> countryList;
  private HashMap<String, String> capitalMap;

  public CapitalList() {
      // Initialize the frame
      setTitle("Country-Capital Viewer");
      setSize(300, 250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null); // Center the window
      setLayout(null); // Using absolute positioning

      // Create and populate the list model with country names
      DefaultListModel<String> listModel = new DefaultListModel<>();
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

      // Create the JList using the model
      countryList = new JList<>(listModel);
      countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

      // Scroll pane for the JList
      JScrollPane scrollPane = new JScrollPane(countryList);
      scrollPane.setBounds(30, 30, 200, 120);
      add(scrollPane);

      // Create and fill the country-capital map
      capitalMap = new HashMap<>();
      capitalMap.put("USA", "Washington D.C.");
      capitalMap.put("India", "New Delhi");
      capitalMap.put("Vietnam", "Hanoi");
      capitalMap.put("Canada", "Ottawa");
      capitalMap.put("Denmark", "Copenhagen");
      capitalMap.put("France", "Paris");
      capitalMap.put("Great Britain", "London");
      capitalMap.put("Japan", "Tokyo");
      capitalMap.put("Africa", "Addis Ababa");
      capitalMap.put("Greenland", "Nuuk");
      capitalMap.put("Singapore", "Singapore");

      // Add listener to handle selection changes
      countryList.addListSelectionListener(new ListSelectionListener() {
          @Override
          public void valueChanged(ListSelectionEvent e) {
              // Only act when selection is finalized
              if (!e.getValueIsAdjusting()) {
                  List<String> selectedCountries = countryList.getSelectedValuesList();
                  for (String country : selectedCountries) {
                      String capital = capitalMap.get(country);
                      if (capital != null) {
                          System.out.println("Capital of " + country + " is: " + capital);
                      }
                  }
              }
          }
      });

      setVisible(true); // Make the frame visible
  }

  public static void main(String[] args) {
      new CapitalList(); // Launch the application
  }
}

