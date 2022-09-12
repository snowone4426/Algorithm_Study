package array2;

import java.util.Scanner;

public class array160 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int arr [] = new int [10];
		
		for (int i = 0; i < arr.length; i++) {
			
			int num = input.nextInt();
			arr[i] = num;
		}
		
		int count [] = new int[6];

		for (int i = 0; i < arr.length; i++ ) {
			
			if (arr[i] == 1) {
				count[0]++;
			}
			else if (arr[i] == 2) {
				count[1]++;
			}
			else if (arr[i] == 3) {
				count[2]++;
			}
			else if (arr[i] == 4) {
				count[3]++;
			}
			else if (arr[i] == 5) {
				count[4]++;
			}
			else if (arr[i] == 6) {
				count[5]++;
			}
		}
		
		for(int i = 0; i < count.length; i++) {
			
			System.out.println((i+1) + " : " + count[i] );
		}
	}
}