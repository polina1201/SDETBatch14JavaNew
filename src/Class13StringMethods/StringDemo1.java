package Class13StringMethods;

import java.util.Arrays;

public class StringDemo1 {


    public static void main(String[] args) {
        String str = "Today is Sunday";
        String str2 = new String("Today is Sunday");
        String day = str.substring(9);
        System.out.println(day);
        System.out.println(str.substring(6, 8));

        char c = str.charAt(3); //calling the method charAt on str object

        char[] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr)); //to print Array as a Char
        //System.out.println(charArr); - converts to a String
        int index = str.indexOf("a");//where the first "a" is
        System.out.println(index);
        System.out.println(str.indexOf("a", 6));//Start counting from 6th letter to find an "a"


    }
}
