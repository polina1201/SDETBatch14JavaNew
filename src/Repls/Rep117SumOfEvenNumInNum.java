package Repls;

public class Rep117SumOfEvenNumInNum {
    void sumEven(int number){
        int sum=0;
        for (int i=0;i<=number;i++){
            if (i%2==0){
                sum+=i;
            }
        } System.out.println(sum);
    }
    public static void main (String[]args){
        Rep117SumOfEvenNumInNum obj=new Rep117SumOfEvenNumInNum();
        obj.sumEven(5);
        obj.sumEven(8);
    }

}
