package ReviewClass05;

import java.util.Arrays;

public class Array2Ddemo2 {

	public static void main(String[] args) {
		//how to find the smallest number out of 2d array
		
		int[][]arr=new int[][] {
			{10,20,30},
			{25,25,63, 45}
			
		};
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(arr[1][2]);
		
		int smallest=arr[0][0];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]<smallest) {
				smallest=arr[i][j];	
				}
				
			}
				
		}System.out.println(smallest);
	}

}
