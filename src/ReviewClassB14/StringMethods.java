package ReviewClassB14;

public class StringMethods {

    public static void main(String[] args) {

         String str="hello";
        //toUpperCase or toLowerCase

        str.toUpperCase();
        System.out.println(str);//hello

        System.out.println("---------------");

        str=str.toUpperCase();//HELLO
        System.out.println(str);

        System.out.println("---------------");

        //length() ->gives size
        int size=str.length();
        System.out.println(size);

        //charAt() ->Returns the char value at the specified index

        char letter=str.charAt(4);
        System.out.println(letter);//H
        //how to get last Character?
        char lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);//0

        //indexOf
        int index=str.indexOf(lastCharacter);
        System.out.println(index);//4

        System.out.println(str.indexOf('a'));//-1
        System.out.println(str);

        //isEmpty() ->returns true if length is more than 0
        boolean empty=str.isEmpty();
        System.out.println(empty);
    }
}
