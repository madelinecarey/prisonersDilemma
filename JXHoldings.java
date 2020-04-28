package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class JXHoldings extends Company {
	Color Purple = new Color (153,89,179);

	
	public JXHoldings() {
		super();
		myBudget = 103000000;
		myLocations = new ArrayList<Location>();
		myColor = Purple;
		myMarketShare = 2.6;
		myCountry = "Japan";
		typeOfCompany = false;
		myPrice = 61.11;
		myInputCost = 56.11;
	}
	
}
