package array;
import java.util.Scanner;

public class Array_562 {

	public static void main(String[] args) {
		int [] a = new int [10];
		Scanner input = new Scanner (System.in);
		int sum = 0;
		int sum1 =0;
		double avg = 0;
		int b=0;
		for(int i=0;i<a.length;i++) {
			a[i]=input.nextInt();
			if(i%2!=0) {
				sum += a[i];
			}
			else if (i%2==0) {
				
				sum1 += a[i];
				b++;
				} 
		}
		avg = (double) sum1 /b;
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",avg);
	
	}

}
