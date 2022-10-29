package Class14CreateObjMethods;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {

        //StringBuilder and StringBuffer are the exact same thing and used interchangeably
        StringBuilder stringBuilder=new StringBuilder("Today is Java Class");
        StringBuffer stringBuffer=new StringBuffer("Today is Java Class");

        //Convert String into StringBuilder
        String str="Java is very easy";
        StringBuilder stringBuilder1 = new StringBuilder(str);
        System.out.println("stringBuilder1= "+stringBuilder1);

        //Convert StringBuilder to String
        String newStr=stringBuilder1.toString();


    }
}
