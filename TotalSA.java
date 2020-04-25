package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class TotalSA extends Company {
	public TotalSA(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(209000000, myLocation, Color.LIGHT_GRAY, 5.5, "France", true, myPrice, myQuantity);
	}
	
	public TotalSA() {
		super();
		myBudget = 209000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.LIGHT_GRAY;
		myMarketShare = 5.5;
		myCountry = "France";
		typeOfCompany = true;
		myPrice = myPrice;
		myQuantity = myQuantity;
}
}

