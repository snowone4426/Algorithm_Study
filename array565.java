package array2;

import java.util.Scanner;

public class array565 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int [] arr = new int [100];
		int [] cnt = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int num = input.nextInt();
			arr[i] = num;
			
			if (num == 0) {
				break;
			}
			
			if(num / 10 >=9) {
				cnt[9]++;
			}
			else if(num / 10 >=8) {
				cnt[8]++;
			}
			else if(num / 10 >= 7) {
				cnt[7]++;
			}
			else if(num / 10 >= 6) {
				cnt[6]++;
			}
			else if(num / 10 >=5) {
				cnt[5]++;
			}
			else if(num / 10 >= 4) {
				cnt[4]++;
			}
			else if(num / 10 >= 3) {
				cnt[3]++;
			}
			else if(num / 10 >= 2) {
				cnt[2]++;
			}
			else if(num / 10 >= 1) {
				cnt[1]++;
			}
			else if((double)num / 10 > 0) {
				cnt[0]++;
			}	
		}
		
		for(int i = 0; i < cnt.length;i++) {
			
			if(cnt[i]>0) {
				System.out.println(i + " : " + cnt[i]);
			}
		}	
	}
}