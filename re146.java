package re;

import java.util.Scanner;

public class re146 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(7);
	
		char ch = 'A';
		int a = 0;
		
		for(int i = 0; i < num; i++) {
			
			for(int j = 0; j < num-i; j++, ch++) {
				
				System.out.print(ch + " ");			
			}
			
			for(int k = 0; k < i;k++) {
				System.out.print(a + " ");
				a++;
			}
			
			System.out.println();
		}
	}
}