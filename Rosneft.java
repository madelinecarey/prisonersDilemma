package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Rosneft extends Company {
	public Rosneft(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(118000000, myLocation, Color.BLACK, 3.1, "Russia", true, myPrice, myQuantity);
	}
	
	public Rosneft() {
		super();
		myBudget = 118000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.BLACK;
		myMarketShare = 3.1;
		myCountry = "Russia";
		typeOfCompany = true;
		myPrice = myPrice;
		myQuantity = myQuantity;
}
}

