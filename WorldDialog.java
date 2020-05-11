package prisonersDilemma;

import acm.program.*;

public class WorldDialog extends DialogProgram{
	
	
	public String getCompanyType() {
		return(readLine("Enter 'collusive' or 'defective': "));
	}
	
	public double getBudget() {
		String budget = readLine("Enter budget between 10.0 and 100.0: ");
		while (Double.parseDouble(budget) < 10.0 || Double.parseDouble(budget) > 100.0) {
			readLine("Invalid Input: Enter budget between 10.0 and 100.0: ");
		}
		return(Double.parseDouble(budget));
	}

	public boolean evenPlayingField() {
		String even = (readLine("Do you want the playing field to be even? Enter 'yes' or 'no'"));
		if(even.equals("yes")) {
			return true;
		}
		return false;
	}
}
