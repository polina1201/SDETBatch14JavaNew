package Class09Arrays;

public class ArrayFixedSize {
    public static void main(String[] args) {


        int[]num=new int[3];

        num[1]=12;
        num[2]=13;

        System.out.println(num[0]);

        String[]colors=new String[3];

        colors[0]="White";
        colors[1]="Pink";
        colors[2]="Black";
//colors[3]="Yellow";//ArrayIndexOutOfBoundsException:3 // there are total of [3]; colors[3] is
//4th number

        System.out.println(colors[2]);


    }
}
