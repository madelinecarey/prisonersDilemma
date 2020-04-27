package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class CNPC extends Company {
	public CNPC() {
		super();
		myBudget = 392000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.RED;
		myMarketShare = 10;
		myCountry = "China";
		typeOfCompany = true;
		myPrice = 72.22;
		myInputCost = 57.22;
	}
}


