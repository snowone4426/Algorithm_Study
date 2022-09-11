package array;
import java.util.Scanner;

public class Array_152 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = new int[10];
		int sum_odd = 0;
		int sum_even = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i]= input.nextInt();
			
			if(i%2==0) {
				sum_odd += arr[i];
			}
			else {
				sum_even += arr[i];
			}
			
		}System.out.println(sum_odd);
		System.out.println(sum_even);
	}

}
