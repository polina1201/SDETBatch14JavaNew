package Repls;

public class Rep112ForLoop10Num {
    void numbers (int times){
        for (int i=1;i<=times;i++){
            System.out.println(i);
        }
    }
    public static void main(String[]args){
        Rep112ForLoop10Num obj=new Rep112ForLoop10Num();
        obj.numbers(10);
    }
}
