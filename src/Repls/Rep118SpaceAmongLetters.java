package Repls;

public class Rep118SpaceAmongLetters {
    void result (String word){
        String space=" ";
        for (int i=0;i<word.length();i++){
            System.out.print(word.charAt(i)+space);
        }
    }
    public static void main (String[]args){
        Rep118SpaceAmongLetters obj=new Rep118SpaceAmongLetters();
        obj.result("hello");
    }
}
