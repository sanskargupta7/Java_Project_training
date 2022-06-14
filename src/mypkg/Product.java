package mypkg;

public class Product {
	
	private int pid;
	private String pname;
	
	
	
	public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public Product(){
		
	}
	
	public Product(String str, int id){
		pid=id;
		pname=str;
	}
	
	public Product(int x){
		pid=x;
	}
	
	public int getPid() {
		return pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	static void display() {
		System.out.println("Display Product Class");
	}
	
	void show() {
		System.out.println("Product ID is: " + pid);
		System.out.println("Product Name is: " + pname);
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}
	

}
