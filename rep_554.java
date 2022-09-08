package rep_3;
import java.util.Scanner;

public class rep_554 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a=1;
		char ch = 'A';
		for(int i=0;i<n;i++) {
			
			for(int j=n-i;j>0;j--,a++) {
				System.out.print(a);
			}
			for(int j=0;j<=i;j++,ch++) {
				System.out.print(ch);			}
		System.out.println();
		}

	}

}
