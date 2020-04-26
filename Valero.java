package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Valero extends Company {
	public Valero(ArrayList<Location> myLocation, World myWorld, double myPrice, double myQuantity) {
		super(117000000, myLocation, Color.CYAN, 3.1, "United States", false, myPrice, myQuantity);
	}
	public Valero() {
		super();
		myBudget = 117000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.CYAN;
		myMarketShare = 3.1;
		myCountry = "United States";
		typeOfCompany = false;
		myPrice = 55.99;
		myQuantity = 10000000.0;
}
}
