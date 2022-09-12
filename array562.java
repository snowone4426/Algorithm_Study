package array1;

import java.util.Scanner;

public class array562 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			
			int in = input.nextInt();
			num[i] = in;
		}
		
		int sum1 = 0;
		int sum2 = 0;
		int a = 0;
		double avg = 0.0;
		
		for(int j = 0; j < num.length; j++) {
			
			if(j % 2 != 0) {
				
				sum1 += num[j];
			}
			
			else if (j % 2 == 0) {
				
				sum2 += num[j];
				a++;
				
			}
		}
		avg = (double) sum2 / a;
		
		System.out.println("sum : " + sum1);
		System.out.printf("avg : %.1f", avg);
	}
}