package array2;

import java.util.Scanner;

public class array569 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [][] arr = new int [5][4];
		
		for(int i = 0; i < arr.length;i++) {
			
			for(int j = 0; j <arr[i].length; j++) {
				
				int num = input.nextInt();
				arr[i][j] = num;
			}
		}
		
		int []sum = new int[5];
		double [] avg = new double[5];

		
		for(int i = 0;i < arr.length;i++) {
			
			for(int j = 0; j < arr[i].length;j++) {
				
				sum[i] += arr[i][j];
			}
			
			avg[i] = (double) sum[i] / 4;
		}
		int a =0;
		
		for(int i = 0; i < avg.length; i++) {
			
			if(avg[i] >= 80) {
				a++;
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
		}
		
		System.out.println("Successful : " + a);
	}
}
