package mypkg;

import java.util.Scanner;

public class MainClass {

	static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductPojo productPojo1 = new ProductPojo(1001, "Lakme", 1599.99f, 1);
		ProductPojo productPojo2 = new ProductPojo(1002, "Himalayas", 99.99f, 3);
		ProductPojo productPojo3 = new ProductPojo(1003, "Johnson", 10.99f, 2);
        System.out.println(productPojo1);
        System.out.println(productPojo2);
        System.out.println(productPojo3);
        
        sc = new Scanner(System.in);
        
        System.out.println("******************");
        System.out.println("Welcome to our Online Showroom");
        System.out.println("******************");
        System.out.println("Enter yes to begin shopping");
        String ch = sc.next();
        while(ch.equalsIgnoreCase("yes")) {
        	
        	System.out.println("Which product details you want?");
            System.out.println("1.Lakme\n2.Himalayas\n3.Johnson");
            System.out.println("Please enter your choice");
            int choice = sc.nextInt();
            
            switch(choice) {
            case 1:
            	System.out.println("Product 1 details are: ");
            	System.out.println(productPojo1);
            	break;
            case 2:
            	System.out.println("Product 2 details are: ");
            	System.out.println(productPojo2);
            	break;
            case 3:
            	System.out.println("Product 3 details are: ");
            	System.out.println(productPojo3);
            	break;
            default:
            	System.out.println("Product doesn't exist \n Please enter a valid product details");
            }
        	
        }
        
        /*
        
        if(productPojo1.quantity>50 && productPojo1.price<1000) {
        	System.out.println("Announce offer");
        }else if(productPojo1.getProductName()=="Lakme") {
        	System.out.println("No offer");
        }else if(productPojo1.getProductId()==1001) {
        	System.out.println("Sale start from November");
        }else {
        	System.out.println("Wait for the offer!!!");
        }
        
        */   
	}
	

}
