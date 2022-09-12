package array;
import java.util.Scanner;

public class Array_162 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = new int [10];
		arr[0]=input.nextInt();
		arr[1]=input.nextInt();
		
		for(int i=2;i<10;i++) {
			arr[i]=arr[i-2]+arr[i-1];
			if(arr[i]>=10) {
				arr[i] -=10;
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
