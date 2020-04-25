package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class BP extends Company {
	public BP(ArrayList<Location> myLocation, double myPrice, int myQuantity) {
		super(303000000, myLocation, Color.BLUE, 7.9, "United Kingdom", false, myPrice, myQuantity);
	}

	public BP() {
		super();
		myBudget = 303000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.BLUE;
		myMarketShare = 7.9;
		myCountry = "United Kingdom";
		typeOfCompany = false;
		myPrice = myPrice;
		myQuantity = myQuantity;
	}

	
	
//	public void reproduce() {
//		int x = Location.getX();
//		int newX = (Location.getX() + 1);
//		int newY = (Location.getY()); 
//		myWorld.getCreatureList().add(new BP(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//	}

}
