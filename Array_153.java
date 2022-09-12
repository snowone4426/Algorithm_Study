package array;
import java.util.Scanner;

public class Array_153 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = new int [100];
		int num=0;
		int b=0;
		for(int i = 0;i<arr.length;i++) {
			num= input.nextInt();
			arr[i]=num;
			b++;
			if(num==-1) {
				break;
			}
			
		}
		
		if(b<4) {
			for(int i=0;i<b-1;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		else if (b>=3)
		{for(int i=b-4;i<b-1;i++) {
			System.out.print(arr[i]+" ");
		}}

	}

}
