package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Gazprom extends Company {

	public Gazprom() {
		super();
		myBudget = 118000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.BLACK;
		myMarketShare = 3;
		myCountry = "Russia";
		typeOfCompany = true;
		myPrice = 71.7;
	}
}
