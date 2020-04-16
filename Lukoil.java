package prisonersDilemma;
import java.awt.Color;

public class Lukoil extends oilCompany {
	
	public Lukoil(Location myLocation, World myWorld, int myInfluence, double myPrice, int myQuantity) {
		super(128000000, myLocation, Color.BLACK, myWorld, myInfluence, "Russia", true, myPrice, myQuantity);
	}
}

