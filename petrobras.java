package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

public class petrobras extends oilCompany {
	
	public petrobras(ArrayList<Location> myLocation, World myWorld, double myPrice, int myQuantity) {
		super(950000000, myLocation, Color.YELLOW, myWorld, 2.5, "Brazil", true, myPrice, myQuantity);
	}

}


