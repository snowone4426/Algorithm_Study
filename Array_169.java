package array;
import java.util.Scanner;

public class Array_169 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [][] arr = new String [3][5];
		char[][] arr1= new char[3][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = input.next();
			}
		}
		for (int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j] = arr[i][j].charAt(0);
				arr1[i][j] +=32;
				System.out.print(arr1[i][j]+" ");
			}System.out.println();
		}

	}

}
