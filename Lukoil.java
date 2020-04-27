package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Lukoil extends Company {
	Color Black = new Color (36,31,38)

	public Lukoil() {
		super();
		myBudget = 128000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.Black;
		myMarketShare = 3.3;
		myCountry = "Russia";
		typeOfCompany = true;
		myPrice = 71.7;
		myInputCost = 66.7;
	}
}

