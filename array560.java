package array1;

import java.util.Scanner;

public class array560 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			int in = input.nextInt();
			
			if (in < 1000) {
				num[i] = in;
			}
			else {
				in = input.nextInt();
				num[i] = in;
			}
		}
		
		int min = num[0];
		
		for (int aa : num) {
			if(min > aa) {
				min = aa;
			}
		}
		System.out.println(min);		
	}
}