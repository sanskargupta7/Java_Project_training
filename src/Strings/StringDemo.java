package Strings;

import java.util.*;

public class StringDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ms = sc.nextLine();
		
		//check number of repetitions for a char
		char v1 = sc.nextLine().charAt(0);
		int count = 0;
		for(int i = 0; i < ms.length(); i++) {
			if(ms.charAt(i) == v1) {
				count += 1;
			}
		}
		System.out.println(count);
		
		
		//check number of repetitions for substring
		String v2 = sc.nextLine();
		int l = v2.length();
		int c = 0;
		for(int i = 0; i < ms.length()-l+1; i++) {
			if(ms.substring(i, i+l).equals(v2)) {
				c += 1;
			}
		}
		System.out.println(c);
		
		
		//concat firstname and lastname
		String fname = sc.nextLine();
		String lname = sc.nextLine();
		String name = fname.concat(lname);
		System.out.println(name);
		
		//using trim()
		String s = "    This is a Sentence    which consistes   of leading and   trailing Whitespaces   ";
		System.out.println(s);
		System.out.println(s.trim());
		
		System.out.println();
		
		//replace a char in string
		String sentence = "This is a sentence, I will replace all 's' with 'S'";
		String sen = sentence.replace('s', 'S');
		System.out.println(sentence);
		System.out.println(sen);

		
		
		
		

	}

}
