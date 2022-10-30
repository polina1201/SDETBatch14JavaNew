package ReviewClass03;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
				int day=scanner.nextInt();
		String name;
		
		if(day==1) {
			name="monday";
		}else {
			name="Funday";
		}
		System.out.println(name);

	}

}
