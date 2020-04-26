package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class pemex extends Company {
	public pemex(ArrayList<Location> myLocation, World myWorld, double myPrice, double myQuantity) {
		super(85000000, myLocation, Color.DARK_GRAY, 2, "Mexico", true, myPrice, myQuantity);
	}
	
	public pemex() {
		super();
		myBudget = 85000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.DARK_GRAY;
		myMarketShare = 2;
		myCountry = "Mexico";
		typeOfCompany = true;
		myPrice = 61.61;
		myQuantity = 10000000.0;

}
}



