package Class12StringClass;

public class StringDemo8 {

    public static void main(String[] args) {

        //Replace method replaces one String with another in a String
        //replaceAll - takes a pattern and replaces all the characters that follow that pattern.
        String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
        System.out.println(str.replace("good", "Excellent"));
        System.out.println(str.replaceAll("[a-z]", "#"));

    }

}
