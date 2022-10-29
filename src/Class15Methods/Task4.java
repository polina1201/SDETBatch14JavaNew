package Class15Methods;

public class Task4 {

//Create a method that will say Hello in different language based on the country
// that will passed when method is executed

void sayHello(String country){
    switch (country) {
        case "USA" -> System.out.println("Hello");
        case "India" -> System.out.println("Namaste");
        case "Turkiye" -> System.out.println("Merhaba");
        case "Pakistan" -> System.out.println("AOA");
        case "Japan" -> System.out.println("Nihau");
    }
}

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.sayHello("USA");
        task4.sayHello("India");
        task4.sayHello("Turkiye");
        task4.sayHello("Pakistan");
        task4.sayHello("Japan");
    }

}
