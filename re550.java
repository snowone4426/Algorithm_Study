package re;

import java.util.Scanner;

public class re550 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			for(int j = i; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < num; i++) {
			
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
