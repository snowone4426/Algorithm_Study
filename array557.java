package array1;

import java.util.Scanner;

public class array557 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String [] s = new String[10];
		
		for (int i = 0; i < s.length;i++) {			
			String n = input.next();
			s[i] = n;
		}
		
		for (int j = 0; j < 7; j+=3) {			
			System.out.print(s[j] + " ");
			
		}
	}
}