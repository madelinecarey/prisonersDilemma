package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Engie extends Company {

	public Engie() {
		super();
		myBudget = 89000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.LIGHT_GRAY;
		myMarketShare = 2.3;
		myCountry = "France";
		typeOfCompany = true;
		myPrice = 64.0;
		myQuantity = 10000000.0;
	}
}
