package re;

import java.util.Scanner;

public class re144 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for(int i = 1;i<=num;i++) {
			
			
			for(int k = 2*num - 2*i; k >=0; k--) {
				System.out.print(" ");
			}
			
			
			for(int j = 1; j <= 2*i-1 ; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}	
	}
}
