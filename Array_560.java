package array;
import java.util.Scanner;

public class Array_560 {

	public static void main(String[] args) {
		int [] a = new int [10];
		Scanner input = new Scanner(System.in);
		for(int i =0;i<a.length;i++) {
			a[i]= input.nextInt();
			
		}
//		int imin =1000;
//		for(int i : a) { imin = Math.min(i, imin);}
//		System.out.println(imin);
		
		
		int min = a[0];
		for(int i =0; i < a.length;i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println(min);
		
	}

}
