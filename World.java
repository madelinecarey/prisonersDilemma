
import java.util.ArrayList;

public class World {
	
	private int width;
	private int height;
	private ArrayList<Company> companyList;
	
	public World(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.companyList = new ArrayList<Company>();
	}
	
	public void letTimePass(){
		
		makeNewCreatures();
		//eatThings();
		creaturesGetOlder();
		purgeTheBankrupt();		
	}
	
	public void makeNewCreatures() {
		
		int currentSizeOfcompanyList = companyList.size();
		System.out.println("size of list is "+currentSizeOfcompanyList);
		for(int i=0; i< currentSizeOfcompanyList; i++) {
			companyList.get(i).reproduce();
		}
	}
	
	public void purgeTheBankrupt(){
		int i=0;
		while(i<companyList.size()){
			if(companyList.get(i).isBankrupt())
				companyList.remove(i);
			else
				i++;
		}	
	}
	
	public void creaturesGetOlder(){
		for(Company l:companyList){
			//l.age(1);
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
	public ArrayList<Company> getcompanyList() {
		return companyList;
	}
	public void setcompanyList(ArrayList<Company> companyList) {
		this.companyList = companyList;
	}

	@Override
	public String toString() {
		return "World [width=" + width + ", height=" + height
				+ ", companyList=" + companyList + "]";
	}
}
