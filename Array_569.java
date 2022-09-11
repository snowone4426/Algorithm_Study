package array;
import java.util.Scanner;

public class Array_569 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[][] = new int [5][4];
		int sum[]= new int [5];
		double avg[]= new double [5];
		int num=0;
		int sum1 = 0;
		double avg1 = 0;
		int a= 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				num= input.nextInt();
				arr[i][j]= num;
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum[i] += arr[i][j];
				
			}avg[i]= sum[i]/4;
			if(avg[i]>=80) {
				System.out.println("pass");
				a++;
			}
			else System.out.println("fail");
		}
		System.out.println("Successful : "+a);
	}

}
