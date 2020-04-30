package prisonersDilemma;

import java.awt.Color;
import java.util.ArrayList;

import acm.util.RandomGenerator;

public class World {

	private int width;
	private int height;
	private double previousTotalGDP;
	private double currentTotalGDP;
	public int businessQuarter;
	public ArrayList<Company> oilCompanyList;
	public ArrayList<Company> bankruptCompanies;
	public ArrayList<Company> agreement1;
	public ArrayList<Company> agreement2;
	public ArrayList<Company> agreement3;
	public ArrayList<Company> agreement4;
	public ArrayList<Company> agreement5;
	public ArrayList<Company> agreement6;
	public ArrayList<Company> agreement7;
	private RandomGenerator rgen = new RandomGenerator();

	public World(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.previousTotalGDP = 0.0;
		this.currentTotalGDP = 0.0;
		this.businessQuarter = 0;
		this.oilCompanyList = new ArrayList<Company>();
		this.bankruptCompanies = new ArrayList<Company>();
	}

	public void nextBusinessQuarter(){
		businessQuarter++;
		purgeTheBankrupt();
		previousTotalGDP = currentTotalGDP;
		if (businessQuarter % 4 == 0) { // Makes sure prices are adjusted every four years
			adjustPrices();
		}
		makeAgreements();
		findBudgets();
		newBudgets();
		newMarketShares();
		distributeMarket();
		currentTotalGDP = calculateTotalGDP();
	}

	public void addCompanies() {
		oilCompanyList = new ArrayList<Company>();
		BP BP = new BP();
		oilCompanyList.add(BP);
		Chevron Chevron = new Chevron();
		oilCompanyList.add(Chevron);
		chinaNationalOffshoreOil chinaNationalOffshoreOil = new chinaNationalOffshoreOil();
		oilCompanyList.add(chinaNationalOffshoreOil);
		CNPC CNPC = new CNPC();
		oilCompanyList.add(CNPC);
		Engie Engie = new Engie();
		oilCompanyList.add(Engie);
		Exxon Exxon = new Exxon();
		oilCompanyList.add(Exxon);
		Gazprom Gazprom = new Gazprom();
		oilCompanyList.add(Gazprom);
		JXHoldings JXHoldings = new JXHoldings();
		oilCompanyList.add(JXHoldings);
		Lukoil Lukoil = new Lukoil();
		oilCompanyList.add(Lukoil);
		marathonPetroleum marathonPetroleum = new marathonPetroleum();
		oilCompanyList.add(marathonPetroleum);
		nationalIranianOilCompany nationalIranianOilCompany = new nationalIranianOilCompany();
		oilCompanyList.add(nationalIranianOilCompany);
		ONGC ONGC = new ONGC();
		oilCompanyList.add(ONGC);
		pemex pemex = new pemex();
		oilCompanyList.add(pemex);
		petrobras petrobras = new petrobras();
		oilCompanyList.add(petrobras);
		Phillips66 Phillips66 = new Phillips66();
		oilCompanyList.add(Phillips66);
		Rosneft Rosneft = new Rosneft();
		oilCompanyList.add(Rosneft);
		SaudiAramco SaudiAramco = new SaudiAramco();
		oilCompanyList.add(SaudiAramco);
		Shell Shell = new Shell();
		oilCompanyList.add(Shell);
		SinopecGroup SinopecGroup = new SinopecGroup();
		oilCompanyList.add(SinopecGroup);
		TotalSA TotalSA = new TotalSA();
		oilCompanyList.add(TotalSA);
		Valero Valero = new Valero();
		oilCompanyList.add(Valero);
	}
	
	public void distributeMarket() { // Sets location points for each company
		for (int i = 0; i < oilCompanyList.size(); i++) {
			ArrayList<Location> points = new ArrayList();
			Company company = oilCompanyList.get(i);
			Location progressPoint = new Location((i * 45), 0);
			points.add(progressPoint);
			for (int j = 0; j < (company.getMyBudget() - 1); j++) {
				int x = progressPoint.getX();
				int y = progressPoint.getY();
				if (y == 795) {
					x += 15;
					y = 0;
				} else if (x == (i * 45) + 30){
					x = (i*45);
					y += 15;
				} else {
					x += 15;
				}
				Location newSquare = new Location (x,y);
				points.add(newSquare);
				progressPoint = newSquare;
			}
			company.setMyLocations(points);
		}
	}

