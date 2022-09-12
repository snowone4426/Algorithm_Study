package array2;

import java.util.Scanner;

public class array162 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int[] arr = new int [10];
		arr[0] = num1;
		arr[1] = num2;
		
		for(int i = 2; i < arr.length;i++) {
			
			arr[i] = arr[i-2] + arr[i-1];
			
			if(arr[i] >=10) {
				int a = arr[i] % 10;
				arr[i] = a;
			}
		}
		
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}		
		
	}
}