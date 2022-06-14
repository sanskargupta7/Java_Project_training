package mypkg;

public class DriverClass {
	
	public static void main(String[] args) {
		Product.display();
		Product obj = new Product();
		Product obj1 = new Product();
		Product obj2 = new Product("Laptop", 102);
		Product obj3 = new Product(101);
		obj.show();
		obj1.show();
		obj2.show();
		obj3.show();
		System.out.println(obj2.getPid());
		
		System.out.println(obj2.toString());
	}

}
