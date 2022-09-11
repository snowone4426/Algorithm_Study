package array;


public class Array_570 {

	public static void main(String[] args) {
		int arr [][] = new int [5][5]; 
		arr[0][0]=1; 
		arr[0][1]=1;
		arr[0][2]=1;
		arr[0][3]=1;
		arr[0][4]=1;
		
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr[i].length;j++) {
				arr[i][0]=arr[i-1][0];
				arr[i][j]= arr[i-1][j]+arr[i][j-1];
				
			}
		} 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		} 		
				
				
				
		

	}

}
