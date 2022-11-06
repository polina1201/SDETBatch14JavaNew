package Class25Wrappers;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {

        int num=10;
        //boxing or manual conversion from primitive to wrapper. From Java 1
        //Integer wrappedNum=Integer.valueOf(num);

        //AutoBoxing or automatic conversion of a primitive to a wrapper type. What we use now
        Integer wrappedNum=num;
        System.out.println(wrappedNum);
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);

        //unboxing
        int num2=wrappedNum;
    }
}
