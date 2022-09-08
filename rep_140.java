package rep_3;
import java.util.Scanner;

public class rep_140 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr= new int [20];
		int sum=0;
		int avg=0;
		int a=0;
		for(int i=0;i<arr.length;i++) {
		int n = input.nextInt();
			a++;
			sum +=n;
			if(n==0) {
				break;
			}
		}avg=sum/a;
		System.out.println(sum);
		System.out.println(avg);
		

	}

}
