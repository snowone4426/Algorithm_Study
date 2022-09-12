package array1;

import java.util.Scanner;

public class array555 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String [] s = new String[10];
		
		for (int i = 0; i < s.length; i++) {
			
			String n = input.next();
			s[i] = n;
		}
			
		for(int j = 0; j <s.length; j++) {
			System.out.print(s[j]);
		}
	}
}