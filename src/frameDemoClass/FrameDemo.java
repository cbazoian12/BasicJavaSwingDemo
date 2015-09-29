package frameDemoClass;
/*  
 *Christian Bazoian
 *Chemeketa Community College
 *Date: 4/21/2013
 *Class: CIS234J
 *Assignment: doEverythingApplication
 *File Name: FrameDemo.java
 *Description: My doEverythingApplication demonstrates different widgets
 */



/* Notes for me
 * named class below for action listeners just for style. can be put right 
 * after widgett its is used for but if its in its own class at the end of the 
 * top public class (ie frameDemo), can be used by other widgets. An example of
 * this would be the group of check boxes that all work with the same action 
 *listener
 */


import java.awt.*;
import java.awt.event.*;
import java.text.*;

import javax.swing.*;
import javax.swing.event.*;

import java.util.*;

import javax.swing.border.Border;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import java.util.ArrayList;
import java.util.Vector;



/**
 *  my frame class that all components are added to. Its a demonstration
 * of a JFrame    
 */
public class FrameDemo extends JFrame
{
	private ButtonGroup group;
	private ButtonGroup radioButtonGroup;
	private JButton searchButton;
	private JButton progressBtn;
	private JButton cut;
	private JButton paste;
	private JCheckBox box1;
	private JCheckBox box2;
	private JCheckBox box3;
	private JLabel boxLabel;
	private JLabel mainLabel;
	private JLabel name;
	private JLabel searchLabel;
	private JLabel comboBoxLabel;
	private JLabel progressLabel;
	private JLabel sliderLabel;
	private JLabel listSelection;
	private JLabel allText;
	private JLabel selectedText;
	private JLabel passwordLabel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel birthDateLabel;
	private JList theList;
	private JMenuItem exitMenuItem, aboutMenuItem;
	private JPasswordField passwordField;
	private JProgressBar progressBar;
	private JRadioButton carnivoreRadioButton;
	private JRadioButton herbivoreRadioButton;
	private JSlider slider;
	private JTextArea textArea;
	private JTextField textField;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField birthDateField;
	
	JComboBox combo;
	
	// make an array of strings
	String dinosaurs[] = 
	{ "T-rex", "Brachiosaurus", "Stegasaurus",
		"Tricerotops", "Parasaurolophus", "Allosaurus",
		"Suchomimus", "Pteronodon"};
	
	//Array to hold up to 30 dinosaurs
	Dinosaur[] list = new Dinosaur[30];
	
	
	
	//Dinosaurs delcarations
	//cretaceous
	private Dinosaur Tyrannosaurus;
	private Dinosaur Pachycephalosaurus;
	private Dinosaur Parasaurolophus;
	private Dinosaur Ankylosaurus;
	private Dinosaur  Suchomimus;
	private Dinosaur Carnotaurus;
	private Dinosaur Tricerotops;
	private Dinosaur Deinonychus;
	private Dinosaur Utahraptor;
	private Dinosaur Iguanodon;
	private Dinosaur Velociraptor;
	
	//Jurassic
	private Dinosaur Stegasaurus;
	private Dinosaur Acrocanthosaurus;
	private Dinosaur Allosaurus;
	private Dinosaur Brachiosaurus;
	private Dinosaur Brontosaurus;
	private Dinosaur Compsognathus;
	private Dinosaur Diplodocus;
	
	//Triassic
	//carnivores
	private Dinosaur Arizonasaurus;
	private Dinosaur Avipes;
	private Dinosaur Newtonsaurus;
	private Dinosaur Caseosaurus;
	private Dinosaur Coelophysis;
	//herbivores
	private Dinosaur Melanorosaurus;
	private Dinosaur Camelotia;
	private Dinosaur Plateosaurus;
	private Dinosaur Coloradisaurus;
	private Dinosaur Euskelosaurus;
	
	
	
