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
	}
	
	public void init(){
	    resize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}
	
	public void setUpWorld(){
		theWorld = new World(65,53);
		//theWorld.getcompanyList().add( new Grass( new Location(3,6), theWorld ));
		//theWorld.getcompanyList().add( new Grass( new Location(4,6), theWorld ));
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
		drawCreatures();
	}
	
	public void drawBlankWorld(){
		for(int row = 0 ; row<theWorld.getWidth(); row++)
			for(int col=0; col<theWorld.getHeight(); col++){
				GRect r = new GRect(row*15, col*15, 15, 15);
				r.setFillColor(Color.WHITE);
				r.setFilled(true);
				theWorldCanvas.add(r);
			}
	}
	
	public void drawCreatures(){
		for(Company x: theWorld.getcompanyList()){
			GRect r = new GRect (x.getMyLocation().getX()*10, x.getMyLocation().getY()*10,10,10);
			r.setFillColor(x.getMyColor());
			r.setFilled(true);
			theWorldCanvas.add(r);
		}
	}
	
	public void listCompanies() {
		for (int numCompanies = 0; numCompanies < theWorld.companyList.size(); numCompanies++) {
			
		}
	}
	
	public void makeCompanyLabel(int companyNum) {
		GRect r = new  GRect(990, (companyNum*15) + (companyNum*10) + 50, 15, 15);
		r.setFillColor(theWorld.companyList.get(companyNum).getMyColor());
		r.setFilled(true);
		theWorldCanvas.add(r);
		
		GLabel name = new GLabel(getActualName(companyNum), 1000, (companyNum*15) + (companyNum*10) + 50);
		theWorldCanvas.add(name);
	}
	
	public String getActualName(int companyNum) {
		if (companyNum == 0) {
			return("British Petroleum");
		} else if (companyNum == 1) {
			return("Chevron");
		} else if (companyNum == 2) {
			return("China National");
		} else if (companyNum == 1) {
			return("CNPC");
		} else if (companyNum == 1) {
			return("Exxon");
		} else if (companyNum == 1) {
			return("Gazprom");
		} else if (companyNum == 1) {
			return("JX Holdings");
		} else if (companyNum == 1) {
			return("Lukoil");
		} else if (companyNum == 1) {
			return("Marathon Petroleum");
		} else if (companyNum == 1) {
			return("National Iranian");
		} else if (companyNum == 1) {
			return("ONGC");
		} else if (companyNum == 1) {
			return("Pemex");
		} else if (companyNum == 1) {
			return("Petrobas");
		} else if (companyNum == 1) {
			return("Phillips 66");
		} else if (companyNum == 1) {
			return("Rosneft");
		} else if (companyNum == 1) {
			return("Saudi Aramco");
		} else if (companyNum == 1) {
			return("Shell");
		} else if (companyNum == 1) {
			return("Sinopec");
		} else if (companyNum == 1) {
			return("Total S.A.");
		} else {
			return("Valero");
		}
	}
}
