package Class09Arrays;

public class Recap {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for (int i = 1; i < 4; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("Hello");
                break;
            }
            System.out.println("Bye");

            System.out.println("---------------------------");

            boolean day = false;
            for (int k = 1; k <= 3; k++) {
                while (day) {
                    System.out.println("Good Day");
                }
                System.out.println(k);
            }
            System.out.println("---------------------------");

            boolean night = true;
            for (int k = 1; k <= 3; k++) {
                while (night) {
                    System.out.println("Good Day");
                    break;
                }
                System.out.println(k);
            }
        }
    }

}
