import java.awt.Color;

public class sprint extends cellService {
	
	public sprint(int myBudget, Location myLocation, Color myColor, World myWorld, int myInfluence, String typeOfCompany) {
		super(myBudget, myLocation, myColor, myWorld, myInfluence, typeOfCompany);
		typeOfCompany = "defective";
	}
	
	public boolean typeOfCompany() {
		if (typeOfCompany == "collusive") {
			myColor = Color.orange;
			return true;
		}
		myColor = Color.yellow;
		return false;
	}
	
//	public void reproduce() {
//		int x = Location.getX();
//		int newX = (Location.getX() + 1);
//		int newY = (Location.getY()); 
//		myWorld.getCreatureList().add(new sprint(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//	}


}

