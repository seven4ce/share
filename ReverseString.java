package SimpleJavaTest;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("\nMasukan String : ");
	
	String inString = input.nextLine();
	input.close();
//	inString = inString.replaceAll("\\s+", "");
	String revString = "";
	
	
	for (int i = inString.length()-1; i >=0; i--) {
		revString +=inString.charAt(i);
	}
	
	System.out.println(revString);
	
	}
	
}
