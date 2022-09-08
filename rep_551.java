package rep_3;
import java.util.Scanner;

public class rep_551 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) { 
				System.out.print(" ");
				
			}
			for(int j=n-i;j>0;j--) {
				System.out.print("*");
			}System.out.println();
			
		}

	}

}
