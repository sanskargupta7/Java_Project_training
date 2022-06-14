package mypkg;

public class ThisDemo {
	int pid;

	ThisDemo(int pid){
		this.pid = pid;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo thisDemo = new ThisDemo(50);
		System.out.println(thisDemo.pid);

	}

}
