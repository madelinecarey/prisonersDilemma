package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Chevron extends Company {
	
	public Chevron(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(159000000, myLocation, Color.CYAN, 4.1, "United States", false, myPrice, myQuantity);
	}

	public Chevron() {
		super();
		myBudget = 159000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.CYAN;
		myMarketShare = 4.1;
		myCountry = "United States";
		typeOfCompany = false;
		myPrice = myPrice;
		myQuantity = myQuantity;
	}

}
