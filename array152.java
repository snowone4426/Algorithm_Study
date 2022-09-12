package array1;

import java.util.Scanner;

public class array152 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] array = new int [10];
		
		for (int i = 0 ; i < array.length ; i++) {
			
			int num = input.nextInt();
			array[i] = num;
			
		}
		
		int odd = 0;
		int even = 0;
		
		for(int j = 0 ; j < array.length ; j++) {
			
			if (j % 2 == 0) {
				
				odd += array[j];
			}
			else if (j % 2 != 0) {
				even += array[j];
			}
		}
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}