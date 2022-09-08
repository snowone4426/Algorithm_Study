package array;
import java.util.Scanner;

public class Array_568 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] arr1 = new int [2][4];
		int [][] arr2 = new int [2][4];
		int [][] arr3 = new int [2][4];
		int num1=0;
		int num2=0;
		int num3=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				num1=input.nextInt();
			    arr1[i][j]=num1;
		}}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				num2=input.nextInt();
			    arr2[i][j]=num2;
		}}
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				arr3[i][j]=arr1[i][j]*arr2[i][j];
				 System.out.print(arr3[i][j]+ " ");
		}System.out.println();
			}
		
		
	}

}
