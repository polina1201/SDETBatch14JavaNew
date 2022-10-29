package Class10Array2D;

public class TwoDArray {
    public static void main(String[] args) {


        //[row][col]
        int[][]bigArray=new int[3][4];
//1 row
        bigArray[0][0]=10;
        bigArray[0][1]=20;
        bigArray[0][2]=30;
        bigArray[0][3]=40;

//2 row
        bigArray[1][0]=100;
        bigArray[1][1]=200;
        bigArray[1][2]=300;
        bigArray[1][3]=400;

//3 row
        bigArray[2][0]=1;
        bigArray[2][1]=2;
        bigArray[2][2]=3;
        bigArray[2][3]=4;

//how to access elements from 2D array?

        System.out.println(bigArray[1][2]);



    }
}
