package prisonersDilemma;
import java.awt.Color;

public class BP extends oilCompany {
	
	public BP(Location myLocation, World myWorld, int myInfluence, double myPrice, int myQuantity) {
		super(303000000, myLocation, Color.BLUE, myWorld, myInfluence, "United Kingdom", false, myPrice, myQuantity);
	}
	
//	public void reproduce() {
//		int x = Location.getX();
//		int newX = (Location.getX() + 1);
//		int newY = (Location.getY()); 
//		myWorld.getCreatureList().add(new BP(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//	}

}