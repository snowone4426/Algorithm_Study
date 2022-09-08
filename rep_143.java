package rep_3;
import java.util.Scanner;

public class rep_143 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=2*(n-i)+1;j>0;j--) {
				System.out.print("*");
			}System.out.println();
			
			
		}
		for(int i =1;i<n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=2*(n-i)+1;j<=2*n-1;j++) {
				System.out.print("*");
			}System.out.println();
			
			
		}
	}

}
