package array;
import java.util.Scanner;

public class Array_151 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = new int [5];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i]= input.nextInt();
			if(i%2==0) {
				sum += arr[i];
				
			}
		}System.out.println(sum);
		
		
	}

}