	public void newBudgets() {
		for (Company company :  oilCompanyList) {
			company.setMyBudget(company.getMyBudget() + (company.getMyQuantity() * (company.getMyPrice()-company.getMyInputCost())));
		}
	}
	
	public void newMarketShares() {
		double marketSize = calculateMarketSize();
		for (Company company :  oilCompanyList) {
			company.setMyMarketShare(company.getMyBudget()/marketSize);
		}
	}

	public double calculateMarketSize() {
		double marketSize = 0;
		for (Company company :  oilCompanyList) {
			marketSize += company.getMyBudget();
		}
		return marketSize;
	}
	
	public double calculateTotalGDP() {
		currentTotalGDP = 0.0;
		for(int i = 0; i < oilCompanyList.size(); i++){
			double companyPrice = oilCompanyList.get(i).getMyPrice();
			double companyQuantity = Double.valueOf(oilCompanyList.get(i).getMyBudget());
			double companyRevenue = companyPrice * companyQuantity;
			currentTotalGDP += companyRevenue;
		}
		return currentTotalGDP;
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
	public ArrayList<Company> getoilCompanyList() {
		return oilCompanyList;
	}
	public void setoilCompanyList(ArrayList<Company> oilCompanyList) {
		this.oilCompanyList = oilCompanyList;
	}
	
	public void setPreviousTotalGDP(double x) {
		previousTotalGDP = x;
	}
	
	public void setCurrentTotalGDP(double x) {
		currentTotalGDP = x;
	}
	
	public int getPreviousTotalGDP(){
		int GDP = (int)previousTotalGDP;
		return GDP;
	}
	
	public int getCurrentTotalGDP() {
		int GDP = (int)currentTotalGDP;
		return GDP;
	}
	
	public int getBusinessQuarter() {
		return businessQuarter;
	}

	public void makeAgreements() { // Randomizes the agreements
		ArrayList<Integer> numbersUsed = new ArrayList<Integer>();
		while (numbersUsed.size() < 21) {
			int x = rgen.nextInt(0, 20);
			if(numbersUsed.indexOf(x) == -1) { // if the number doesn't exist in the list
				numbersUsed.add(x);
			}
		}	
		agreement1 = new ArrayList();
		agreement2 = new ArrayList();
		agreement3 = new ArrayList();
		agreement4 = new ArrayList();
		agreement5 = new ArrayList();
		agreement6 = new ArrayList();
		agreement7 = new ArrayList();
		addAgreements(numbersUsed);
	}
		

	public void addAgreements(ArrayList<Integer> numbersUsed) {
		for(int i=0; i<3; i++) {
			agreement1.add(oilCompanyList.get(numbersUsed.get(i))); // There's a bug here but i'm not sure why
		} for(int i=3; i<6; i++) {
			agreement2.add(oilCompanyList.get(numbersUsed.get(i)));
		} for(int i=6; i<9; i++) {
			agreement3.add(oilCompanyList.get(numbersUsed.get(i)));
		} for(int i=9; i<12; i++) {
			agreement4.add(oilCompanyList.get(numbersUsed.get(i)));
		} for(int i=12; i<15; i++) {
			agreement5.add(oilCompanyList.get(numbersUsed.get(i)));
		} for(int i=15; i<18; i++) {
			agreement6.add(oilCompanyList.get(numbersUsed.get(i)));
		} for(int i=18; i<21; i++) {
			agreement7.add(oilCompanyList.get(numbersUsed.get(i)));
		}
	}
	 //exchange rates and inflation rates based on 2019
	public void adjustPrices() {
		for (int i = 0; i < oilCompanyList.size(); i++) {
			String country = oilCompanyList.get(i).getCountry();
			double oldprice = oilCompanyList.get(i).getMyPrice();
			double newprice = 1;
			if(country.equals("United Kingdom") == true) {
				newprice = 1 + (1.2911 * 0.0181); // one plus the exchange rate times the inflation rate
			} else if (country.equals("United States") == true) {
				newprice = 1 + 0.0228;
			} else if (country.equals("China") == true) {
				newprice = 1 + (0.14361 * 0.045);
			} else if (country.equals("Russia") == true) {
				newprice = 1 + (0.016117 * 0.0468);
			} else if (country.equals("Japan") == true) {
				newprice = 1 + (0.0092009 * 0.0079);
			} else if (country.equals("Iran") == true) {
				newprice = 1 + (0.00002375 * 0.3568);
			} else if (country.equals("India") == true) {
				newprice = 1 + (0.014025 * 0.0344);
			} else if (country.equals("Mexico") == true) {
				newprice = 1 + (0.05282 * 0.0377);
			} else if (country.equals("Brazil") == true) {
				newprice = 1 + (0.24876 * 0.0378);
			} else if (country.equals("France") == true) {
				newprice = 1 + (1.1225 * 0.0121);
			} else if (country.equals("Saudi Arabia") == true) {
				newprice = 1 + (0.2665 * (-0.0105));
			}
			newprice = oldprice * newprice;
			oilCompanyList.get(i).setMyPrice(newprice);
		}
	}
	
	public void assignBudgets(ArrayList<Company> agreement) {
		Company company1 = agreement.get(0);
		Company company2 = agreement.get(1);
		Company company3 = agreement.get(2);
		if(company1.typeOfCompany == true && company2.typeOfCompany == true && company3.typeOfCompany == true) {
			company1.setMyBudget(company1.getMyBudget() + 4);
			company2.setMyBudget(company2.getMyBudget() + 4);
			company3.setMyBudget(company3.getMyBudget() + 4);
		} else if(company1.typeOfCompany == false && company2.typeOfCompany == false && company3.typeOfCompany == false) {
			company1.setMyBudget(company1.getMyBudget() - 3);
			company2.setMyBudget(company2.getMyBudget() - 3);
			company3.setMyBudget(company3.getMyBudget() - 3);
		} else {
			if(company1.typeOfCompany == true) {
				company1.setMyBudget(company1.getMyBudget() - 5);
			} else {
				company1.setMyBudget(company1.getMyBudget() + 8);
			} if(company2.typeOfCompany == true) {
				company2.setMyBudget(company2.getMyBudget() - 5);
			} else {
				company2.setMyBudget(company2.getMyBudget() + 8);
			} if(company3.typeOfCompany == true) {
				company3.setMyPrice(company3.getMyPrice() - 5);
			} else {
				company3.setMyPrice(company3.getMyPrice() + 8);
			}
		}
	}
	
	public void findBudgets() {
		assignBudgets(agreement1);
		assignBudgets(agreement2);
		assignBudgets(agreement3);
		assignBudgets(agreement4);
		assignBudgets(agreement5);
		assignBudgets(agreement6);
		assignBudgets(agreement7);
	}

	public void purgeTheBankrupt() { // The bankrupt can still make trades but won't show up on graph
		bankruptCompanies = new ArrayList<Company>();
		for (Company x : oilCompanyList) {
			x.checkIfBankrupt();
			if (x.isBankrupt() == true) {
				x.setMyColor(Color.WHITE);
				bankruptCompanies.add(x);
			}
		}
	}
	
	public int getBankruptCompaniesSize() {
		return bankruptCompanies.size();
	}
	
	public boolean isCompanyOverBudget() {
		for (Company x : oilCompanyList) {
			if (x.getMyBudget() >= 162) {
				return true;
			}
		}
		return false;
	}

	public void evenThePlayingField() {
	 	for (Company company : oilCompanyList) {
	 		company.setMyBudget(50);
	 	}
	 }
	
	@Override
	public String toString() {
		return "World [width=" + width + ", height=" + height
				+ ", oilCompanyList=" + oilCompanyList + "]";
	}
}
