package array;
import java.util.Scanner;

public class Array_152 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = new int [10];
		int n=0;
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			n=input.nextInt();
			arr[i]=n;
		}
		for(int i=0;i<arr.length;i+=2) {
			sum1 += arr[i];
		}
		for(int i=1;i<arr.length;i+=2) {
			sum2 += arr[i];
		}
		System.out.println("odd : "+sum1);
		System.out.println("even : "+sum2);
	}

}
