package array2;

import java.util.Scanner;

public class array568 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [][] arr1 = new int [2][4];
		int [][] arr2 = new int [2][4];
		int [][] arr3 = new int [2][4];
		
		for(int i = 0; i < arr1.length;i++) {
			
			for(int j = 0; j < arr1[i].length; j++) {
				int num1 = input.nextInt();
				arr1[i][j] = num1;
			}
		}
		
		for(int i = 0; i < arr2.length;i++) {
			
			for(int j = 0; j < arr2[i].length; j++) {
				int num2 = input.nextInt();
				arr2[i][j] = num2;
			}
		}
		
		for(int i = 0; i < arr3.length;i++) {
			
			for(int j = 0; j <arr3[i].length;j++) {
				
				arr3[i][j] = arr1[i][j] * arr2[i][j];
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
}