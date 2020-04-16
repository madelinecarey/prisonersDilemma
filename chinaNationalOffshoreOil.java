package prisonersDilemma;
import java.awt.Color;

public class chinaNationalOffshoreOil extends oilCompany {
	
	public chinaNationalOffshoreOil(Location myLocation, World myWorld, int myInfluence, double myPrice, int myQuantity) {
		super(98000000, myLocation, Color.RED, myWorld, myInfluence, "China", true, myPrice, myQuantity);
	}
}
	
	
//	public void reproduce() {
//		int x = Location.getX();
//		int newX = (Location.getX() + 1);
//		int newY = (Location.getY()); 
//		myWorld.getCreatureList().add(new chinaNationalOffshoreOil(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//	}


}
