package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Rosneft extends Company {
	Color Black = new Color (53,59,58);

	public Rosneft() {
		super();
		myBudget = 118000000;
		myLocations = new ArrayList<Location>();
		myColor = Black;
		myMarketShare = 3;
		myCountry = "Russia";
		typeOfCompany = true;
		myPrice = 71.7;
		myInputCost = 66.7;
}
}

