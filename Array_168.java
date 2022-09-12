package array;
import java.util.Scanner;

public class Array_168 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int num=0;
		num = input.nextInt();
		
		int [][] arr = new int [num][num];
		for(int i=0;i<num;i++) {
			arr[i][0]=1;
		
			arr[i][i]=1;
		}
		for(int i=2;i<num;i++) {
			for(int j=1;j<num;j++) {
				arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
			}
		}
		for(int i=num-1;i>=0;i--) {
			for(int j=num-1;j>=0;j--) {
				if(arr[i][j]!=0) {
				System.out.print(arr[i][j]+" ");}
			}System.out.println();
			
		}
		
	}

}
