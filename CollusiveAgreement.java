package prisonersDilemma;

import java.util.*;

public class CollusiveAgreement {
	protected String name;
	protected ArrayList<Company> companiesAgreed;

	public CollusiveAgreement(String name, ArrayList<Company> companiesAgreed) {
		super();
		this.name = name;
		this.companiesAgreed = companiesAgreed;
	}
	
	public void add(Company company) {
		companiesAgreed.add(company);
	}
	
	public Company getCompany(int a) {
		return companiesAgreed.get(a);
	}
	
}
