package Class09Arrays;

public class HW3and4and5 {

    public static void main(String[] args) {

        /*Create an array on integers and calculate the sum of all elements in an array
         *
         */

        int[]array= {10, 15, 20, 25};
        int sum=0;
        for(int i=0; i<array.length; i++) {

            sum+=array[i];}

        System.out.println(sum);

//another way

        sum=0;
        for(int number:array) {
            sum+=number;
        }
        System.out.println(sum);


        /*From an array of integer elements find the largest number.
         *
         */

        int[]num = {5,10,15,58,16};
        int largest=num[0];

        for(int n:num) {
            if(n>largest) {
                largest=n;
            }

        }System.out.println("The largest number is "+largest);

        //Another Way

        for (int i=0; i<num.length; i++) {
            if (num[i]>largest) {
                largest=num[i];
            }
        }System.out.println(largest);

        /*Create an array to store char values and then print those in reverse order
         *
         */

        char[]letter= {'A','B','C','D','E','F'};

        for(int i=letter.length-1; i>=0; i--) {
            System.out.print(letter[i]+" ");
        }


    }

}
