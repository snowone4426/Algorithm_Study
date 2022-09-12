package array1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class array563 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Integer [] array = new Integer [10];
				
		for(int i = 0; i < array.length; i++) {
			
			int num = input.nextInt();
			array[i] = num;
		}
		
		// int에서는 Collections.reverseOrder() 사용할 수 없음
		Arrays.sort(array, Collections.reverseOrder());
		
		for(int j : array) {
			System.out.print(j + " ");
		}
	}
}