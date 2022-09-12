package array1;

import java.util.Scanner;

public class array156 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] arr = new int [100];
		
		int a = 0;
		
		for(int i = 0; i < arr.length; i++) {
			a++;
			int num = input.nextInt();
			
			if(num == 999) {
				break;
			}
			else if (num < 1000) {
				arr[i] = num;
			}
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for (int j = 0; j < a; j++) {	
			max = Math.max(max, arr[j]);
			min = Math.min(min, arr[j]);
		}

		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}