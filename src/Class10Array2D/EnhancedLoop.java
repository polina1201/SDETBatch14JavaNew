package Class10Array2D;

public class EnhancedLoop {
    public static void main(String[] args) {
        // Getting all Values from 2D array using enhanced for loop

        String[][]countries= {
                {"USA", "Canada"},	//1 array with index 0
                {"Peru", "Brazil", "Colombia", "Ecuador"},//2 array with index 1
                {"Ethiopia", "Egypt", "Kenya"},
                {"Germany","Turkiye", "Moldova", "Ukraine"},
                {"Kazakhstan","Afghanistan", "Korea"}
        };

        for(String[]country:countries) {
            for(String c:country) {
                if(c.equals("Ukraine")) {
                    System.out.println(c+" is my home country");
                }else {
                    System.out.print(c+" ");

                }
                System.out.println();
            }
        }

    }
}
