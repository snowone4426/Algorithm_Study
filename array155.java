package array1;

import java.util.Scanner;

public class array155 {

	public static void main(String[] args) {
		
		String [] str = {"J", "U", "N", "G", "O", "L"};
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		
		switch(s) {
			case "J" : System.out.println("0");
			break;
			case "U" : System.out.println("1");
			break;
			case "N" : System.out.println("2");
			break;
			case "G" : System.out.println("3");
			break;
			case "O" : System.out.println("4");
			break;
			case "L" : System.out.println("5");
			break;
			default : System.out.println("none");
		
		}	
	}
}