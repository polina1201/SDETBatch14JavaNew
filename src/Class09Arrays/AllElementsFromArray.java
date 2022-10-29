package Class09Arrays;

public class AllElementsFromArray {

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            String[]iceCream= {"vanilla", "chocolate", "pistachio", "coffee"};

            System.out.println(iceCream[0]);
            System.out.println(iceCream[1]);

            System.out.println("-------------");
            //how to get all values?

            for (int i=0; i<iceCream.length; i++) {
                System.out.println(iceCream[i]);
            }

            System.out.println("-------------");

            char[]letter= {'A','B','C','D','E','F'};

            for(int i=0; i<letter.length; i++) {
                System.out.print(letter[i]+" ");
            }


        }
}
