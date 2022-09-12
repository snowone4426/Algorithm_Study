package array;

public class Array_165 {

	public static void main(String[] args) {
		int [][] arr = new int [5][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=0;
			}
		}
		arr [0][0]=1;
		arr[0][2]=1;
		arr[0][4]=1;
		
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(j==0) {
					arr[i][j] = arr[i-1][j+1];
				}
				else if(j==4) {
					arr[i][j]=arr[i-1][j-1];
				}
				else
				arr[i][j] = arr[i-1][j-1]+arr[i-1][j+1];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		

	}

}
