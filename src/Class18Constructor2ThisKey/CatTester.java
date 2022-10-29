package Class18Constructor2ThisKey;

public class CatTester {
    public static void main(String[] args) {
        Cat cat=new Cat("kitty",
                "Dsh",10,4);

        cat.printInfo();

        Cat cat2=new Cat("Chinki","Leo");
        cat2.printInfo();
    }
}
