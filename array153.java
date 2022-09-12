package array1;

import java.util.Scanner;

public class array153 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] arr = new int[100];
		int a= 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			int num = input.nextInt();
			arr[i] = num;
			a++;
			
			if (arr[i] == -1) {
				break;
			}
		}
		
		if (a > 3) {
			for (int j = a -4; j < a - 1; j++) {
			
				System.out.print(arr[j] + " ");
			}
		}
		else if (a < 4) {
			for (int j = a-3; j < a - 1; j++) {
				
				System.out.print(arr[j] + " ");
			}	
		}	
	}
}