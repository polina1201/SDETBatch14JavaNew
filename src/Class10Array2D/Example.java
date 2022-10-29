package Class10Array2D;

public class Example {
    public static void main(String[] args) {

        String[]week= {"Monday", "Sunday", "Tuesday", "Thursday","Friday"};
        for (String day:week)

            //if day is Sunday --> it is a fun day
            //otherwise - it is a boring day

            if(day.equals("Sunday")) {
                System.out.println(day+" is a fun day");
            }else if(day.equals("Friday"))
            {System.out.println(day+" is a relax day");
            }else {
                System.out.println(day+" is a boring day");
            }



    }
}
