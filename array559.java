package array1;

import java.util.Scanner;

public class array559 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double [] d = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};		
		double sum = 0;
		
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		
		sum = d[a1-1] + d[a2-1];
		
		System.out.printf("%.1f",sum);
	}
}