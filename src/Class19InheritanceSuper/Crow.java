package Class19InheritanceSuper;

    class Parrot extends Bird{
        Parrot(String name, String color,int age, double weight){
            super(name,color,age,weight);
        }
/*this.name=name;
this.age=age;
this.weight=weight;
this.color=color;*/
    }

    class Crow extends Bird{
        boolean isClever;
        Crow(String name, String color,int age, boolean isClever,double weight) {
            super(name, color,age,weight);
            this.isClever=isClever;
        }
    }

    class Sparrow extends Bird{
        Sparrow(String name,String color,int age, double weight){
            super(name, color,age,weight);
        }
    }
