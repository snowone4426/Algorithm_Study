package array;
import java.util.Scanner;

public class Array_556_1 {

	public static void main(String[] args) {
	
		int [] a = new int [10];
		
		Scanner input = new Scanner(System.in);
	
		for(int i = 0;i<a.length;i++) {
			int num = input.nextInt();
			a[i] = num;
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		
		
	}

}
