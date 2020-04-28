package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class ONGC extends Company {
	Color Orange = new Color (240,144,19);

	public ONGC() {
		super();
		myBudget = 127000000;
		myLocations = new ArrayList<Location>();
		myColor = Orange;
		myMarketShare = 3.3;
		myCountry = "India";
		typeOfCompany = false;
		myPrice = 69.88;
		myInputCost = 64.88;
	}
}

