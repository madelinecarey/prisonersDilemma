package prisonersDilemma;

import java.util.*;

public class CollusiveAgreement {

	public CollusiveAgreement(String name, ArrayList<Company> companiesAgreed) {
		super();
		this.name = name;
		this.companiesAgreed = companiesAgreed;
	}
	protected String name;
	protected ArrayList<Company> companiesAgreed;
	
	public void add(Company company) {
		companiesAgreed.add(company);
	}
	
	
}
