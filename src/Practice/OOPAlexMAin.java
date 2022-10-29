package Practice;

public class OOPAlexMAin {
    public static void main(String[] args) {
        OOPAlexLee p=new OOPAlexLee();
        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        System.out.println(p.clicked);

        p.click();
        System.out.println(p.clicked);
        p.twisted();
        System.out.println(p.twisted);


    }
}
