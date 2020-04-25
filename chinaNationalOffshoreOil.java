package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class chinaNationalOffshoreOil extends Company {
	
	public chinaNationalOffshoreOil(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(98000000, myLocation, Color.RED, 2.7, "China", true, myPrice, myQuantity);
	}

	public chinaNationalOffshoreOil() {
		super();
		myBudget = 98000000;
		myLocations = new ArrayList<Location>();
		myColor = Color.RED;
		myMarketShare = 2.7;
		myCountry = "China";
		typeOfCompany = true;
		myPrice = myPrice;
		myQuantity = myQuantity;
	}
	
}
	
	
//	public void reproduce() {
//		int x = Location.getX();
//		int newX = (Location.getX() + 1);
//		int newY = (Location.getY()); 
//		myWorld.getCreatureList().add(new chinaNationalOffshoreOil(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//	}

