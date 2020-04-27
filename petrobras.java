package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class petrobras extends Company {
	Color Yellow = new Color (240,240,0)

	public petrobras() {
		super();
		myBudget = 950000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.Yellow;
		myMarketShare = 2.4;
		myCountry = "Brazil";
		typeOfCompany = true;
		myPrice = 59.08;
		myInputCost = 54.08;
	}
}
