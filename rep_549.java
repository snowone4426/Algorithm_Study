package rep_3;
import java.util.Scanner;

public class rep_549 {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		int sum=0;
		int a=0;
		for(int i=1;sum<n;i+=2) {
			sum +=i;
			a++;
		}
		System.out.println(a+" "+sum);

	}

}
