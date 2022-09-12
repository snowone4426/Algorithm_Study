package re;

import java.util.Scanner;

public class re145 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int n = 0;
		
		for(int i = 0; i < num; i++ ) {
			
			for(int k = i; k < num-1;k++) {
				System.out.print("  ");
			}
			
			for(int j = num; j >=num-i; j--) {
				n++;
				System.out.print(n + " ");
				
			}
			n = 0;
			System.out.println();
		}
	}
}