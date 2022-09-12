package array;
import java.util.Scanner;

public class Array_156 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr= new int [100];
		int num =0;
		int min = arr[0];
		int max = arr[0];
		int a=0;
		if(num <1000 || num>-1000) {
		for(int i=0;i<arr.length;i++) {
			num = input.nextInt();
			arr[i]=num;
			a++;
			if(num==999) {
				break;	
			}
			
		}
		for(int i=0;i<a-1;i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);}
		}System.out.println(max);
		System.out.println(min);
		}
		
	

}
