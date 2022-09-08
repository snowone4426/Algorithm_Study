package array;
import java.util.Scanner;


public class Array_555_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String [] a = new String [10];
		for(int i=0;i<a.length;i++) {
			String alp  = input.next();
			a[i]= alp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}
