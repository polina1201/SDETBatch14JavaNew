package Repls;

public class Rep119ReplaceMethod {
    void censorletter(String word,char sign){
        System.out.println(word.replace(sign,'*'));
    }

    public static void main (String[]args){
        Rep119ReplaceMethod obj=new Rep119ReplaceMethod();
        obj.censorletter("computer science",'e');
        obj.censorletter("trick or treat",'t');
    }
}
