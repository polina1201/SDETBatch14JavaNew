package Class12StringClass;

public class StringDemo3 {

    public static void main(String[] args) {

        String str=" i love java ";
        System.out.println(str);
        System.out.println(str.trim()); // Remove the spaces before and after the String but not the ones which are present in between



        String str2="Java is Very easy";
        /*
         * startsWith=> checks if a String starts with a specific letter or word
         * endsWith=> checks if a String Ends with a specific letter or word
         * contains=> checks if a String Contains a specific letter or word
         */
        System.out.println(str2.startsWith("J"));
        System.out.println(str2.endsWith("y"));
        System.out.println(str.contains("very"));
		/*
		 * Method chaining helps us call multiple methods on a single line one
		method after another
		 */
        System.out.println(str2.toLowerCase().contains("very"));
    }
}
