package array;
import java.util.Scanner;

public class Array_559 {

	public static void main(String[] args) {
		double [] avg = new double [6];
		avg[0]=85.6;
		avg[1]=79.5;
		avg[2]=	83.1;
		avg[3]=80.0;
		avg[4]=78.2;
		avg[5]=75.0;
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();
		int b = input.nextInt();
		double sum = avg[a-1]+avg[b-1];
			System.out.printf("%.1f",sum);
			
		

	}

}
