package array1;

import java.util.Scanner;

public class array151 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		int [] array = new int [5];
		
		for (int i = 0; i < array.length; i++) {
			
			int num = input.nextInt();
			array[i] = num;
			
		}

		int sum = 0;
		
		for(int j = 0; j < array.length; j+=2) {
			
			sum += array[j];
		}
		
		System.out.println(sum);
	}
}