package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class pemex extends Company {
	Color Light_Gray = new Color (204,204,204);

	public pemex() {
		super();
		myBudget = 85000000;
		myLocations = new ArrayList<Location>();
		myColor = Light_Gray;
		myMarketShare = 2.1;
		myCountry = "Mexico";
		typeOfCompany = true;
		myPrice = 61.61;
		myInputCost = 56.61;
	}
}



