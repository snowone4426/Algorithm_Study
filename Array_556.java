package array;
import java.util.Scanner;

public class Array_556 {

	public static void main(String[] args) {
		int [] arr = new int [10];
		int a=1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=a;
			a++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
