package Class24EncapsArrayList;

public class Horse {

    /* Create a horse class
       have 5 fields of your choice
       create constructor and getter setter methods for this class
        write at lest one condition inside setter class*/
    String name;
    String breed;
    String color;
    int age;

    public Horse(String name, String breed, String color, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            this.breed = breed;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Color cannot be empty");
        } else {
            this.color = color;
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
        } else {
            this.age = age;
        }
    }
}