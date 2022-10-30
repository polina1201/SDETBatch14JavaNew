package ReviewClass05;

public class Array2DDemo1 {

	public static void main(String[] args) {
		
		String[]individulasInRoom1=new String[] {"Sabej", "Shah", "Mina"};
		String[]individulasInRoom2=new String[] {"Roman","Mina"};
		String[]individulasInRoom3=new String[] {"Asad", "Priyasri", "Ali"};
		
		//2D array that will store 3 single D arrays
		String[][]rooms=new String[3][];
		
		
		rooms[0]=individulasInRoom1;
		rooms[1]=individulasInRoom2;
		rooms[2]=individulasInRoom3;
		
		System.out.println(rooms[1][1]);
		
		
	}

}
