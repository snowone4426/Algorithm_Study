package rep_3;
import java.util.Scanner;

public class rep_141 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int a=0;
		for(int i=1;i<100;i++) {
			a=n*i;
			if(a>100) {break;}
			System.out.print(a+" ");
			if(a%10==0) {break;}
		}
			
		}

	}

