package rep_3;
import java.util.Scanner;

public class rep_145 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++) {
				cnt++;
				System.out.print(cnt);
				
			}System.out.println();
			
		}

	}

}
