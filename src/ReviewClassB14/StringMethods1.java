package ReviewClassB14;

public class StringMethods1 {
    public static void main (String [] args){

        String textFromApplication=" Enroll today ";
        String textFromUserStory="Enroll today";

        if(textFromApplication.trim().equals(textFromUserStory)){
            System.out.println("Text is matched. Test Pass");
        }else {
            System.out.println("Text is Not matched. Test Failed");
        }

        System.out.println(textFromApplication.trim());
        System.out.println(textFromApplication);

        //substring

        String str="Hello Class";
        String part2=str.substring(6); //Class
        System.out.println(part2);

        String part1=str.substring(0,5);//Hello
        System.out.println(part1);

        //concat

        String newString=part1.concat(" ").concat(part2);
        System.out.println(newString);

        System.out.println(part1+" "+part2);//same as above concat

        //some examples

        char single=newString.substring(6).charAt(0);//C
        System.out.println(single);

        //newString.charAt(0).substring(6); ->compiler error

        //replace(); ->replaces one value with another

        String myString="Today is September";
        myString=myString.replace("September", "October");
        System.out.println(myString);

        myString=myString.replace('A', 'W');//Doesn't replace if no value found
        System.out.println(myString);

        //split (); -> Splits this string around matches of the given regular expression.

        String myStr="Today is a review class";
        String[] array= myStr.split(" ");
        System.out.println(array.length); //5
        System.out.println(array[3]); //review

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        //other way
        for(String arr:array){
            System.out.println(arr);
        }
    }
}
