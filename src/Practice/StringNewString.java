package Practice;

public class StringNewString {/*
Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
Expected Output:
Welcome Syntax family
 */

        public static void main(String[] args) {
            String given = "Hello Syntax friends";
            String newString = given.replace("Hello", "Welcome");
            String newString2 = newString.replace("friends", "family");
            System.out.println(newString2);
        }
}
