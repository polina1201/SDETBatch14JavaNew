package Class14CreateObjMethods;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {

        String str="jsafaAKDLSDFsfdk342378%#@#";
        str=str.replaceAll("[^a-zA-Z]","");
        System.out.println("str = "+str);

        String sentence="Batch 14 is Great. Batch 14 is excellent? Batch 14 is just amazing";
        String[] split = sentence.split(".?!");
        System.out.println("split = "+ Arrays.toString(split));

     String str2=" Batch 14 is Great.Batch 14 is Great.";
        String replace = str2.replaceFirst("Great", "good");
        System.out.println(replace);


    }
}
