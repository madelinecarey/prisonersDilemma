package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class BP extends Company {

	public BP() {
		super();
		myBudget = 303000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.BLUE;
		myMarketShare = 7.8;
		myCountry = "United Kingdom";
		typeOfCompany = false;
		myPrice = 61.54;
	}

	
	
//	public void reproduce() {
//		int x = Location.getX();
//		int newX = (Location.getX() + 1);
//		int newY = (Location.getY()); 
//		myWorld.getCreatureList().add(new BP(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//	}

}
