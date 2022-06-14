package Collegepkg;

public class UtilClass {
	
	private int m;
	private int y;
	public int yoj;
	
	public UtilClass(int m, int y) {
		super();
		this.m = m;
		this.y = y;
	}
	
	public UtilClass(int m, int y, int yoj) {
		super();
		this.m = m;
		this.y = y;
		this.yoj = yoj;
	}

	public void result() {
		if(m>30) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
	}
	
	public void graduated() {
		if(m>30 && y==4) {
			System.out.println("Graduated");
			System.out.println();
		}else if(m>30 && y!=4) {
			System.out.println((4-y) + " years left to graduate.");
			System.out.println();
		}else {
			System.out.println((4-y+1) + " years left to graduate");
		}
	}
	
	public String grade() {
		if(m>90) {
			return "A";
		}else if(m>70 && m<=90){
			return "B";
		}else if(m>50 && m<=70) {
			return "C";
		}else if(m>30 && m<=50) {
			return "D";
		}else {
			return "Fail";
		}
	}
	
	public int yearOfGrad() {
		if(m>30 && y==4) {
			return yoj+4;
		}else {
			return yoj+5;
		}
	}

}
