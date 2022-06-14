package Collegepkg;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentPojo s1 = new StudentPojo(1, "A", 1, "CS", 60);
		StudentPojo s2 = new StudentPojo(2, "B", 1, "EL", 30);
		StudentPojo s3 = new StudentPojo(3, "C", 2, "CS", 45);
		StudentPojo s4 = new StudentPojo(4, "D", 4, "IT", 95);
		StudentPojo s5 = new StudentPojo(5, "E", 3, "EC", 78);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***************************");
		System.out.println("Welcome to college Database");
		System.out.println("***************************");
		System.out.println();
		int count = 2;
        for(int c = 0; c<2; c++) {
        	System.out.println("Which student details you want?");
            System.out.println("Enter roll number: ");
            int rn = sc.nextInt();
            
            switch(rn) {
            case 1:
            	System.out.println("details are: ");
            	System.out.println(s1);
            	
            	UtilClass u1 = new UtilClass(s1.getMarks(), s1.getYear());
            	u1.result();
            	u1.graduated();
            	
            	break;
            	
            case 2:
            	System.out.println("details are: ");
            	System.out.println(s2);
            	
            	UtilClass u2 = new UtilClass(s2.getMarks(), s2.getYear());
            	u2.result();
            	u2.graduated();
            	
            	break;
            	
            case 3:
            	System.out.println("details are: ");
            	System.out.println(s3);
            	
            	UtilClass u3 = new UtilClass(s3.getMarks(), s3.getYear());
            	u3.result();
            	u3.graduated();
            	
            	break;
            	
            case 4:
            	System.out.println("details are: ");
            	System.out.println(s4);
            	
            	UtilClass u4 = new UtilClass(s4.getMarks(), s4.getYear());
            	u4.result();
            	u4.graduated();
            	
            	break;
            	
            case 5:
            	System.out.println("details are: ");
            	System.out.println(s5);
            	
            	UtilClass u5 = new UtilClass(s5.getMarks(), s5.getYear());
            	u5.result();
            	u5.graduated();
            	
            	break;	
            	
            default:
            	System.out.println("Student is not there for this roll no.");
            }
            
            
        	
        }

	}

}
