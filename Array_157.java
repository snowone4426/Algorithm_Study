package array;
import java.util.Scanner;

public class Array_157 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = new int [100];
		int num = 0;
		int a=0;
		int b=0;
		int sum=0;
		int cnt=0;
		double avg=0;
		for(int i = 0;i<arr.length;i++) {
			num = input.nextInt();
			arr[i]= num;
			a++;
			if(num==0) {
				break;
			}
			if(arr[i]%5==0) {
				b++;
				cnt =b;
				sum +=num;
				avg = (double) sum/b;
			
		}
		}System.out.println(cnt);
		System.out.println(sum);
		System.out.printf("%.1f",avg);
	}

}
