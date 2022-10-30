package ReviewClass05;

import java.util.Arrays;

public class ArraysDemo3 {

	public static void main(String[] args) {
		   // creates an array store elements in the array 
        // then with help of another array adds all the elements.
        int size=10;
        int [] arr=new int[10];
        int start=11;
        for(int i=0; i<arr.length;i++) {

            arr[i]=start;
            start--;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("***********");
        int sum=0;
        for(int num:arr) {
            //sum+=num;
            sum=sum+num;
        }
        System.out.println(sum);

    }

}
