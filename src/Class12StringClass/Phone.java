package Class12StringClass;

public class Phone {

    // Create a class "Phone". Create 2 Objects of it. iPhone, pixel,
    //Samsung with specific attributes and behaviors.



    String make;
    String model;
    String color;
    int year;
    int storage;

    void makeCall() {
        System.out.println("Making a call using "+model);
    }
    void takePictures() {
        System.out.println("Taking pictures with "+model);
    }
    void browseInternet() {
        System.out.println("Browsing the internet using "+model);
    }

}
