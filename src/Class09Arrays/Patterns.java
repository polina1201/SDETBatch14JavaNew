package Class09Arrays;

public class Patterns {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for (int i = 1; i <= 4; i++) { // rows (outside loop)

            for (int j = 1; j <= 3; j++) {// column (inside loop)

                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");


        for (int i = 1; i <= 4; i++) { // rows (outside loop)

            for (int j = 1; j <= 3; j++) {// column (inside loop)

                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        for (int i = 1; i <= 5; i++) { // rows (outside loop)

            for (int j = 1; j <= 3; j++) {// column (inside loop)

                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");




    }
}
