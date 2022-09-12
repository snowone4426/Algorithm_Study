package array1;

import java.util.Scanner;

public class array558 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] num = new int[100];
		int a = 0;
		
		for (int i = 0; i < num.length; i++) {			
			int in = input.nextInt();
			num[i] = in;
			a++;
			if (num[i] == 0) {
				break;
			}
		}
		
		for (int j = a-2; j >= 0; j--) {
			System.out.print(num[j] + " ");
		}
	}
}