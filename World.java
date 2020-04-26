package prisonersDilemma;

import java.util.ArrayList;

import acm.util.RandomGenerator;

public class World {

	private int width;
	private int height;
	private double previousTotalGDP;
	private double currentTotalGDP;
	public int businessQuarter;
	public ArrayList<Company> oilCompanyList;
	public CollusiveAgreement agreement1;
	public CollusiveAgreement agreement2;
	public CollusiveAgreement agreement3;
	public CollusiveAgreement agreement4;
	public CollusiveAgreement agreement5;
	public CollusiveAgreement agreement6;
	public CollusiveAgreement agreement7;
	private RandomGenerator rgen = new RandomGenerator();

	public World(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.previousTotalGDP = 0.0;
		this.currentTotalGDP = 0.0;
		this.businessQuarter = 0;
		this.oilCompanyList = new ArrayList<Company>();
	}

	public void nextBusinessQuarter(){
		businessQuarter++;
		previousTotalGDP = currentTotalGDP;
		if (businessQuarter % 4 == 0) { // Makes sure prices are adjusted every four years
			adjustPrices();
		}
		makeNewCompanies();
		makeAgreements();
		purgeTheBankrupt();
		calculateTotalGDP();
	}

	public void listCompanies() {
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
	
	public void distributeMarket() {
		Location progressPoint = new Location(0,0);
		boolean goingDown = true;
		for (Company company : oilCompanyList) {
			assignQuantity(company);
			for (int i = 0; i < company.getMyQuantity(); i++) {
				int x = progressPoint.getX();
				int y = progressPoint.getY();
				if (progressPoint.getY() == 795 && goingDown) {
					x += 15;
					goingDown = false;
				} else  if (progressPoint.getY() == 0 && goingDown == false){
					x += 15;
					goingDown = true;
				} else if (goingDown == true) {
					y += 15;
				} else {
					y -= 15;
				}
				Location newSquare = new Location(x, y);
				company.addLocation(newSquare);
				progressPoint = newSquare;
			}
		}
	}
	
	public void assignQuantity(Company company) {
		company.setMyQuantity(3240/company.getMyMarketShare());
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

	public void calculateTotalGDP() {
		currentTotalGDP = 0.0;
		for(int i = 0; i < oilCompanyList.size(); i++) {
			double companyPrice = oilCompanyList.get(i).getMyPrice();
			double companyQuantity = oilCompanyList.get(i).getMyQuantity();
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
	public ArrayList<Company> getoilCompanyList() {
		return oilCompanyList;
	}
	public void setoilCompanyList(ArrayList<Company> oilCompanyList) {
		this.oilCompanyList = oilCompanyList;
	}
	
	public void setPreviousTotalGDP(double x) {
		previousTotalGDP = x;
	}

	public void makeAgreements() {
		ArrayList<Integer> numbersUsed = new ArrayList<Integer>();
		for(int i=0; i<20; i++) {
			int x = rgen.nextInt(0, 20);
			while(numbersUsed.size() < 21) {
				for(int j=0; j<numbersUsed.size(); j++) {
					if(numbersUsed.get(j) == x) {
						break;
					}
					x = rgen.nextInt(0, 20);
				}
			}
			numbersUsed.add(x);
		}
		addAgreements(numbersUsed);
	}

	public void addAgreements(ArrayList<Integer> numbersUsed) {
		for(int i=0; i<3; i++) {
			agreement1.add(oilCompanyList.get(numbersUsed.get(i)));
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

	@Override
	public String toString() {
		return "World [width=" + width + ", height=" + height
				+ ", oilCompanyList=" + oilCompanyList + "]";
	}
}
