package re;

import java.util.Scanner;

public class re140 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		double avg = 0.0;
		int c =0;
		
		for(int i = 0; i < 20;i++) {
			
			int num = input.nextInt();
			sum += num;
			c++;
			
			if(num == 0) {
				break;
			}
		}
		avg = (double)sum / c;
		System.out.printf("%s %.0f",sum, avg);
	}
}
