package prisonersDilemma;


import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class WorldController extends GraphicsProgram {
	
	private World theWorld;
	private GCanvas theWorldCanvas;
	public static final int APPLICATION_WIDTH = 1200;
	public static final int APPLICATION_HEIGHT = 800;
	
	public void run(){	
		setUpWorld();
		runWorld();
		makeCompanyLabel(1);
	}
	
	public void init(){
	    resize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}
	
	public void setUpWorld(){
		theWorld = new World(30,26);
		//theWorld.getoilCompanyList().add( new Grass( new Location(3,6), theWorld ));
		//theWorld.getoilCompanyList().add( new Grass( new Location(4,6), theWorld ));
		theWorldCanvas = this.getGCanvas();
	}
	
	public void runWorld(){
		drawWorld();
		for(int i=0; i<3; i++){
			theWorld.nextBusinessQuarter();
			pause(500);
			drawWorld();
		}
	}	
	
	public void drawWorld(){
		drawBlankWorld();
	//	drawCreatures();
	}
	
	public void drawBlankWorld(){
		for(int row = 0 ; row<theWorld.getWidth(); row++)
			for(int col=0; col<theWorld.getHeight(); col++){
				GRect r = new GRect(row*30, col*30, 30, 30);
				r.setFillColor(Color.WHITE);
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
	}
	
//	public void drawCreatures(){
//		for(Company x: theWorld.getoilCompanyList()){
//			GRect r = new GRect (x.getMyLocation().getX()*10, x.getMyLocation().getY()*10,10,10);
//			r.setFillColor(x.getMyColor());
//			r.setFilled(true);
//			theWorldCanvas.add(r);
//		}
//	}
	
	public void listCompanies() {
		for (int numCompanies = 0; numCompanies < theWorld.oilCompanyList.size(); numCompanies++) {
			
		}
	}
	
	public void makeCompanyLabel(int companyNum) {
		GRect r = new  GRect(990, (companyNum*15) + (companyNum*10) + 50, 15, 15);
		r.setFillColor(theWorld.oilCompanyList.get(companyNum).getMyColor());
		r.setFilled(true);
		theWorldCanvas.add(r);
		
		GLabel name = new GLabel(getActualName(companyNum), 1000, (companyNum*15) + (companyNum*10) + 50);
		theWorldCanvas.add(name);
		
		GLabel revenue = new GLabel("" + theWorld.oilCompanyList.get(companyNum).getMyBudget(), 990, (companyNum*15) + (companyNum*10) + 55);
		theWorldCanvas.add(revenue);
	}
	
	public String getActualName(int companyNum) {
		if (companyNum == 0) {
			return("British Petroleum");
		} else if (companyNum == 1) {
			return("Chevron");
		} else if (companyNum == 2) {
			return("China National");
		} else if (companyNum == 3) {
			return("CNPC");
		} else if (companyNum == 4) {
			return("Exxon");
		} else if (companyNum == 5) {
			return("Gazprom");
		} else if (companyNum == 6) {
			return("JX Holdings");
		} else if (companyNum == 7) {
			return("Lukoil");
		} else if (companyNum == 8) {
			return("Marathon Petroleum");
		} else if (companyNum == 9) {
			return("National Iranian");
		} else if (companyNum == 10) {
			return("ONGC");
		} else if (companyNum == 11) {
			return("Pemex");
		} else if (companyNum == 12) {
			return("Petrobas");
		} else if (companyNum == 13) {
			return("Phillips 66");
		} else if (companyNum == 14) {
			return("Rosneft");
		} else if (companyNum == 15) {
			return("Saudi Aramco");
		} else if (companyNum == 16) {
			return("Shell");
		} else if (companyNum == 17) {
			return("Sinopec");
		} else if (companyNum == 18) {
			return("Total S.A.");
		} else {
			return("Valero");
		}
	}
}
