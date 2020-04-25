package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class marathonPetroleum extends Company {
	public marathonPetroleum(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(97000000, myLocation, Color.CYAN, 2.6, "United States", false, myPrice, myQuantity);
	}
	
	public marathonPetroleum() {
		super();
		myBudget = 97000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.CYAN;
		myMarketShare = 2.6;
		myCountry = "United States";
		typeOfCompany = false;
		myPrice = myPrice;
		myQuantity = myQuantity;
	}
}
