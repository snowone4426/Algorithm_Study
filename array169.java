package array2;

import java.util.Scanner;

public class array169 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char [][] arr = new char[3][5];
		
		for(int i = 0;i < arr.length;i++) {
			
			for(int j = 0; j <arr[i].length;j++) {
				
				String st = input.next();
				char ch = st.charAt(0);
				ch+=32;
				arr[i][j] = ch ;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j <arr[i].length;j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
