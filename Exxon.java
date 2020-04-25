package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Exxon extends Company {
		public Exxon(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(290000000, myLocation, Color.CYAN, 7.7, "United States", false, myPrice, myQuantity);
	}

	public Exxon() {
		super();
		myBudget = 290000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.CYAN;
		myMarketShare = 7.7;
		myCountry = "United States";
		typeOfCompany = false;
		myPrice = myPrice;
		myQuantity = myQuantity;
	}
}
