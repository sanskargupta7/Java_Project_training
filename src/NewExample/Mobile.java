package NewExample;

public class Mobile {
	
	private int ModelId;
	private String CompanyName;
	private int Cost;
	private String QualityGrade;
	
	static String Device = "Mobile";
	
	Mobile(){
		
	}
	
	Mobile(String Cn, int C){
		CompanyName = Cn;
		Cost = C;
	}
	
	Mobile(String Cn, int C, String qg){
		CompanyName = Cn;
		Cost = C;
		QualityGrade = qg;
	}
	
	Mobile(int id, String cn, int c, String qg){
		ModelId = id;
		CompanyName = cn;
		Cost = c;
		QualityGrade = qg;
	}
	
	public int getMid() {
		return ModelId;
	}
	
	public String getCompanyName() {
		return CompanyName;
	}
	
	public int getCost() {
		return Cost;
	}
	
	public String getQG() {
		return QualityGrade;
	}
	
	public void setCost(int c) {
		Cost = c;
	}
	
	public void setQG(String qg) {
		QualityGrade = qg;
	}
	
	void display() {
		System.out.println("The mobile modelId is: " + ModelId);
		System.out.println("The Company Name is: " + CompanyName);
		System.out.println("The Cost is: " + Cost);
	}
	
	static void type() {
		System.out.println("the model type is: " + Device);
	}

}
