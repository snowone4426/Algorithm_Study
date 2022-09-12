package array;
import java.util.Scanner;

public class Array_167 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] arr = new int [4][2];
		int sum=0;
		int avg=0;
		int a=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=input.nextInt();
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
				a++;
			}avg= sum/a;
			System.out.print(avg+" ");
			sum=0;
			a=0;
		}
		System.out.println();
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				sum += arr[j][i];
				a++;
			}avg=sum/a;
			System.out.print(avg+" ");
			sum=0;
			a=0;
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
				a++;
			}	
		}avg=sum/a;
		System.out.print(avg);
	}

}
