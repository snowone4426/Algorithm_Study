package array2;

import java.util.Scanner;

public class array166 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [][] arr1 = new int [2][3];
		int [][] arr2 = new int [2][3];
		int [][] arrx = new int [2][3];
		
		for(int i = 0; i < arr1.length; i++) {
			
			for(int j = 0; j < arr1[i].length; j++) {
				
				int num = input.nextInt();
				arr1[i][j] = num;
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			
			for(int j = 0; j < arr2[i].length; j++) {
				
				int num = input.nextInt();
				arr2[i][j] = num;
			}
		}
		
		for(int i = 0; i < arrx.length; i++) {
			
			for(int j = 0; j < arrx[i].length; j++) {

				arrx[i][j] = arr1[i][j] * arr2[i][j];
					
			}
		}
		
		for(int i = 0; i < arrx.length; i++) {
			
			for(int j = 0; j < arrx[i].length; j++) {

				System.out.print(arrx[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}