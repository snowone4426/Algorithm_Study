package array1;

import java.util.Scanner;

public class array150 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String str [] = new String[10];
		
		for (int i = 0; i <str.length; i++) {
			
			String a = input.next();
			str[i] = a;
			
		}
		
		for (int j = str.length -1; j >=0; j--) {
			
			System.out.print(str[j] + " ");
			
		}
	}
}