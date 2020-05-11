package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class marathonPetroleum extends Company {
	Color Cyan = new Color (106,173,164);

	public marathonPetroleum() {
		super();
		myBudget = 97.0;
		myLocations = new ArrayList<Location>();
		myColor = Cyan;
		myMarketShare = 2.5;
		myCountry = "United States";
		typeOfCompany = false;
		myPrice = 55.99;
		myInputCost = 50.99;
	}
}
