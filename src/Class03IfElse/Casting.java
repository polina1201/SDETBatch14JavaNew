package Class03IfElse;

public class Casting {

	public static void main(String[] args) {
		/*
		 * type casting => converting one data type into another data type
		 */

		byte box1=127; //smallest box
		short box2=3333; //slightly large box; double the size of box1 in  terms of bits 16 bits
		int box3=45454545; //large box most commonly used; 32 bits		
		long box4=45454545; //slightly large box
		float box5=414564545; //larger box; store decimals
		double box6=454545445; //largest; store decimals
				
		int number =(int)15.2;// can't store the decimal number in a box of type int
		System.out.println(number);
		
		long smallerBox=(long)box2;
		System.out.println(smallerBox);
		
	short biggerBox=box1;
	
	long box7=(long)box2; //we can do this because box 7 is larger than box1
	//as box6 is larger it is double we need type casting to assign the value
	
	float box8=(float)box6;
	
	char a=(char)67;
	System.out.println(a);
	
	int box9=(int)box4;
	System.out.println(box9);
	
	
		
		
	}

}
