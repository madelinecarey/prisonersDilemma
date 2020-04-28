package prisonersDilemma;

import java.awt.Color;
import java.awt.Font;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class WorldController extends GraphicsProgram {

	private World theWorld;
	private GCanvas theWorldCanvas;
	GLabel previousTotalGDP;
	GLabel currentTotalGDP;
	GLabel businessQuarter;
	public static final int APPLICATION_WIDTH = 1200;
	public static final int APPLICATION_HEIGHT = 800;

	public void run() {
		setUpWorld();
		runWorld();
		makeCompanyLabel(1);
	}

	public void init() {
		resize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}

	public void setUpWorld() {
		theWorld = new World(60, 54);
		theWorldCanvas = this.getGCanvas();
		theWorld.setPreviousTotalGDP(0.0);
		addLabels();
		drawWorld();
		
		theWorld.addCompanies();
		theWorld.makeAgreements();
		theWorld.findPrices();
		theWorld.newBudgets();
		theWorld.newMarketShares();
		theWorld.distributeMarket();
	}

	public void runWorld() {
		for (int i = 0; i <= 20; i++) { // runs for 5 years
			theWorld.nextBusinessQuarter();
			pause(1000);
			drawWorld();
		}
	}

	public void drawWorld() {
		drawBlankWorld();
		removeLabels();
		addLabels();
		colorSquares();
	}

	public void drawBlankWorld() {
		for (int row = 0; row < theWorld.getWidth(); row++)
			for (int col = 0; col < theWorld.getHeight(); col++) {
				GRect r = new GRect(row * 15, col * 15, 15, 15);
				r.setFillColor(Color.WHITE);
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
	}
	
	public void addLabels() {
		previousTotalGDP = new GLabel("Previous Total GDP: $" + theWorld.getPreviousTotalGDP());
		currentTotalGDP = new GLabel("Current Total GDP: $" + theWorld.getCurrentTotalGDP());
		businessQuarter = new GLabel("Current Business Quarter: " + theWorld.getBusinessQuarter());
		
		businessQuarter.setLocation(APPLICATION_WIDTH - 270, 50);
		previousTotalGDP.setLocation(APPLICATION_WIDTH - 270, 100);
		currentTotalGDP.setLocation(APPLICATION_WIDTH - 270, 150);
		
		Font a = new Font ("TimesRoman", Font.PLAIN, 15);
		Font b = new Font ("TimesRoman", Font.BOLD, 15);
		previousTotalGDP.setFont(a);
		currentTotalGDP.setFont(b);
		businessQuarter.setFont(a);
		
		theWorldCanvas.add(previousTotalGDP);
		theWorldCanvas.add(currentTotalGDP);
		theWorldCanvas.add(businessQuarter);
	}
	
	public void removeLabels() {
		theWorldCanvas.remove(previousTotalGDP);
		theWorldCanvas.remove(currentTotalGDP);
		theWorldCanvas.remove(businessQuarter);
	}

	public void colorSquares() {
		for (Company x : theWorld.getoilCompanyList()) {
			for (Location l : x.getMyLocations()) {
				GRect r = new GRect(l.getX() * 15, l.getY() * 15, 15, 15);
				r.setFillColor(x.getMyColor());
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
		}
	}

	public void makeCompanyLabel(int companyNum) {
		GRect r = new GRect(990, (companyNum * 15) + (companyNum * 10) + 50, 15, 15);
		r.setFillColor(theWorld.oilCompanyList.get(companyNum).getMyColor());
		r.setFilled(true);
		theWorldCanvas.add(r);

		GLabel name = new GLabel(getActualName(companyNum), 1000, (companyNum * 15) + (companyNum * 10) + 50);
		theWorldCanvas.add(name);

		GLabel revenue = new GLabel("" + theWorld.oilCompanyList.get(companyNum).getMyBudget(), 990,
				(companyNum * 15) + (companyNum * 10) + 55);
		theWorldCanvas.add(revenue);
	}

	public String getActualName(int companyNum) {
		if (companyNum == 0) {
			return ("British Petroleum");
		} else if (companyNum == 1) {
			return ("Chevron");
		} else if (companyNum == 2) {
			return ("China National");
		} else if (companyNum == 3) {
			return ("CNPC");
		} else if (companyNum == 4) {
			return ("Engie");
		} else if (companyNum == 5) {
			return ("Exxon");
		} else if (companyNum == 6) {
			return ("Gazprom");
		} else if (companyNum == 7) {
			return ("JX Holdings");
		} else if (companyNum == 8) {
			return ("Lukoil");
		} else if (companyNum == 9) {
			return ("Marathon Petroleum");
		} else if (companyNum == 10) {
			return ("National Iranian");
		} else if (companyNum == 11) {
			return ("ONGC");
		} else if (companyNum == 12) {
			return ("Pemex");
		} else if (companyNum == 13) {
			return ("Petrobas");
		} else if (companyNum == 14) {
			return ("Phillips 66");
		} else if (companyNum == 15) {
			return ("Rosneft");
		} else if (companyNum == 16) {
			return ("Saudi Aramco");
		} else if (companyNum == 17) {
			return ("Shell");
		} else if (companyNum == 18) {
			return ("Sinopec");
		} else if (companyNum == 19) {
			return ("Total S.A.");
		} else {
			return ("Valero");
		}
	}
}
