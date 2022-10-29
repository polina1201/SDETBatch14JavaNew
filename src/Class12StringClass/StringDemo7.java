package Class12StringClass;

public class StringDemo7 {

    public static void main(String[] args) {


        String str="I am always consfused i was kidding";

        //To print the position of the first occurrence of "a","s", " "
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf(" "));

        //To print the position of the first occurrence of the variable target1 and taret2
        String target1="way";
        String target2="ding";
        System.out.println(str.indexOf(target1));
        System.out.println(str.indexOf(target2));


			/*
			 * substring() gives you smaller string from a String we can start the
			starting
			 * part to this method and it will return us the subString from that
			index
			 */
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,11));

        //to convert int into string
        int num=1212121212;
        String numStr=String.valueOf(num).substring(1,5);
        System.out.println(numStr);
        num=Integer.parseInt(numStr); //to convert back into integer
        System.out.println(num);


    }

}
