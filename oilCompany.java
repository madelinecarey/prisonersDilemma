package prisonersDilemma;


import java.awt.Color;
import java.util.ArrayList;

public abstract class oilCompany extends Company {
	
	double myPrice;
	int myQuantity;

	public oilCompany(double myBudget, ArrayList<Location> myLocation, Color myColor, World myWorld, double myMarketShare, String myCountry, boolean typeOfCompany, double myPrice, int myQuantity) {
		super(myBudget, myLocation, myColor, myWorld, myMarketShare, myCountry, typeOfCompany, myPrice);
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
