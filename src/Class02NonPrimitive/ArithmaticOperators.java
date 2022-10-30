package Class02NonPrimitive;

public class ArithmaticOperators {

	public static void main(String[] args) {
		
		//+, -, *, /, %
		
		int a=900;
		int b=100;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		int c=10;
		int d=3;
		
		int sum=c+d;
		int sub=c-d;
		int remainder=c%d; // 10%3=1
		int div=c/d; // 10/3=3
		
		double num1=10.0;
		double num2=3.0;
		
		System.out.println("sum is = "+sum);
		System.out.println("sub is = "+sub);
		System.out.println("Remainder is = "+remainder);
		System.out.println("Division of integers =" +num2);//3
		System.out.println("Division of double = "+num1/num2);
		System.out.println(num1%num2);
		
		float number1=10.0f;
		float number2=3.0f;
		
		System.out.println("Division of float ="+number1/number2);
		
		
		
		System.out.println(num1/num2);
		
		int e=10;
		int f=5;	
		
		System.out.println("division = "+e/f);
		System.out.println("remainder =" + e%f);
		System.out.println(20%4);
		
		//remainder - % - mod operator
		
		System.out.println(16%5);
		
		System.out.println(10+10/10); //1
		System.out.println((10+10)/10); //2
		
		
		

	}

}
