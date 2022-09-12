package array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array_563 {

	public static void main(String[] args) {
		Integer [] arr = new Integer [10];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]= input.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}}

}
