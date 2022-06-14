package newclass1;

public class UtilClass {
	
	int v1, v2;
	
	int a;

	public UtilClass(int v1, int v2) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		// TODO Auto-generated constructor stub
	}
	
	public void arithmetic() {
		System.out.println("Sum is: " + (v1+v2));
	}
	
	public void relational() {
		System.out.println("v1 = " + v1 + " v1 = " + v2);
		System.out.println("\nv1<v2 " + (v1<v2));
	}
	
	public void incDecrement() {
		System.out.println("v1 = " + v1 + " v1 = " + v2);
		System.out.println("v1++ is:  " + (v1++));
		System.out.println("v1-- is:  " + (v1--));
		System.out.println("v2++ is:  " + (v2++));
		System.out.println("v2-- is:  " + (v2--));
	}
	
	public void logical() {
		System.out.println("Logical Operators\n**********\n");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(true||false);
		
	}
	
	static void table(int n) {
		
		int t[] = new int[10];
		
		for(int i=0; i<10;i++) {
			t[i] = (i+1)*n;
		}
		
		for(int j=0; j<10; j++) {
			System.out.println(n + " * " + (j+1) + " = " + t[j]);
		}
		
	}
	
	
	

}
