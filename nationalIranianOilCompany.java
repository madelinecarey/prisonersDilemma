package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class nationalIranianOilCompany extends Company {
	public nationalIranianOilCompany(ArrayList<Location> myLocation, World myWorld, double myPrice, double myQuantity) {
		super(110000000, myLocation, Color.GREEN, 2.9, "Iran", true, myPrice, myQuantity);
	}
	
	public nationalIranianOilCompany() {
		super();
		myBudget = 110000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.GREEN;
		myMarketShare = 2.9;
		myCountry = "Iran";
		typeOfCompany = true;
		myPrice = 75.01;
		myQuantity = 10000000.0;
	}
	
}
