package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class SinopecGroup extends Company {
	Color Red = new Color (145,0,0);

	public SinopecGroup() {
		super();
		myBudget = 41.4;
		myLocations = new ArrayList<Location>();
		myColor = Red;
		myMarketShare = 10.6;
		myCountry = "China";
		typeOfCompany = false;
		myPrice = 72.22;
		myInputCost = 57.22;
}
}
