package array;
import java.util.Scanner;
public class Array_166 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [][] arr1 = new int [2][3];
		int [][] arr2 = new int [2][3];
		int [][] arr3 = new int [2][3];
		System.out.println("first array");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				
				arr1[i][j]=input.nextInt();
			}
		}
		System.out.println("second array");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				
				arr2[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				arr3[i][j]= arr1[i][j]*arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}System.out.println();
		}
		
	}

}
