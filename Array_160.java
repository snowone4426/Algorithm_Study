package array;
import java.util.Scanner;

public class Array_160 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int [10];
		int num=0;
		int a=0;
		for(int i=0;i<arr.length;i++) {
			num= input.nextInt();
			arr[i]= num;
			a++;
		}
		int [] cnt = new int [6];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==1) {
			
			cnt[0]++;
		}
		else if (arr[i]==2) {
			
			cnt[1]++;
		}
else if (arr[i]==3) {
			
			cnt[2]++;
		}
else if (arr[i]==4) {
	
	cnt[3]++;
}
else if (arr[i]==5) {
	
	cnt[4]++;
}
else if (arr[i]==6) {
	
	cnt[5]++;
}
		
		
		}System.out.println("1 : "+cnt[0]);
		System.out.println("2 : "+cnt[1]);
		System.out.println("3 : "+cnt[2]);
		System.out.println("4 : "+cnt[3]);
		System.out.println("5 : "+cnt[4]);
		System.out.println("6 : "+cnt[5]);
		
		
		

	}

}
