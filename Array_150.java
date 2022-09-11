package array;
import java.util.Scanner;

public class Array_150 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] arr = new String [10];
		int b=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.next();
			b++;
			
		}
		for(int i=b-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
