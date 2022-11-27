package Repls;

public class Rep116BooleanMethod {
    boolean Rep116BooleanMethod(int number1, int number2){
        boolean iseven=true;
        if (number1%2==0 && number2%2==0){
            return iseven;
        } else {
            return (!iseven);
        }
    }
    public static void main (String[]args){
        Rep116BooleanMethod obj=new Rep116BooleanMethod();
        System.out.println(obj.Rep116BooleanMethod(4,6));
        System.out.println(obj.Rep116BooleanMethod(3,4));
        System.out.println(obj.Rep116BooleanMethod(-1,1));
    }
}
