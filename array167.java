package array2;

import java.util.Scanner;

public class array167 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [][] arr = new int[4][2];
		
		
		int [] sum1 = new int[4];
		int [] sum2 = new int[2];
		int total = 0;
		
		for(int i = 0; i < arr.length;i++) {
			
			for(int j =0; j <arr[i].length;j++) {
				
				int num = input.nextInt();
				arr[i][j] = num;
				sum1[i] += arr[i][j];
				total += arr[i][j];
				
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum2[0] += arr[i][0];
			sum2[1] += arr[i][1];
		}
		
		for(int i = 0; i < sum1.length; i++) {
			
			System.out.print(sum1[i] / 2 + " ");
		}
		System.out.println();
		
		for(int i = 0; i < sum2.length;i++) {
			System.out.print(sum2[i] / 4 + " ");
		}
		System.out.println();	
		
		System.out.println(total / 8);
		
	}
}
