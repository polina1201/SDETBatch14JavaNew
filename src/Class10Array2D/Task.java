package Class10Array2D;

public class Task {
    public static void main(String[] args) {
        /*Create a 2D array(shorter way) in which first array will consist of 4 names and second
         * array will contain grades. Then your program should print name of the students
         * that has A and B grade
         */

        String[][]arr= {
                {"Yusuf", "Hamza", "Adam","John"},
                {"A","B","C","D"}
        };
        System.out.println(arr[0][0]+"="+arr[1][0]);
        System.out.println(arr[0][2]+"="+arr[1][2]);

        for(String[]singleArray:arr) {//loops over 1d or single array

            for(String el:singleArray) {//loops over each element of teh 1d array

                System.out.print(el+" ");
            }
            System.out.println();
        }



        for(int i=0; i<arr.length; i++) {

            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }



        System.out.println();

        /*Create a 2D array (longer way)where you will store the following
         * values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
         * After storing values print following String:
         * Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
         *
         */

        String[][] big=new String[2][4];
        big[0][0]="Mr";
        big[0][1]="Mrs";
        big[0][2]="Ms";
        big[0][3]="Miss";

        big[1][0]="Smith";
        big[1][1]="Jordan";
        big[1][2]="Jackson";
        big[1][3]="Obama";

        System.out.println(big[0][1]+" "+big[1][0]+" ");
        System.out.println(big[0][0]+" "+big[1][3]+" ");
        System.out.println(big[0][2]+" "+big[1][2]+" ");
        System.out.println(big[0][3]+" "+big[1][1]+" ");
    }

}
