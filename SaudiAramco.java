package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class SaudiAramco extends Company {
	Color Green = new Color (7,145,0);

	public SaudiAramco() {
		super();
		myBudget = 355000000;
		myLocations = new ArrayList<Location>();
		myColor = Green;
		myMarketShare = 9.1;
		myCountry = "Saudi Arabia";
		typeOfCompany = true;
		myPrice = 57.22;
		myInputCost = 52.22;
}
}

