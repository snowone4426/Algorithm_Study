package array2;

import java.util.Scanner;

public class array164 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [][] arr = new int [4][3]; 			
		
		int sum [] = new int [4];
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				int num = input.nextInt();
				arr[i][j] = num;
				sum[i] += num;
			}
		}
		
		for(int i = 0; i < sum.length; i++) {
			
			System.out.println((i+1) + "class : " + sum[i]);
		}
	}
}