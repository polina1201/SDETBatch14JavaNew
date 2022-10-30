package Class02NonPrimitive;

public class Homework {

	public static void main(String[] args) {

		  /* Task 1
		  *Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		  *“The __ of 2 numbers __ and_ is equal to __”
		  * 
		  * Task 2
		  * Write a program to find the square of the number 3.9.
		  * “The square of_ is_ “
		  * 
		  * Task 3
		  * Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
		  * “The perimeter of a rectangle with width_and height __is equal to __ and the area is __”
		 */
						
		double num, num2, num3, num4, add, subtract, multiply, divide, square, width, height, perimeter, area;
		
	num=25.5;
	num2=5.5;
	add=num+num2;
	subtract=num-num2;
	multiply=num*num2;
	divide=num/num2;
			
	System.out.println("The sum of 2 numbers "+num+ " and "+num2+" is equal to "+add);
	System.out.println("The difference of 2 numbers "+num+" and "+num2+" is equal to "+subtract);		
	System.out.println("The product of 2 numbers "+num+" and "+num2+" is equal to "+multiply);
	System.out.println("The result of 2 numbers "+num+" and "+num2+" is equal to " +divide);
	System.out.println();
	
	num3=3.9;
	square=num3*num3;
	
	System.out.println("The square of "+num3+ " is "+square);
	System.out.println();
	
	width=5;
	height=8;
	perimeter=2*(width+height);
	area=width*height;
	
	System.out.println("The perimeter of a rectangle with width "+width+" and height " +height+" is equal to "+perimeter+" and the area is "+area);
	}

}
