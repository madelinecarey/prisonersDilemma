
import java.awt.Color;

public class saudiArabia extends oil {
	
	public saudiArabia(int myBudget, Location myLocation, Color myColor, World myWorld, int myInfluence, String typeOfCompany) {
		super(myBudget, myLocation, myColor, myWorld, myInfluence, typeOfCompany);
		typeOfCompany = "defective";
	}
	
	public boolean typeOfCompany() {
		if (typeOfCompany == "collusive") {
			myColor = Color.LIGHT_GRAY;
			return true;
		}
		myColor = Color.DARK_GRAY;
		return false;
	}
	
//	public void reproduce() {
//	int x = Location.getX();
//	int newX = (Location.getX() + 1);
//	int newY = (Location.getY()); 
//	myWorld.getCreatureList().add(new saudiArabia(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//}


}
