package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class ONGC extends oilCompany {
	
	public ONGC(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(127000000, myLocation, Color.ORANGE, myWorld, 3, "India", false, myPrice, myQuantity);
	}

}

