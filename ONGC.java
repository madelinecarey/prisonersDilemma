package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class ONGC extends Company {
	public ONGC(ArrayList<Location> myLocation, World myWorld, double myPrice, double myQuantity) {
		super(127000000, myLocation, Color.ORANGE, 3, "India", false, myPrice, myQuantity);
	}
	public ONGC() {
		super();
		myBudget = 127000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.ORANGE;
		myMarketShare = 3;
		myCountry = "India";
		typeOfCompany = false;
		myPrice = 69.88;
		myQuantity = 10000000.0;
	}
}

