package Class24EncapsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionsFramework {
    public static void main(String[] args) {
        //If we have to store a single value we should use variables
        String name="Polina";
        String name2="Josh";
        System.out.println(name);
        System.out.println(name2);

        //If we have to store more than 2 values of same kind, then we should go with Arrays
        String[]names={"Polina", "Josh","Adam","Connor"};

        //*Problem w/array = They are fixed in size
        String []breeds=new String[10];
        breeds[0]="Bulldogs";
        System.out.println(Arrays.toString(breeds));

        ArrayList<String>colors=new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        System.out.println(colors);
        //in ArrayList we don't need to specify the amount of names/colors
    }
}
