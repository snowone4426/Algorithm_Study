package array;
import java.util.Scanner;

public class Array_150 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] arr = new String [10];
		String a="";
		for(int i=0;i<arr.length;i++) {
			a=input.next();
			arr[i]=a;
		}
		for(int i=9;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
