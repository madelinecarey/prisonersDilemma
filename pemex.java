package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class pemex extends oilCompany {
	
	public pemex(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(85000000, myLocation, Color.DARK_GRAY, myWorld, 2, "Mexico", true, myPrice, myQuantity);
	}


}



