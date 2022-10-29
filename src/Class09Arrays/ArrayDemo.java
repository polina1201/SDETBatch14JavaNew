package Class09Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr=new int[4]; //arr is just a name of a variable

        //store elements inside an array
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;

        //accessing elements from the array
        System.out.println(arr[2]); //30

        System.out.println(arr[1]+arr[2]);//20+30=50

        System.out.println("-----------------");//Lets create an array and store your classmates names

        String[] names=new String[5];
        names[0]="Shah";
        names[1]="Vera";
        names[2]="Roman";
        names[3]="Polina";
        names[4]="Zoe";

        System.out.println("hello "+names[1]);


    }
}
