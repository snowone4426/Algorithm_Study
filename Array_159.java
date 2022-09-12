package array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array_159 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n=input.nextInt();
		int sc=0;
		Integer [] arr = new Integer [n];
		for(int i=0;i<arr.length;i++) {
			sc=input.nextInt();
			arr[i]=sc;
		}
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
