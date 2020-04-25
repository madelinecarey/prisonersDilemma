package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Shell extends Company {
	public Shell(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(396000000, myLocation, Color.BLUE, 10.4, "United Kingdom", true, myPrice, myQuantity);
	}
	
	public Shell() {
		super();
		myBudget = 396000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.BLUE;
		myMarketShare = 10.4;
		myCountry = "United Kingdom";
		typeOfCompany = true;
		myPrice = myPrice;
		myQuantity = myQuantity;
}
}