	/*
	 * The constructor simply calls the createUserInterface( )
	 * method to get the GUI started.
	 */
	public FrameDemo()
	{
		createUserInterface();
	}
	
	
	/**
	 * This class defines the properties of the GUI.  For this GUI we will be
	 * using a Container directly. Constructs a new Container. Containers 
	 * can be extended directly, but are lightweight in this case and must 
	 * be contained by a parent somewhere higher up in the component tree 
	 * that is native. (such as JFrame for example).  By using the Container
	 * in this way, we will be able to set the Bounds of the object we add
	 * to the Container, much in the same way we would set the bounds in an
	 * applet.
	 */
	private void createUserInterface()
	{
		
		// Create Dinosaurs and add them to array called list
		
		//Cretaceous Era
		Stegasaurus = new Dinosaur("Stegasaurus", "Four Legs", "Jurassic", 
			"Herbivore");
		list[0] = Stegasaurus;
		
		Tyrannosaurus = new Dinosaur("Tyrannosaurus Rex", "Two Legs", 
			"Cretaceous", "Carnivore");
		list[1] = Tyrannosaurus;
		
		Pachycephalosaurus = new Dinosaur("Pachycephalosaurus", "Two Legs", 
			"Cretaceous", "Herbivore");
		list[2] = Pachycephalosaurus;
		
		Parasaurolophus = new Dinosaur("Parasaurolophus", "Four Legs", 
			"Cretaceous", "Herbivore");
		list[3] = Parasaurolophus;
		
		Ankylosaurus = new Dinosaur("Ankylosaurus", "Four Legs", "Cretaceous", 
			"Herbivore");
		list[4] = Ankylosaurus;
		
		Suchomimus = new Dinosaur("Suchomimus", "Two Legs", "Cretaceous", 
			"Herbivore");
		list[5] = Suchomimus;
		
		Carnotaurus = new Dinosaur("Carnotaurus", "Two Legs", "Cretaceous", 
			"Carnivore");
		list[6] = Carnotaurus;
		
		Tricerotops = new Dinosaur("Tricerotops", "Four Legs", "Cretaceous",
			"Herbivore");
		list[7] = Carnotaurus;
		
		Deinonychus = new Dinosaur("Deinonychus", "Two Legs", "Cretaceous", 
			"Carnivore");
		list[8] = Deinonychus;
		
		Utahraptor = new Dinosaur("Utahraptor", "Two Legs", "Cretaceous", 
			"Carnivore");
		list[9] = Utahraptor;
		
		Iguanodon = new Dinosaur("Iguanadon", "Four Legs", "Cretaceous", 
			"Carnivore");
		list[10] = Iguanodon;
		
		Velociraptor = new Dinosaur("Velociraptor", "Two Legs", "Cretaceous", 
			"Carnivore");
		list[11] = Velociraptor;
		
		//Jurassic Era
		Acrocanthosaurus = new Dinosaur("Acrocanthosaurus", "Two Legs", 
			"Jurassic", "Carnivore");
		list[12] = Acrocanthosaurus;
		
		Allosaurus = new Dinosaur("Allosaurus", "Two Legs", "Jurassic", 
			"Carnivore");
		list[13] = Allosaurus;
		
		Brachiosaurus = new Dinosaur("Brachiosaurus", "Four Legs", "Jurassic", 
			"Herbivore");
		list[14] = Brachiosaurus;
		
		Brontosaurus = new Dinosaur("Brontosaurus", "Four Legs", "Jurassic", 
			"Herbivore");
		list[15] = Brontosaurus;
		
		Compsognathus = new Dinosaur("Compsognathus", "Two Legs", "Jurassic", 
			"Carnivore");
		list[16] = Compsognathus;
		
		Diplodocus = new Dinosaur("Diplodocus", "Four Legs", "Jurassic", 
			"Herbivore");
		list[17] = Diplodocus;
		
		//Triassic Era
		Arizonasaurus = new Dinosaur("Arizonasaurus", "Two Legs", "Triassic", 
			"Carnivore");
		list[18] = Arizonasaurus;
		
		Avipes = new Dinosaur("Avipes", "Two Legs", "Triassic", "Carnivore");
		list[19] = Avipes;
		
		Newtonsaurus = new Dinosaur("Newtonsaurus", "Two Legs", "Triassic", 
			"Carnivore");
		list[20] = Newtonsaurus;
		
		Caseosaurus = new Dinosaur("Caseosaurus", "Two Legs", "Triassic", 
			"Carnivore");
		list[21] = Caseosaurus;
		
		Coelophysis = new Dinosaur("Coelophysis", "Two Legs", "Triassic", 
			"Carnivore");
		list[22] = Coelophysis;
		
		Melanorosaurus = new Dinosaur("Melanorosaurus", "Four Legs", "Triassic", 
			"Herbivore");
		list[23] = Melanorosaurus;
		
		Camelotia = new Dinosaur("Camelotia", "Four Legs", "Triassic", 
			"Herbivore");
		list[24] = Camelotia;
		
		Plateosaurus = new Dinosaur("Plateosaurus", "Four Legs", "Triassic", 
			"Herbivore");
		list[25] = Plateosaurus;
		
		Coloradisaurus = new Dinosaur("Coloradisaurus", "Four Legs", "Triassic", 
			"Herbivore");
		list[26] = Coloradisaurus;
		
		Euskelosaurus = new Dinosaur("Euskelosaurus", "Four Legs", "Triassic", 
			"Herbivore");
		list[27] = Euskelosaurus;
		
		
		
		// Returns the contentPane object for this frame.
		Container contentPane = getContentPane();
		
		// Enable explicit positioning of FUI components
		contentPane.setLayout(new BorderLayout());
		
		
		
		// create and initialize JTabbedPanes		
		JPanel tabPanel1 = new JPanel(null);
		JPanel tabPanel2 = new JPanel(null);
		JPanel tabPanel3 = new JPanel(null);
		JPanel tabPanel4 = new JPanel(null);
		
		JTabbedPane thePanes = new JTabbedPane(JTabbedPane.TOP, 
			JTabbedPane.SCROLL_TAB_LAYOUT);
		thePanes.addTab("Tab1", tabPanel1);
		thePanes.addTab("Tab2", tabPanel2);
		thePanes.addTab("Tab3", tabPanel3);
		thePanes.addTab("Tab4" , tabPanel4);
		contentPane.add(thePanes);
		
		
		
		// Try out some different Borders
		Border raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border blackline = BorderFactory.createLineBorder(Color.BLUE);
		
		
		// My created Borders
		Border greenBorder = BorderFactory.createLineBorder(Color.GREEN);
		Border redBorder = BorderFactory.createLineBorder(Color.RED);
		Border yellowBorder = BorderFactory.createLineBorder(Color.YELLOW);
		
		
		// Add an Icon to the JFrame
		Image icon = Toolkit.getDefaultToolkit().getImage("Dino.gif");		
		setIconImage(icon);
		
		JMenuBar menuBar = createMenuBar();
		setJMenuBar(menuBar);
		menuBar.setBorder(blackline);
		
		// add components here...
		
		
		
		//================== tabPanel1 set up===================================
		
		mainLabel= new JLabel("Search Dinosaur Species By Making Selections Below");
		mainLabel.setBounds(75,5,320,30);
		mainLabel.setBorder(raisedetched);
		tabPanel1.add(mainLabel);
		
		
		
		// set up for first check box
		box1 = new JCheckBox();
		box1.setBounds(50,50,30,30); // set the size of the box
		box1.setBorderPaintedFlat(false);
		box1.setSelected(false); // set whether check box is selected or not
		
		// pops up when mouse pointer hovers over
		box1.setToolTipText("Choose Two Legs"); 
		
		// what the action listeners look for when this is selected
		box1.setActionCommand("Two Legs"); 
		tabPanel1.add(box1);  // add to panel
		
		//set up for first check box label
		boxLabel = new JLabel("Two Legs");
		boxLabel.setBounds(80,55,95,20);
		boxLabel.setBorder(raisedbevel);
		boxLabel.setToolTipText("Choose Two Legs");
		tabPanel1.add(boxLabel);
		
		
		
		
		
		// set up for second check box
		box2 = new JCheckBox();
		box2.setBounds(50,75,30,30);
		box2.setBorderPaintedFlat(false);
		box2.setToolTipText("Choose Four Legs");
		box2.setSelected(false);
		box2.setActionCommand("Four Legs");
		tabPanel1.add(box2);
		
		// set up for second check box label
		boxLabel = new JLabel("Four Legs");
		boxLabel.setBounds(80,80,95,20);
		boxLabel.setToolTipText("Choose Four Legs");
		boxLabel.setBorder(raisedbevel);
		tabPanel1.add(boxLabel);
		
		
		
		
		
		
		
		//set up for third check box
		box3 = new JCheckBox();
		box3.setBounds(50,100,30,30);
		box3.setBorderPaintedFlat(false);
		box3.setToolTipText("Choose Wings");
		box3.setSelected(false);
		box3.setActionCommand("Wings");
		tabPanel1.add(box3);
		
		//set up for third check box label
		boxLabel = new JLabel("Wings");
		boxLabel.setBounds(80,105,95,20);
		boxLabel.setBorder(raisedbevel);
		boxLabel.setToolTipText("Choose Wings");
		tabPanel1.add(boxLabel);
		
		
		
		
		//adds action listeners to the check boxes
		ActionListener aListener = new BoxButtonSelector();
		box1.addActionListener((aListener));
		box2.addActionListener((aListener));
		box3.addActionListener((aListener));
		
		
		//adds check boxes to a group so no two can be selected at the same time
		group = new ButtonGroup();
		group.add(box1);
		group.add(box2);
		group.add(box3);
		
		
		
		// set up for carnivore radio button	
		carnivoreRadioButton = new JRadioButton("Carnivore");
		carnivoreRadioButton.setBounds(275, 110, 101, 16);
		
		//sends "Carnivore to Action listeners when carnivore option is selected
		carnivoreRadioButton.setActionCommand("Carnivore");  
		
		//carnivoreRadioButton.setSelected(true);
		carnivoreRadioButton.setToolTipText("Choose A Carnivore");
		tabPanel1.add(carnivoreRadioButton);
		
		
		
		
		//set up for herbivore radio button
		herbivoreRadioButton = new JRadioButton("Herbivore");
		herbivoreRadioButton.setBounds(275, 130, 81, 15);
		
		//sends "Herbivore to Action Listeners when herbivore option is selected
		herbivoreRadioButton.setActionCommand("Herbivore"); 
		
		herbivoreRadioButton.setToolTipText("Choose A Herbivore");
		tabPanel1.add(herbivoreRadioButton);
		
		//add action listeners to the radio buttons
		ActionListener RadioButtonListener = new RadioButtonSelector();
		carnivoreRadioButton.addActionListener((RadioButtonListener));
		herbivoreRadioButton.addActionListener((RadioButtonListener));
		
		// add radio buttons to a group
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(carnivoreRadioButton);
		radioButtonGroup.add(herbivoreRadioButton);
		
		
		// Create a text area
		textArea = new JTextArea();
		textArea.setBorder(loweredbevel);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setAutoscrolls(true);
		textArea.setToolTipText("Your Search Filters");
		
		//make the text area scroll down when no more words fit
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(50,170,260,90);
		tabPanel1.add(scroll);
		
		
		
		
		// Create a combobox
		String[] items = {"-Select-", " Cretaceous", " Jurassic", " Triassic"};
		combo = new JComboBox(items);
		combo.setBounds(250,70,200,20);
		combo.setBorder(loweredbevel);
		combo.setToolTipText("Choose A Time Period");
		comboBoxLabel = new JLabel("Choose Era");
		comboBoxLabel.setBounds(250,45,75,20);
		comboBoxLabel.setBorder(loweredbevel);
		comboBoxLabel.setToolTipText("Choose A Time Period");
		tabPanel1.add(combo);
		tabPanel1.add(comboBoxLabel);
		
		//Add action listener to combo box
		combo.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent event) 
				{
					Object contents = combo.getSelectedItem();
					textArea.append("\n" + "From the" + contents + " era");
					System.out.println("Combo Box option selected" + contents);
				}
			});
		
		
		
		// set up for search button
		ImageIcon searchIcon = new ImageIcon("dinoSearch.gif"); // make image icon
		searchButton = new JButton(searchIcon);
		searchButton.setBounds(400,200,60,60); 
		tabPanel1.add(searchButton);
		
		
		
		// set up for the search JLabel
		JLabel searchLabel = new JLabel("Search");
		searchLabel.setBounds(405, 150, 80, 80);
		tabPanel1.add(searchLabel);
		
		
		
		// add action Listener to search button
		searchButton.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent ae) 
				{
					// variables to store the selected options from gui to 
					// compare to the current Dinosaur
					String searchLegs = "";
					String searchEra = "";
					String searchFoodType = "";
					
					// get the selected option from the check boxes
					String legChoice = group.getSelection().getActionCommand(); 
					
					// set "search" variables to the selected "choices" from GUI
					if(legChoice == "Two Legs")
					{
						searchLegs = "Two Legs";
					}
					
					if(legChoice == "Four Legs")
					{
						searchLegs = "Four Legs";
					}
					
					if(legChoice == "Wings")
					{
						searchLegs = "Wings";
					}
					
					// get selected option from JRadioButtons
					String foodChoice = radioButtonGroup.getSelection().getActionCommand(); 
					
					// set "search" variables to the selected "choices" from GUI
					if(foodChoice == "Carnivore")
					{
						searchFoodType = "Carnivore";
					}
					
					if(foodChoice == "Herbivore")
					{
						searchFoodType = "Herbivore";
					}
					
					
					//*************BROKEN SECTION*******************************
					
					// get the selected option from JComboBox
					String eraChoice = (String)combo.getSelectedItem(); 
					
					// set "search" variables to the selected "choices" from GUI        
					if(eraChoice == "Cretaceous")
					{
						searchEra = "Cretacious";
					}
					
					if(eraChoice == "Jurassic")
					{
						searchEra = "Jurassic";
					}
					
					if(eraChoice == "Triassic")
					{
						searchEra = "Triassic";
					}
					//***********END BROKEN SECTION*****************************
					
					
					
					// clear textArea
					textArea.setText("");
					
					
					//search through list and append any "Name"s that fit the 
					// search criteria below
					for(int i = 0; i < 28; i++)  
					{						
						//System.out.println(list[i].name + searchLegs + 
						//searchEra + searchFoodType);  //For debugging purposes
						
						if((list[i].legs == searchLegs) && (list[i].foodType == searchFoodType))
						{
							textArea.append("\n" + list[i].name);
							//System.out.println(list[i].name); // for debugging purposes
						}
					}
				}  	
			});
		
		//=================== end of tabPanel1 set up ==========================
		
		
		
		
		
		
		
		
		//================== tabPanel2 set up ==================================
		
		//create progress bar
		progressBar = new JProgressBar();//progress bar is horizontal by default
		progressBar.setStringPainted(true);// shows the percentage of completion	
		progressBar.setBounds(250, 150, 200, 20);
		progressBar.setToolTipText("A progress bar");
		tabPanel2.add(progressBar);
		
		//label displays progress value
		progressLabel = new JLabel("Progress: " + progressBar.getValue());  
		progressLabel.setToolTipText("Shows the progress as a percentage");
		
		
		progressLabel.setBounds(300, 145, 80, 80);
		tabPanel2.add(progressLabel);
		
		// progress bar button set up
		progressBtn = new JButton("Push Me");
		progressBtn.setBounds(300,200,100,40);
		progressBtn.setToolTipText("Increase Progress Bar");
		tabPanel2.add(progressBtn);
		tabPanel2.add(progressBtn);
		
		
		/*
		Increment the progress bar each time the push me button is pressed. 
		When maxi s reached, nothing else happens
		*/
		progressBtn.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent ae) 
				{
					int value = progressBar.getValue();
					
					if(value >= progressBar.getMaximum())
					{
						return;
					}
					
					else
					{
						progressBar.setValue(value + 10);
					}
					
					progressLabel.setText("Progress: " + progressBar.getValue());
				}
			});
		
		
		// --------------Set up for JList "theList" ----------------------------
		
		
		// create a JList using the string of dinosaurs declared at beginning
		theList = new JList(dinosaurs);
		theList.setToolTipText("List of dinosaurs");
		
		//Set list selection mode to single selection
		theList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//Add list to a scroll pane
		JScrollPane scroll2 = new JScrollPane(theList);
		scroll2.setBounds(255,30,200,100);
		tabPanel2.add(scroll2);
		
		// make a JLabel that displays the selection
		listSelection = new JLabel("Choose a dinosaur");
		listSelection.setBounds(260,5,200,30);
		listSelection.setToolTipText("Choose a dinosaur");
		tabPanel2.add(listSelection);
		
		// Add selection listener for the list
		theList.addListSelectionListener(new ListSelectionListener() 
			{
				public void valueChanged(ListSelectionEvent le) 
				{
					//Get index of the changed item
					int idx = theList.getSelectedIndex();
					
					//Display selection, if item was selected
					if(idx != -1)
					{
						listSelection.setText("Current Selection " +
							dinosaurs[idx]);
					}
					
					else // otherwise rePrompt
					{
						listSelection.setText("Choose a dinosaur");
					}
				}
			});
		//-------- end JList set up --------------------------------------------	
		
		
		
		//set up for slider
		slider = new JSlider();
		
		slider.setBounds(20, 100, 200, 70);
		
		//sets the major tick marks on slider with 10 units spacing
		slider.setMajorTickSpacing(10); 
		
		//sets minor tick marks with 5 units spacing
		slider.setMinorTickSpacing(5); 
		
		slider.setPaintTicks(true); // show the tick mark values
		slider.setPaintLabels(true); // displays the tick mark labels
		slider.setBorder(loweredbevel);
		slider.setToolTipText("A Slider");
		
		//shows what value each major tick mark represents
		slider.setLabelTable(slider.createStandardLabels(10));  
		
		tabPanel2.add(slider);
		
		
		//set up for slider label
		sliderLabel = new JLabel("Value: " + slider.getValue());
		sliderLabel.setBounds(80, 140, 80, 80);
		sliderLabel.setToolTipText("Value of Slider");
		tabPanel2.add(sliderLabel);
		
		
		
		
		//add change listeners to the slider. Slider waits until the user stops
		//changing the slider's value before responding
		slider.addChangeListener(new ChangeListener() 
			{
				public void stateChanged(ChangeEvent ce) 
				{
					//Display new value
					sliderLabel.setText("Value: " + slider.getValue());
				}
			});
		
		
		
		
		//set up for JTextField firstNameField 
		firstNameField = new JTextField("");
		firstNameField.setBounds(20,150,100,20);
		firstNameField.setToolTipText("Enter first name");
		tabPanel3.add(firstNameField);
		
		
		//set up for JTextField lastNameField
		lastNameField = new JTextField("");
		lastNameField.setBounds(20,175,100,20);
		lastNameField.setToolTipText("Enter last Name");
		tabPanel3.add(lastNameField);
		
		//set up for JTextField birthDateField
		birthDateField = new JTextField("");
		birthDateField.setBounds(20,200,100,20);
		birthDateField.setToolTipText("Enter date of birth");
		tabPanel3.add(birthDateField);
		
		//set up for firstNameLabel
		firstNameLabel = new JLabel("Enter First Name");
		firstNameLabel.setBounds(130,150,100,20);
		tabPanel3.add(firstNameLabel);
		
		//set up for lastNameLabel
		lastNameLabel = new JLabel("Enter Last Name");
		lastNameLabel.setBounds(130,175,100,20);
		tabPanel3.add(lastNameLabel);
		
		//set up for birthDateLabel
		birthDateLabel = new JLabel("Enter Date of Birth");
		birthDateLabel.setBounds(130,200,130,20);
		tabPanel3.add(birthDateLabel);
		
		
		//============ end of tabPanel2 set up =================================
		
		
		
		
		
		
		//=================tabPanel3 set up ====================================
		
		//set up for allText JLabel
		allText = new JLabel("All text: ");
		allText.setBounds(30,70,400, 20);
		allText.setToolTipText("Displays what is in the text field");
		tabPanel3.add(allText);
		
		
		
		
		// set up for selectedText JLabel
		selectedText = new JLabel("Selected text: ");
		selectedText.setBounds(30,90, 400, 20);
		allText.setToolTipText("Displays selected text");
		tabPanel3.add(selectedText);
		
		
		
		
		
		
		//set up for JTextField	
		textField = new JTextField("Prehistoric animals are awesome!", 15);
		textField.setBounds(10,10, 250, 20);
		textField.setToolTipText("Type anything here and select part of it");
		tabPanel3.add(textField);
		
		
		// Add an inner class action listener for the the text field
		// Each time the user presses enter, the contents of the field are 
		// displayed. Any currently selected text is also displayed
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent le) {
				allText.setText("All text: " + textField.getText());
				selectedText.setText("Selected text: " + textField.getSelectedText());
			}
		});
		
		
		// set up for cut button
		cut = new JButton("Cut");
		cut.setBounds(20,35,60,25);
		cut.setToolTipText("Cut selected text");
		tabPanel3.add(cut);
		
		//Add action Listener to the cut button
		cut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent le) {
				// cut any selected text and put it on the clipboard
				textField.cut();
				allText.setText("All text: " + textField.getText());
				selectedText.setText("Selected text: " + textField.getSelectedText());
				System.out.println("Cut button clicked.");
			}
		});
		

		
		//set up for paste button
		paste = new JButton("Paste");
		paste.setBounds(90,35,80,25);
		paste.setToolTipText("Paste selected text");
		tabPanel3.add(paste);
		
		//Add action listener for the paste button
		paste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent le) {
				// Paste text from the clipboard into the text field
				textField.paste();
				System.out.println("Paste button clicked");
			}
		});
				
		

		
		// Add a caret listener. This lets the application respond in real
		// time to changes in the text field.
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent ce) {
				allText.setText("All text: " + textField.getText());
				selectedText.setText("Selected text: " + textField.getSelectedText());
			}
		});
		
		
		
		//Set up for JLabel passwordLabel
		passwordLabel = new JLabel("Enter Password");
		passwordLabel.setToolTipText("Password Status");
		passwordLabel.setBounds(50,75,200,20);
		tabPanel4.add(passwordLabel);
		
		
		//set up for JPasswordField
		passwordField = new JPasswordField(15);
		passwordField.setToolTipText("Enter password here");
		passwordField.setBounds(50,50,200,20);
		tabPanel4.add(passwordField);
		
		//Add an actionListener inner class for password field
		// Each time the user presses enter, the contents of the password
		// field are checked against the password
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent le) {
				char pw[] = { 't', 'e', 's', 't' }; // correct password
				
				char[] userSeq = passwordField.getPassword(); // holds user's password
				
				//Test for valid password
				if(Arrays.equals(userSeq, pw))
				{
					passwordLabel.setText("Password Valid");
					System.out.println("Valid Password entered");
				}
			
				else
				{
					passwordLabel.setText("Password Invalid -- Try Again");
					System.out.println("Invalid Password entered");
				}
			
			//Clear both arrays on exit
			Arrays.fill(pw, (char) 0);
			Arrays.fill(userSeq, (char) 0);
			
			}
		});
		
		
		
		
		//================end of tabPanel3 set up ==============================
		
		
		
		
		
		/*
		 * The following code sets up both the size of the window
		 * and centers the window on the screen. The Toolkit class
		 * is the abstract superclass of all actual implementations 
		 * of the Abstract Window Toolkit.  The getScreenSize( ) method
		 * gets the size of the screen. On systems with multiple 
		 * displays, the primary display is used.
		 */
		
		int width = 500;
		int height = 350;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width-width)/2;
		int y = (screen.height-height)/2;
		setBounds(x,y,width,height);
		
		setTitle("  Dinosaur Species Search");
		setSize(width, height);
		setVisible(true);
	}
	
	
	
	/**
	 * Sets up the menu bar with File and Edit menus.
	 */
	
	public JMenuBar createMenuBar ()
	{
		MenuListener menuListener = new MenuListener ();
		
		JMenu fileMenu = new JMenu ("File");
		
		aboutMenuItem = new JMenuItem ("About...");
		aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, 
			ActionEvent.CTRL_MASK));
		aboutMenuItem.addActionListener (menuListener);
		
		exitMenuItem = new JMenuItem ("Exit");
		exitMenuItem.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_Q, 
			ActionEvent.CTRL_MASK));
		exitMenuItem.addActionListener (menuListener);
		
		
		fileMenu.addSeparator ();
		fileMenu.add (aboutMenuItem);
		fileMenu.addSeparator ();
		fileMenu.add (exitMenuItem);
		
		JMenuBar bar = new JMenuBar ();
		bar.add (fileMenu);
		return bar;
	}
	
	
	/**
	 * An inner class to handle window events.
	 */
	public class WindowCloser extends WindowAdapter
	{
		//--------------------------------------------------------------
		//  Terminates the program when the window is closed.
		//--------------------------------------------------------------
		public void windowClosing (WindowEvent event)
		{
			exitMenuItem.doClick ();
		}
	}
	
	
	
	// put comments above these action listseners
	
	public class BoxButtonSelector implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String choice = group.getSelection().getActionCommand();
			System.out.println("Check box button selected " + choice );
			textArea.append("\n" + "A Dinosaur that has " + choice);
		}
	}
	public class BoxItemListener implements ItemListener
	{
		public void itemStateChanged(ItemEvent ev)
		{
			boolean selected = (ev.getStateChange() == ItemEvent.SELECTED);
			AbstractButton button = (AbstractButton)ev.getItemSelectable();
		}
	}
	
	
	
	
	
	public class RadioButtonSelector implements ActionListener 
	{
		public void actionPerformed(ActionEvent event)
		{
			String choice = radioButtonGroup.getSelection().getActionCommand();
			System.out.println("Radio button selected " + choice );
			textArea.append("\nA Dinosaur that is a " + choice);
		}
	}
	public class RadioButtonListener implements ItemListener
	{
		public void itemStateChanged(ItemEvent ev)
		{
			boolean selected = (ev.getStateChange() == ItemEvent.SELECTED);
			AbstractButton button = (AbstractButton)ev.getItemSelectable();
		}
	}
	
	
	
	
	
	public class MenuListener implements ActionListener
	{
		//--------------------------------------------------------------
		//  Handles action events caused by menu selections.
		//--------------------------------------------------------------
		public void actionPerformed (ActionEvent event)
		{
			JFileChooser fileChooser = new JFileChooser ();
			String currentSaveName;
			if (event.getActionCommand ().equals ("Exit"))
				System.exit (0);
			
			else if (event.getActionCommand ().equals ("About..."))
			{
				JOptionPane.showMessageDialog (null,
					"Fundamentals of Java Programming \n" +
					"Dino Species Search \n" +
					"Christian Bazoian\n" + 
					"Version 1.0.0.0");
			}
		}
	}		
	
	
	
	
	
	
	public static void main(String[] arg)
	{
		FrameDemo application = new FrameDemo();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}// end class