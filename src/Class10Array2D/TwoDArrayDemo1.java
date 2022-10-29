package Class10Array2D;

public class TwoDArrayDemo1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String[][]countries= {
                {"USA", "Canada"},	//1 array with index 0
                {"Peru", "Brazil", "Colombia", "Ecuador"},//2 array with index 1
                {"Ethiopia", "Egypt", "Kenya"},
                {"Germany","Turkiye", "Moldova", "Ukraine"},
                {"Kazakhstan","Afghanistan", "Korea"}


        };
        System.out.println(countries.length);//5 (to see how many total elements in array

        int elementof1arr=countries[0].length;

        System.out.println("# of elements from 1 array ="+ elementof1arr);

        int elemento2arr=countries[1].length;

        System.out.println("# of elements from 2 array ="+ elemento2arr);

        System.out.println("-------------getting all values from 2D array---------");

        for (int r=0; r<countries.length; r++) { //loops over rows
            for(int c=0; c<countries[r].length; c++) {
                System.out.print(countries[r][c]+" ");
            }
            System.out.println();
        }
    }
}
