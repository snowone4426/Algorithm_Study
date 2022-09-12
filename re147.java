package re;

import java.util.Scanner;

public class re147 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int n = 0;
		
		for(int i = 0; i < num; i++) {
			
			for(int j = 0; j < num - i; j++) {
				
				n++;
				System.out.print(n + " ");
			}
			System.out.println();
			
			for(int k = 0; k < i+1; k++) {
				System.out.print("  ");
			}
		}
	}
}