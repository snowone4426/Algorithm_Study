package array2;

import java.util.Scanner;

public class array161 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int [100];
		int[] in = new int[11];
		
		
		for(int i = 0; i < arr.length;i++) {
			arr[i] = input.nextInt();
			
			if(arr[i] == 0) {
				break;
			}
		
			if(arr[i] / 10 == 10) {
				in[10]++;
			}
			else if(arr[i] / 10 >= 9) {
				in[9]++;
			}
			else if(arr[i] / 10 >= 8) {
				in[8]++;
			}
			else if(arr[i] / 10 >= 7) {
				in[7]++;
			}
			else if(arr[i] / 10 >= 6) {
				in[6]++;
			}
			else if(arr[i] / 10 >= 5) {
				in[5]++;
			}
			else if(arr[i] / 10 >= 4) {
				in[4]++;
			}
			else if(arr[i] / 10 >= 3) {
				in[3]++;
			}	
			else if(arr[i] / 10 >= 2) {
				in[2]++;
			}
			else if(arr[i] / 10 >= 1) {
				in[1]++;
			}
			else if((double)arr[i] / 10 >= 0) {
				in[0]++;
			}
		
		}
		int j = 100;
		for(int i = 10; i >= 0; i--) {
			if(in[i]>0) {
			System.out.println(j + " : " + in[i] + " person");
			
			}
			j-=10;
		}
	}
}
