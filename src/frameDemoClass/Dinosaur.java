package frameDemoClass;
/*  
 *Christian Bazoian
 *Chemeketa Community College
 *Date: 4/21/2013
 *Class: CIS234J
 *Assignment: GUI Project
 *File Name: Dinosaur.java
 *Description: Dinosaur class for GUI Project
 */

import java.awt.*;


/**
 * A class that stores information specific to a Dinosaur. Also contains
 * get and set methods, but they aren't used.
 */
class Dinosaur
{
		String name; // name of the dinosaur
		String legs;  // how many legs the dinosaur had
		String era;  // what time period the dinosaur lived in
		String foodType; // whether the dinosaur was a carnivore or herbivore
		
		
		/**
		 * Default constructor for my Dinosaur class
		 */
		Dinosaur()
		{
			name = "";
			legs = "";
			era = "";
			foodType = "";
		}
		
		
		
		
		/**
		 * Constructor that takes in all the information needed to make a 
		 * Dinosaur object.
		 * @param newName is the name of the dinosaur species.
		 * @param newLegs is how many legs the dinosaur uses for transportation.
		 * @param newEra is what time period the dinosaur lived in.
		 * @param newFoodType is whether the dinosaur was a carnivore or herbivore.
		 * @return a dinosaur object
		 */
		Dinosaur(String newName, String newLegs, String newEra, String newFoodType)
		{
			name = newName;
			legs = newLegs;
			era = newEra;
			foodType = newFoodType;
		}
	
}