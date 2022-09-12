package array1;

import java.util.Scanner;

public class array157 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] arr = new int [100];
		int a = 0;
		int b = 0;
		
				int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < arr.length ; i++) {
			int num = input.nextInt();
			a++;
			if (num == 0) {
				break;
			}
			else {
				arr[i] = num;
			}
			
			if (num % 5 == 0) {
				b++;
				sum += num;
				
			}
		}
		
		avg = (double) sum / b;
		
		System.out.println("Multiples of 5 : " + b);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
	}
}