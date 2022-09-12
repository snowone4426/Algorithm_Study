package array2;

import java.util.Scanner;

public class array566 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int [] arr = new int[num];
		arr[0] = 100;
		arr[1] = num;
		int a = 0;
		
		for(int i = 0;i < arr.length; i++) {
			a++;
			arr[i+2] = arr[i] - arr[i+1];
			
			if(arr[i] < 0) {
				break;
			}
		}
		
		for(int i = 0; i < a;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}