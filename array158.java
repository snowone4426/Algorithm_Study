package array1;

import java.util.Scanner;

public class array158 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] arr = new int [100];
		int a = 0;
		
		for (int i = 0; i < arr.length ; i++) {
			
			a++;
			int num = input.nextInt();
			
			if (num == 0) {
				break;
			}
			else if(num % 2 != 0) {
				num *= 2;
				arr[i] = num;
			}
			
			else if(num % 2 ==0){
				
				num = num / 2;
				
				arr[i] = num;
				
			}
			
		}
		
		System.out.println(a-1);
		
		for(int j = 0; j <a-1 ; j++) {
			
			System.out.print(arr[j] + " ");
			
		}	
	}
}