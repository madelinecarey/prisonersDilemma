package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class Gazprom extends oilCompany {
	
	public Gazprom(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(118000000, myLocation, Color.BLACK, myWorld, 3, "Russia", true, myPrice, myQuantity);
	}
}
