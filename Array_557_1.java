package array;
import java.util.Scanner;

public class Array_557_1 {

	public static void main(String[] args) {
		String [] a = new String [10];
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			String num= input.next();
			a[i]= num;
		}
		for(int i = 0;i<7;i+=3) {
		
			System.out.print(a[i]+" ");
		}
	}

}
