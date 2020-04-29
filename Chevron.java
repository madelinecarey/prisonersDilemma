package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Chevron extends Company {
	Color Cyan = new Color (68,199,197);
	
	public Chevron() {
		super();
		myBudget = 15.9;
		myLocations = new ArrayList<Location>();
		myColor = Cyan;
		myMarketShare = 4.1;
		myCountry = "United States";
		typeOfCompany = false;
		myPrice = 55.99;
		myInputCost = 50.99;
	}

}
