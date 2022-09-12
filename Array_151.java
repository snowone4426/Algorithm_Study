package array;
import java.util.Scanner;

public class Array_151 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] arr = new int [5];
		int n=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			n=input.nextInt();
			arr[i]=n;
		}
		for(int i=0;i<arr.length;i+=2) {
			sum += arr[i];
		}System.out.println(sum);

	}

}
