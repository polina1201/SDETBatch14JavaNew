package Class15Methods;

public class HondaBike {
    static int topSpeed=200;
    static int noOfTires=2;
    String model;
    int year;

    void printTotalDistance(int noOfGallons, int avg){
        double distance=noOfGallons/10;
        System.out.println("Your bike can go max "+distance+" with this much "+noOfGallons);
    }

    public static void main(String[] args) {
        System.out.println(HondaBike.noOfTires);
        HondaBike ybr=new HondaBike();
        ybr.printTotalDistance(10,2);
    }
}
