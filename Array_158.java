package array;
import java.util.Scanner;

public class Array_158 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = new int [100];
		int num = 0;
		int a=0;
		int even=0;
		int odd = 0;
		for(int i=0;i<arr.length;i++) {
			num = input.nextInt();
			a++;
			if(num==0) {
				break;
			}
			if(num%2==0) {
				even=num/2;
				arr[i]=even;
			}
			else if (num%2!=0) {
				odd = num*2;
				arr[i]=odd;
			}
			
		}
		System.out.println(a-1);
		for(int i=0;i<a-1;i++) {
			
		System.out.print(arr[i]+" ");
		
	}}

}
