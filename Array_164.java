package array;
import java.util.Scanner;

public class Array_164 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] arr = new int [4][3];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
		System.out.println((i+1)+"class?");
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=input.nextInt();
			
		}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
			}System.out.println((i+1)+"class : "+sum);
			sum=0;
		}

	}

}
