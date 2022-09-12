package re;

import java.util.Scanner;

public class re142 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			for(int j = 0; j < 1+i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < num-1; i++) {
			
			for(int j = 0; j < num-1-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}