package re;

import java.util.Scanner;

public class re141 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int a = 0;
		
		for(int i = 1; i < 20; i++) {
		
			a = num * i;
			
			if(a < 100) {
				System.out.print(a + " ");
			}
			if(a % 10 ==0) {
				
				break;
			}	
		}
	}
}
