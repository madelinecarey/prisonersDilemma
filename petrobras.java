package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class petrobras extends Company {
	public petrobras(ArrayList<Location> myLocation, World myWorld, double myPrice, double myQuantity) {
		super(950000000, myLocation, Color.YELLOW, 2.5, "Brazil", true, myPrice, myQuantity);
	}
	
	public petrobras() {
		super();
		myBudget = 950000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.YELLOW;
		myMarketShare = 2.5;
		myCountry = "Brazil";
		typeOfCompany = true;
		myPrice = 59.08;
		myQuantity = 10000000.0;
}
}


