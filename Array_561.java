package array;
import java.util.Scanner;

public class Array_561 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr= new int [10];
		int n=0;
		for(int i=0;i<arr.length;i++) {
			n=input.nextInt();
			arr[i]=n;
		}
		
		int min=10000;
		int max= 0;
		for(int i=0;i<arr.length;i++) {
			max= Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
			if(min>=100||max<100) {
				break;
			}
		}
		
			System.out.println(max+" "+min);
		
		
		
		

	}

}
