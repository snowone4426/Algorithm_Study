package array;
import java.util.Scanner;

public class Array_567 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int arr[][]= {{5,8,10,6,4},{11,20,1,13,2},{7,9,14,22,3}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%2d   ",arr[i][j]);
			}System.out.println(" ");
			
		}
	}

}