package array1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class array159 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		Integer [] arr = new Integer[n];

		
		for (int i = 0; i < arr.length; i++) {
			
			int num = input.nextInt();
			arr[i] = num;
			
		}
		
		Arrays.sort(arr, Collections.reverseOrder());

		for(int j : arr) {
			
			System.out.println(j);
		}
	
	}
}