package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Lukoil extends oilCompany {
	
	public Lukoil(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(128000000, myLocation, Color.BLACK, myWorld, 3.4, "Russia", true, myPrice, myQuantity);
	}
}

