package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Lukoil extends Company {
	Color Black = new Color (36,31,38);

	public Lukoil() {
		super();
		myBudget = 12.8;
		myLocations = new ArrayList<Location>();
		myColor = Black;
		myMarketShare = 3.3;
		myCountry = "Russia";
		typeOfCompany = true;
		myPrice = 71.7;
		myInputCost = 66.7;
	}
}

