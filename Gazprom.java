package prisonersDilemma;
import java.awt.Color;

public class Gazprom extends oilCompany {
	
	public Gazprom(Location myLocation, World myWorld, int myInfluence, double myPrice, int myQuantity) {
		super(118000000, myLocation, Color.BLACK, myWorld, myInfluence, "Russia", true, myPrice, myQuantity);
	}
}