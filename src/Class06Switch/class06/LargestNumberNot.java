package Class06Switch.class06;

public class LargestNumberNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=100;
		int n2=200;
		int n3=10000;
		int largest =0;

		if(n1>n2 && n1>n3) {
			largest=n1;
		}else if (n2>n3 && n2>n1) {
			largest=n2;			
		}else if(n3>n1 && n3>n2) {
			largest=n3;
			}
	if(largest!=0) {
		
        if(largest % 2 == 0) {
            System.out.println(largest+ " is an Even number.");
        }else {
            System.out.println(largest+ " is an Odd number.");
        }
	}
	}

}

	
	




	


