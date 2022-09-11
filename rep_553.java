package rep_3;
import java.util.Scanner;

public class rep_553 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		char a ='A';
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--,a++) {
				System.out.print(a);
				
			}System.out.println();
		}

	}

}
