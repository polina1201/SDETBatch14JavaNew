package Class12StringClass;

public class StringDemo5 {

    public static void main(String[] args) {

        String str="I love java programming";
        /*
         * charAt returns us the character at a specific index
         */
        System.out.println(str.charAt(4));

        for(int i=0; i<str.length();i++) {
            //print only the characters not spaces
            if(!(str.charAt(i)==' ')) {

                System.out.print(str.charAt(i)+" ");
            }

        }

    }
}
