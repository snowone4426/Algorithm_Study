package re;

import java.util.Scanner;

public class re554 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int a = 1;
		char ch = 'A';
		
		for(int i = 0; i < num; i++) {
			
			for(int j = 0; j < num-i;j++) {
				System.out.print(a + " ");
				a++;
			}
			
			for(int k = 0; k < 1+i;k++) {
				System.out.print(ch + " ");
				ch++;
			}
			
			System.out.println();
		}
	}
}