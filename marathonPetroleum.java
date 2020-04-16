import java.awt.Color;

public class marathonPetroleum extends oil {
	
	public marathonPetroleum(int myBudget, Location myLocation, Color myColor, World myWorld, int myInfluence, String typeOfCompany) {
		super(myBudget, myLocation, myColor, myWorld, myInfluence, typeOfCompany);
		typeOfCompany = "defective";
		myBudget = 97000000;
		myCountry = "United States";
		myColor = Color.CYAN;
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
//		myWorld.getCreatureList().add(new marathonPetroleum(myBudget, new Location(newX,newY), myColor, myWorld, myInfluence, typeOfCompany));
//	}


}
