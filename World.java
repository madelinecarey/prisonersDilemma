package prisonersDilemma;

import java.util.ArrayList;

import acm.util.RandomGenerator;

public class World {
	
	private int width;
	private int height;
	private double previousTotalGDP;
	private double currentTotalGDP;
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
		this.oilCompanyList = new ArrayList<Company>();
	}
	
	public void nextBusinessQuarter(){
		previousTotalGDP = currentTotalGDP;
		makeNewCompanies();
		companiesInteract();
		purgeTheBankrupt();		
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
			double companyPrice = oilCompanyList.get(i).getMyPrice();
			double companyQuantity = Double.valueOf(oilCompanyList.get(i).getMyQuantity());
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

	@Override
	public String toString() {
		return "World [width=" + width + ", height=" + height
				+ ", oilCompanyList=" + oilCompanyList + "]";
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
}
