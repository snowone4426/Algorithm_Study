package array1;

import java.util.Scanner;

public class array154 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double [] ww = new double [6];
		
		double avg = 0.0;
		double sum = 0;
		int a = 0;
		
		for (int i = 0; i < ww.length; i++) {
			
			double num = input.nextDouble();
			ww[i] = num;
			a++;
			sum += ww[i];
			
		}
		
		avg = sum / a;
		
		System.out.printf("%.1f", avg);
		
	}
}