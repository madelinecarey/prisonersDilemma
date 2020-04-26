package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class SinopecGroup extends Company {
	public SinopecGroup(ArrayList<Location> myLocation, World myWorld, double myPrice, double myQuantity) {
		super(414000000, myLocation, Color.RED, 10.8, "China", false, myPrice, myQuantity);
	}
	
	public SinopecGroup() {
		super();
		myBudget = 414000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.RED;
		myMarketShare = 10.8;
		myCountry = "China";
		typeOfCompany = false;
		myPrice = 72.22;
		myQuantity = 10000000.0;
}
}
