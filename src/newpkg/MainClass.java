package newpkg;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("*********************");
		System.out.println("Welome to the Library");
		System.out.println("*********************");
		System.out.println("");
		
		for(int i=0; i<3; i++) {
			
			System.out.println("Which genre book do you want to read?\n");
			System.out.println("1:Comedy\n2:thriller\n3:Romance\n4:Horror");
			int g = sc.nextInt();
			
			switch(g) {
			
			case 1: 
				System.out.println("These Comedy Books are present\n");
				Library.Comedy();
				break;
			
			case 2:
				System.out.println("These Thriller Books are present\n");
				Library.Thriller();
				break;
			
			case 3:
				System.out.println("These Romance Books are present\n");
				Library.Romance();
				break;
				
			case 4:
				System.out.println("These Horror Books are present\n");
				Library.Horror();
				break;
				
			default:
				System.out.println("The genre is not present");
				break;
			}	
		}
	}
}
