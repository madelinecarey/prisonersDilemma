package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Phillips66 extends Company {
	public Phillips66(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(102000000, myLocation, Color.CYAN, 2.9, "United States", false, myPrice, myQuantity);
	}
	
	public Phillips66() {
		super();
		myBudget = 102000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.CYAN;
		myMarketShare = 2.9;
		myCountry = "United States";
		typeOfCompany = false;
		myPrice = myPrice;
		myQuantity = myQuantity;
}
	
}
