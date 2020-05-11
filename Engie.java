package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Engie extends Company {
	Color Gray = new Color (186,186,186);
	
	public Engie() {
		super();
		myBudget = 89.0;
		myLocations = new ArrayList<Location>();
		myColor = Gray;
		myMarketShare = 2.3;
		myCountry = "France";
		typeOfCompany = true;
		myPrice = 64.0;
		myInputCost = 59;
	}
}
