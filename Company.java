package prisonersDilemma;
import java.awt.Color;
import java.util.ArrayList;

public abstract class Company {

	protected World myWorld;
	protected double myBudget;
	protected Location myLocation;
	protected Color myColor;
	protected boolean alive;
	protected int myInfluence;
	protected String myCountry;
	protected boolean typeOfCompany; //True if collusive, false if defector

	// lifeform constructors
	public Company(double myBudget, Location myLocation, Color myColor, World myWorld, int myInfluence, String myCountry, boolean typeOfCompany) {
		super();
		this.myBudget = myBudget;
		this.myLocation = myLocation;
		this.myColor = myColor;
		this.myWorld = myWorld;
		this.myInfluence = myInfluence;
		this.myCountry = myCountry;
		this.typeOfCompany = typeOfCompany;
		alive = true;
	}

	public Company(Location myLocation, World myWorld) {
		super();
		this.myWorld = myWorld;
		this.myLocation = myLocation;
		alive = true;
	}

	/* all the basic lifeform functions
	 * 		getOlder
	 * 		reproduce
	 */

	// we all age the same, time clicks forward and we all age one unit of time
	public void checkIfBankrupt(){
		if (myBudget <= 0) {
			alive = false;
		}
	}

	// to be alive you have to be able to reproduce....
	public void reproduce() {
	}

	public boolean isBankrupt(){
		return !alive;
	}

	// getter and setters (aka accessors and mutators)
	public double getMyBudget() {
		return myBudget;
	}

	public void setMyBudget(int myLifeSpan) {
		this.myBudget = myLifeSpan;
	}

	public Location getMyLocation() {
		return myLocation;
	}

	public void setMyLocation(Location myLocation) {
		this.myLocation = myLocation;
	}

	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}
	
	public String getCountry() {
		return myCountry;
	}
	
	public void setCountry(String myCountry) {
		this.myCountry = myCountry;
	}

	public String getTypeOfCompanyString() {
		if (typeOfCompany == true) {
			return "collusive";
		}
		return "defector";
	}

	public boolean getTypeofCompanyBoolean() {
		return typeOfCompany;
	}

	public void setTypeOfCompany(boolean typeOfCompany) {
		this.typeOfCompany = typeOfCompany;
	}

	@Override
	public String toString() {
		return "LifeForm [myLifeSpan=" + myBudget + ", myLocation="
				+ myLocation + ", myColor=" + myColor + "]";
	}
}