package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Phillips66 extends Company {
	Color Cyan = new Color (73,235,208);

	public Phillips66() {
		super();
		myBudget = 102000000;
		myLocations = new ArrayList<Location>();
		myColor = Cyan;
		myMarketShare = 2.6;
		myCountry = "United States";
		typeOfCompany = false;
		myPrice = 55.99;
		myInputCost = 50.99;
	}

}
