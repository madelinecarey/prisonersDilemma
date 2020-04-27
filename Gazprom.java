package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Gazprom extends Company {
	Color Black = new Color (0,0,0)
	
	public Gazprom() {
		super();
		myBudget = 118000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.Black;
		myMarketShare = 3;
		myCountry = "Russia";
		typeOfCompany = true;
		myPrice = 71.7;
		myInputCost = 66.7;
	}
}
