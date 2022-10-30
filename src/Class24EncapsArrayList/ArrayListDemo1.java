package Class24EncapsArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //Syntax to create an arrayList
        ArrayList<String>colors=new ArrayList<>();
        //use add method to insert elements in an ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        //Prints all the elements
        System.out.println(colors);
        //get method prints individual elements from ArrayList
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));

        //print the size
        System.out.println(colors.size());

        //for loop - getting all the elements
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i)+" ");
        }
        System.out.println("**************");

        //enhanced for loop - getting all the elements
        for (String color:colors){
            System.out.println(color);
        }



    }
}
