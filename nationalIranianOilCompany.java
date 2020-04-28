package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class nationalIranianOilCompany extends Company {
	Color Green = new Color (91,222,91);

	public nationalIranianOilCompany() {
		super();
		myBudget = 110000000;
		myLocations = new ArrayList<Location>();
		myColor = Green;
		myMarketShare = 2.8;
		myCountry = "Iran";
		typeOfCompany = true;
		myPrice = 75.01;
		myInputCost = 70.01;
	}
	
}
