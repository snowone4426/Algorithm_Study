package array2;

public class array165 {

	public static void main(String[] args) {
				
		int [][] arr = new int [7][7];
		arr[0][0] = 1;
		arr[0][2] = 1;
		arr[0][4] = 1;
				
		for(int i = 1; i < arr.length-2; i++) {
			
			for(int j = 1; j <arr[i].length-2; j++) {
				
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j+1];
				arr[i][0] = arr[i-1][1];
			}
			
		}	
		
		for(int i = 0; i < arr.length-2; i++) {
			
			for(int j = 0; j < arr[i].length-2; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}	
	}
}
