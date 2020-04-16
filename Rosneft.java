import java.awt.Color;

public class Rosneft extends oil {
	
	public Rosneft(int myBudget, Location myLocation, Color myColor, World myWorld, int myInfluence, String typeOfCompany) {
		super(myBudget, myLocation, myColor, myWorld, myInfluence, typeOfCompany);
		typeOfCompany = "collusive";
		myBudget = 118000000;
		myCountry = "Russia";
		myColor = Color.BLACK;
	}
	
	public boolean typeOfCompany() {
		if (typeOfCompany == "collusive") {
			return true;
		}
		return false;
	}
	
//	public void reproduce() {
//		int x = Location.getX();
//		int newX = (Location.getX() + 1);
//		int newY = (Location.getY()); 
//		myWorld.getCreatureList().add(new Rosneft(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//	}

}
