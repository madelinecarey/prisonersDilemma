package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class CNPC extends Company {
		
	public CNPC(ArrayList<Location> myLocation, World myWorld, double myPrice, double myQuantity) {
		super(392000000, myLocation, Color.RED, 10.4, "China", true, myPrice, myQuantity);
	}

	public CNPC() {
		super();
		myBudget = 392000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.RED;
		myMarketShare = 10.4;
		myCountry = "China";
		typeOfCompany = true;
		myPrice = 72.22;
		myQuantity = 10000000.0;
	}
}


