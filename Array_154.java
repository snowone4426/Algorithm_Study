package array;
import java.util.Scanner;

public class Array_154 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double [] arr = new double [6];
		double num =0;
		double sum = 0;
		double avg = 0;
		int a = 0;
		for(int i=0;i<arr.length;i++) {
			num=input.nextDouble();
			arr[i]=num;
			sum += arr[i];
			a++;
			
		}
		avg = (double) sum/a;
		System.out.printf("%.1f",avg);

	}

}
