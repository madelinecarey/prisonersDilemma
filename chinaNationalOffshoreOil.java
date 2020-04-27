package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class chinaNationalOffshoreOil extends Company {
	Color Red = new Color (242,53,53)
	
	public chinaNationalOffshoreOil() {
		super();
		myBudget = 98000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.Red;
		myMarketShare = 2.5;
		myCountry = "China";
		typeOfCompany = true;
		myPrice = 72.22;
		myInputCost = 67.22;
	}
	
}
	
	
//	public void reproduce() {
//		int x = Location.getX();
//		int newX = (Location.getX() + 1);
//		int newY = (Location.getY()); 
//		myWorld.getCreatureList().add(new chinaNationalOffshoreOil(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//	}

