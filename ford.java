import java.awt.Color;

public class ford extends auto {
	
	public ford(int myBudget, Location myLocation, Color myColor, World myWorld, int myInfluence, String typeOfCompany) {
		super(myBudget, myLocation, myColor, myWorld, myInfluence, typeOfCompany);
		typeOfCompany = "defective";
	}
	
	public boolean typeOfCompany() {
		if (typeOfCompany == "collusive") {
			myColor = Color.red;
			return true;
		}
		myColor = Color.pink;
		return false;
	}e
	
//	public void reproduce() {
//	int x = Location.getX();
//	int newX = (Location.getX() + 1);
//	int newY = (Location.getY()); 
//	myWorld.getCreatureList().add(new ford(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//}


}
