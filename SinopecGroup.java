import java.awt.Color;

public class SinopecGroup extends oil {
	
	public SinopecGroup(int myBudget, Location myLocation, Color myColor, World myWorld, int myInfluence, String typeOfCompany) {
		super(myBudget, myLocation, myColor, myWorld, myInfluence, typeOfCompany);
		typeOfCompany = "defective";
		myBudget = 414000000;
		myCountry = "China";
		myColor = Color.RED;
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
//		myWorld.getCreatureList().add(new SinopecGroup(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//	}


}
