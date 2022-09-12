package re;

import java.util.Scanner;

public class re553 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char ch = 'A';
		
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			for(int j = 0; j < num-i; j++) {
				
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}	
	}
}