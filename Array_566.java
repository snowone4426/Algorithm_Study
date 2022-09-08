package array;
import java.util.Scanner;

public class Array_566 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int [] arr = new int [100];
	arr[0]=100;
	arr[1]= input.nextInt();
	int a=0;
	for(int i=2;i<arr.length;i++) {
		arr[i]= arr[i-2]-arr[i-1];
		a++;
		if(arr[i]<0) {
			break;
		}
		
	}
	for(int i=0;i<a+2;i++) {
	System.out.print(arr[i]+" ");
	}
	}

}
