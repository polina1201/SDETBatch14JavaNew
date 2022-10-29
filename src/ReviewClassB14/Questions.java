package ReviewClassB14;

public class Questions {
    public static void main(String[] args) {

        //How would you reverse a String without using reverse function?
        /* 1. use StringBuilder and reverse method
           2. use CharAt();
           3. us toCharArray();
         */
String str="hello";
String newString=""; //2nd method

for(int i=str.length()-1; i>=0; i--){
    newString=newString+str.charAt(i);
}


String s="Class is almost over";
StringBuilder sb=new StringBuilder(s);
sb.reverse();
        System.out.println(sb);
    }
}
