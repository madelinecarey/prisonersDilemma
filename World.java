//package prisonersDilemma;

import java.util.ArrayList;

public class World {
	
	private int width;
	private int height;
	private double previousTotalGDP;
	private double currentTotalGDP;
	public ArrayList<oilCompany> oilCompanyList;
	
	public World(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.previousTotalGDP = 0.0;
		this.currentTotalGDP = 0.0;
		this.oilCompanyList = new ArrayList<oilCompany>();
	}
	
	public void nextBusinessQuarter(){
		previousTotalGDP = currentTotalGDP;
		makeNewCompanies();
		companiesInteract();
		purgeTheBankrupt();		
	}
	
	public void listCompanies() {
	}
	
	public void makeNewCompanies() {
		
		int currentSizeOfoilCompanyList = oilCompanyList.size();
		System.out.println("size of list is "+currentSizeOfoilCompanyList);
		for(int i=0; i< currentSizeOfoilCompanyList; i++) {
			oilCompanyList.get(i).reproduce();
		}
	}
	
	public void purgeTheBankrupt(){
		int i=0;
		while(i<oilCompanyList.size()){
			if(oilCompanyList.get(i).isBankrupt())
				oilCompanyList.remove(i);
			else
				i++;
		}	
	}
	
	public void companiesInteract(){
		//let the companies interact with each other
	}
	
	public void calculateTotalGDP() {
		currentTotalGDP = 0.0;
		for(int i = 0; i < oilCompanyList.size(); i++) {
			double companyPrice = oilCompanyList.get(i).getPrice();
			double companyQuantity = Double.valueOf(oilCompanyList.get(i).getQuantity());
			double companyRevenue = companyPrice * companyQuantity;
			currentTotalGDP += companyRevenue;
		}
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public ArrayList<oilCompany> getoilCompanyList() {
		return oilCompanyList;
	}
	public void setoilCompanyList(ArrayList<oilCompany> oilCompanyList) {
		this.oilCompanyList = oilCompanyList;
	}

	@Override
	public String toString() {
		return "World [width=" + width + ", height=" + height
				+ ", oilCompanyList=" + oilCompanyList + "]";
	}
}
