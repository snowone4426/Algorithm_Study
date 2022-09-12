package re;

import java.util.Scanner;

public class re551 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			for(int j = num-i ; j > 0; j--) {
			
				System.out.print("*");
			}
			System.out.println();
		
			for(int k = 0; k < i+1;k++) {
				System.out.print(" ");
			}
		}
	}
}