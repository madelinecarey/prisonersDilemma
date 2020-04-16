package prisonersDilemma;

import java.awt.Color;

public abstract class oilCompany extends Company {
	
	double myPrice;
	int myQuantity;

	public oilCompany(double myBudget, Location myLocation, Color myColor, World myWorld, int myInfuence, String myCountry, boolean typeOfCompany, double myPrice, int myQuantity) {
		super(myBudget, myLocation, myColor, myWorld, myInfuence, myCountry, typeOfCompany);
		this.myPrice = myPrice;
		this.myQuantity = myQuantity;
	}

	public double getPrice() {
		return myPrice;
	}
	
	public void setPrice(double myPrice) {
		this.myPrice = myPrice;
	}
	
	public int getQuantity() {
		return myQuantity;
	}
	
	public void setQuantity(int myQuantity) {
		this.myQuantity = myQuantity;
	}
}
