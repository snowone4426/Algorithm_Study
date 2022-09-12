package re;

import java.util.Scanner;

public class re549 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int sum = 0;
		int a = 0;
		
		for (int i = 1;i < num; i+=2) {
			a++;
			sum += i;
			if(sum >= num) {
				break;
			}
		}
		System.out.println(a + " " + sum);	
	}
}
