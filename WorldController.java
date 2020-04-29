package prisonersDilemma;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class WorldController extends GraphicsProgram {

	private World theWorld;
	private GCanvas theWorldCanvas;
	GLabel previousTotalGDP;
	GLabel currentTotalGDP;
	GLabel businessQuarter;
	GLabel companies;
	GLabel BP;
	GLabel Chevron;
	GLabel CNOO;
	GLabel CNPC;
	GLabel Engie;
	GLabel Exxon;
	GLabel Gazprom;
	GLabel JXH;
	GLabel Lukoil;
	GLabel MP;
	GLabel NIOC;
	GLabel ONGC;
	GLabel Pemex;
	GLabel Petrobras;
	GLabel P66;
	GLabel Rosneft;
	GLabel SA;
	GLabel Shell;
	GLabel SG;
	GLabel TSA;
	GLabel Valero;
	GLabel bankrupt;
	public static final int APPLICATION_WIDTH = 1300;
	public static final int APPLICATION_HEIGHT = 820;

	public void run() {
		setUpWorld();
		runWorld();
//		makeCompanyLabel(1);
	}

	public void init() {
		resize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}

	public void setUpWorld() {
		theWorld = new World(60, 54);
		theWorldCanvas = this.getGCanvas();
		theWorld.setPreviousTotalGDP(0.0);
		
		theWorld.addCompanies();
		theWorld.newMarketShares();
		theWorld.distributeMarket();
		
		addLabels();
		drawWorld();
	}

	public void runWorld() {
		for (int i = 0; i < 12; i++) { // runs for 5 years
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
		for (int row = 0; row < 63; row++)
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
		bankrupt = new GLabel("Total Bankrupt Companies: " + theWorld.getBankruptCompaniesSize());
		
		businessQuarter.setLocation(APPLICATION_WIDTH - 300, 50);
		previousTotalGDP.setLocation(APPLICATION_WIDTH - 300, 100);
		currentTotalGDP.setLocation(APPLICATION_WIDTH - 300, 150);
		bankrupt.setLocation(APPLICATION_WIDTH - 300, 670);
		
		Font a = new Font ("TimesRoman", Font.PLAIN, 15);
		Font b = new Font ("TimesRoman", Font.BOLD, 15);
		previousTotalGDP.setFont(a);
		currentTotalGDP.setFont(b);
		businessQuarter.setFont(a);
		bankrupt.setFont(b);
		
		theWorldCanvas.add(previousTotalGDP);
		theWorldCanvas.add(currentTotalGDP);
		theWorldCanvas.add(businessQuarter);
		theWorldCanvas.add(bankrupt);
		addCompanyLabels();
	}
	
	public void removeLabels() {
		theWorldCanvas.remove(previousTotalGDP);
		theWorldCanvas.remove(currentTotalGDP);
		theWorldCanvas.remove(businessQuarter);
		theWorldCanvas.remove(bankrupt);
		theWorldCanvas.remove(companies);
		theWorldCanvas.remove(BP);
		theWorldCanvas.remove(Chevron);
		theWorldCanvas.remove(CNOO);
		theWorldCanvas.remove(CNPC);
		theWorldCanvas.remove(Engie);
		theWorldCanvas.remove(Exxon);
		theWorldCanvas.remove(Gazprom);
		theWorldCanvas.remove(JXH);
		theWorldCanvas.remove(Lukoil);
		theWorldCanvas.remove(MP);
		theWorldCanvas.remove(NIOC);
		theWorldCanvas.remove(ONGC);
		theWorldCanvas.remove(Pemex);
		theWorldCanvas.remove(Petrobras);
		theWorldCanvas.remove(P66);
		theWorldCanvas.remove(Rosneft);
		theWorldCanvas.remove(SA);
		theWorldCanvas.remove(Shell);
		theWorldCanvas.remove(SG);
		theWorldCanvas.remove(TSA);
		theWorldCanvas.remove(Valero);
	}
	
	public void addCompanyLabels() {
		ArrayList<Company> list = theWorld.getoilCompanyList();
		companies = new GLabel("List of Companies and their Budgets");
		BP = new GLabel("British Petroleum: " + list.get(0).getMyBudget());
		Chevron = new GLabel("Chevron: " + list.get(1).getMyBudget());
		CNOO = new GLabel("China National Offshow Oil: " + list.get(2).getMyBudget());
		CNPC = new GLabel("China National Petroleum Corporation: " + list.get(3).getMyBudget());
		Engie = new GLabel("Engie: " + list.get(4).getMyBudget());
		Exxon = new GLabel("Exxon: " + list.get(5).getMyBudget());
		Gazprom = new GLabel("Gazprom: " + list.get(6).getMyBudget());
		JXH = new GLabel("JXHoldings: " + list.get(7).getMyBudget());
		Lukoil = new GLabel("Lukoil: " + list.get(8).getMyBudget());
		MP = new GLabel("Marathon Petroleum: " + list.get(9).getMyBudget());
		NIOC = new GLabel("National Iranian Oil Company: " + list.get(10).getMyBudget());
		ONGC = new GLabel("Oil and Natural Gas Corporation: " + list.get(11).getMyBudget());
		Pemex = new GLabel("Pemex: " + list.get(12).getMyBudget());
		Petrobras = new GLabel("Petrobras: " + list.get(13).getMyBudget());
		P66 = new GLabel("Phillips 66: " + list.get(14).getMyBudget());
		Rosneft = new GLabel("Rosneft: " + list.get(15).getMyBudget());
		SA = new GLabel("Saudi Aramco: " + list.get(16).getMyBudget());
		Shell = new GLabel("Shell: " + list.get(17).getMyBudget());
		SG = new GLabel("Sinopec Group: " + list.get(18).getMyBudget());
		TSA = new GLabel("Total SA: " + list.get(19).getMyBudget());
		Valero = new GLabel("Valero: " + list.get(20).getMyBudget());
		
		companies.setLocation(APPLICATION_WIDTH - 300, 200);
		BP.setLocation(APPLICATION_WIDTH - 300, 220);
		Chevron.setLocation(APPLICATION_WIDTH - 300, 240);
		CNOO.setLocation(APPLICATION_WIDTH - 300, 260);
		CNPC.setLocation(APPLICATION_WIDTH - 300, 280);
		Engie.setLocation(APPLICATION_WIDTH - 300, 300);
		Exxon.setLocation(APPLICATION_WIDTH - 300, 320);
		Gazprom.setLocation(APPLICATION_WIDTH - 300, 340);
		JXH.setLocation(APPLICATION_WIDTH - 300, 360);
		Lukoil.setLocation(APPLICATION_WIDTH - 300, 380);
		MP.setLocation(APPLICATION_WIDTH - 300, 400);
		NIOC.setLocation(APPLICATION_WIDTH - 300, 420);
		ONGC.setLocation(APPLICATION_WIDTH - 300, 440);
		Pemex.setLocation(APPLICATION_WIDTH - 300, 460);
		Petrobras.setLocation(APPLICATION_WIDTH - 300, 480);
		P66.setLocation(APPLICATION_WIDTH - 300, 500);
		Rosneft.setLocation(APPLICATION_WIDTH - 300, 520);
		SA.setLocation(APPLICATION_WIDTH - 300, 540);
		Shell.setLocation(APPLICATION_WIDTH - 300, 560);
		SG.setLocation(APPLICATION_WIDTH - 300, 580);
		TSA.setLocation(APPLICATION_WIDTH - 300, 600);
		Valero.setLocation(APPLICATION_WIDTH - 300, 620);
		
		Font a = new Font ("TimesRoman", Font.PLAIN, 15);
		Font b = new Font ("TimesRoman", Font.PLAIN, 10);
		companies.setFont(a);
		BP.setFont(b);
		Chevron.setFont(b);
		CNOO.setFont(b);
		CNPC.setFont(b);
		Engie.setFont(b);
		Exxon.setFont(b);
		Gazprom.setFont(b);
		JXH.setFont(b);
		Lukoil.setFont(b);
		MP.setFont(b);
		NIOC.setFont(b);
		ONGC.setFont(b);
		Pemex.setFont(b);
		Petrobras.setFont(b);
		P66.setFont(b);
		Rosneft.setFont(b);
		SA.setFont(b);
		Shell.setFont(b);
		SG.setFont(b);
		TSA.setFont(b);
		Valero.setFont(b);
		
		BP.setColor(list.get(0).getMyColor());
		Chevron.setColor(list.get(1).getMyColor());
		CNOO.setColor(list.get(2).getMyColor());
		CNPC.setColor(list.get(3).getMyColor());
		Engie.setColor(list.get(4).getMyColor());
		Exxon.setColor(list.get(5).getMyColor());
		Gazprom.setColor(list.get(6).getMyColor());
		JXH.setColor(list.get(7).getMyColor());
		Lukoil.setColor(list.get(8).getMyColor());
		MP.setColor(list.get(9).getMyColor());
		NIOC.setColor(list.get(10).getMyColor());
		ONGC.setColor(list.get(11).getMyColor());
		Pemex.setColor(list.get(12).getMyColor());
		Petrobras.setColor(list.get(13).getMyColor());
		P66.setColor(list.get(14).getMyColor());
		Rosneft.setColor(list.get(15).getMyColor());
		SA.setColor(list.get(16).getMyColor());
		Shell.setColor(list.get(17).getMyColor());
		SG.setColor(list.get(18).getMyColor());
		TSA.setColor(list.get(19).getMyColor());
		Valero.setColor(list.get(20).getMyColor());
		
		theWorldCanvas.add(companies);
		theWorldCanvas.add(BP);
		theWorldCanvas.add(Chevron);
		theWorldCanvas.add(CNOO);
		theWorldCanvas.add(CNPC);
		theWorldCanvas.add(Engie);
		theWorldCanvas.add(Exxon);
		theWorldCanvas.add(Gazprom);
		theWorldCanvas.add(JXH);
		theWorldCanvas.add(Lukoil);
		theWorldCanvas.add(MP);
		theWorldCanvas.add(NIOC);
		theWorldCanvas.add(ONGC);
		theWorldCanvas.add(Pemex);
		theWorldCanvas.add(Petrobras);
		theWorldCanvas.add(P66);
		theWorldCanvas.add(Rosneft);
		theWorldCanvas.add(SA);
		theWorldCanvas.add(Shell);
		theWorldCanvas.add(SG);
		theWorldCanvas.add(TSA);
		theWorldCanvas.add(Valero);
	}

	public void colorSquares() { // Take in the locations from the companies and fill the world with the appropriate color
		for (int i = 0; i < theWorld.getoilCompanyList().size(); i++) {
			Company company = theWorld.getoilCompanyList().get(i);
			ArrayList<Location> points = company.getMyLocations();
			for (int j = 0; j < points.size(); j++) {
				Location l = points.get(j);
				GRect r = new GRect(l.getX(), l.getY(), 15, 15); // Each square corresponds to $10000000 in each company's budget
				r.setFillColor(company.getMyColor());
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
		}
	}

/*	public void makeCompanyLabel(int companyNum) {
		GRect r = new GRect(990, (companyNum * 15) + (companyNum * 10) + 50, 15, 15);
		r.setFillColor(theWorld.oilCompanyList.get(companyNum).getMyColor());
		r.setFilled(true);
		theWorldCanvas.add(r);

		GLabel name = new GLabel(getActualName(companyNum), 1000, (companyNum * 15) + (companyNum * 10) + 50);
		theWorldCanvas.add(name);

		GLabel revenue = new GLabel("" + theWorld.oilCompanyList.get(companyNum).getMyBudget(), 990,
				(companyNum * 15) + (companyNum * 10) + 55);
		theWorldCanvas.add(revenue);
	}*/

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
