package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class SaudiAramco extends Company {
	public SaudiAramco(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(355000000, myLocation, Color.GREEN, 9.4, "Saudi Arabia", true, myPrice, myQuantity);
	}
	
	public SaudiAramco() {
		super();
		myBudget = 355000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.GREEN;
		myMarketShare = 9.4;
		myCountry = "Saudi Arabia";
		typeOfCompany = true;
		myPrice = myPrice;
		myQuantity = myQuantity;
}
}

