package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Valero extends Company {
	Color Cyan = new Color (101,191,172);
	
	public Valero() {
		super();
		myBudget = 11.7;
		myLocations = new ArrayList<Location>();
		myColor = Cyan;
		myMarketShare = 3.1;
		myCountry = "United States";
		typeOfCompany = false;
		myPrice = 55.99;
		myInputCost = 50.99;
}
	
}
