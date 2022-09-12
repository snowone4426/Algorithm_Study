package array2;

public class array163 {

	public static void main(String[] args) {
		
		int [][] arr = {
				{3, 5, 9},
				{2, 11, 5},
				{8, 30, 10},
				{22, 5, 1}
		};
		
		int sum = 0;
		
		for (int i = 0; i < arr.length;i++) {
			
			for (int j = 0; j < arr[i].length;j++) {
				
				sum += arr[i][j];
			}
		}
		
		for (int i = 0; i < arr.length;i++) {
			
			for (int j = 0; j < arr[i].length;j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}