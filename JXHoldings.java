package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class JXHoldings extends Company {
	public JXHoldings(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(103000000, myLocation, Color.MAGENTA, 2.7, "Japan", false, myPrice, myQuantity);
	}
	
	public JXHoldings() {
		super();
		myBudget = 103000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.MAGENTA;
		myMarketShare = 2.7;
		myCountry = "Japan";
		typeOfCompany = false;
		myPrice = myPrice;
		myQuantity = myQuantity;
	}
	
}
