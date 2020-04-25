package prisonersDilemma;


import java.awt.Color;
import java.util.ArrayList;

public abstract class Company {

	protected double myBudget;
	protected ArrayList<Location> myLocations;
	protected Color myColor;
	protected boolean alive;
	protected double myMarketShare;
	protected String myCountry;
	double myPrice;
	int myQuantity;
	protected boolean typeOfCompany; //True if collusive, false if defector

	// lifeform constructors
	public Company(double myBudget, ArrayList<Location> myLocation, Color myColor, double myMarketShare, String myCountry, boolean typeOfCompany, double myPrice, int myQuantity) {
		super();
		this.myBudget = myBudget;
		this.myLocations = myLocation;
		this.myColor = myColor;
		this.myMarketShare = myMarketShare;
		this.myCountry = myCountry;
		this.typeOfCompany = typeOfCompany;
		this.myPrice = myPrice;
		this.myQuantity = myQuantity;
		alive = true;
	}

	public Company() {
		super();
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

	public ArrayList<Location> getMyLocation() {
		return myLocations;
	}

	public void setMyLocation(ArrayList<Location> myLocation) {
		this.myLocations = myLocation;
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
	
	public double getMyPrice() {
		return myPrice;
	}

	public void setMyPrice(double myPrice) {
		this.myPrice = myPrice;
	}
	
	public int getMyQuantity() {
		return myQuantity;
	}

	public void setMyQuantity(int myQuantity) {
		this.myQuantity = myQuantity;
	}
	
	@Override
	public String toString() {
		return "LifeForm [myLifeSpan=" + myBudget + ", myLocation="
				+ myLocations + ", myColor=" + myColor + "]";
	}
}