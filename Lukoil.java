package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Lukoil extends Company {
	public Lukoil(ArrayList<Location> myLocation, World myWorld, double myPrice, double myQuantity) {
		super(128000000, myLocation, Color.BLACK, 3.4, "Russia", true, myPrice, myQuantity);
	}
	
	public Lukoil() {
		super();
		myBudget = 128000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.BLACK;
		myMarketShare = 3.4;
		myCountry = "Russia";
		typeOfCompany = true;
		myPrice = 71.7;
		myQuantity = 10000000.0;
	}
}

