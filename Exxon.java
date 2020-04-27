package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Exxon extends Company {
	Color Cyan = new Color (103,199,197)
	
	public Exxon() {
		super();
		myBudget = 290000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.Cyan;
		myMarketShare = 7.4;
		myCountry = "United States";
		typeOfCompany = false;
		myPrice = 55.99;
		myInputCost = 50.99;
	}
}
