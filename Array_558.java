package array;
import java.util.Scanner;

public class Array_558 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] a = new int [100];
		int b = 0;
		for(int i = 0;i<a.length;i++) {
			int n = input.nextInt();
			a[i]=n;
			b++;
			if(n==0) {
				break;	
				
			}
		}
		for(int i =b-2;i>=0;i--) {
			System.out.print(a[i]+" ");
		}

	}

}
