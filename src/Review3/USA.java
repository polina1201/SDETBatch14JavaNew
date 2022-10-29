package Review3;

public class USA extends Country{
    USA(String name){
        super(name);

    }

    public static void main(String[] args) {
        USA usa=new USA("USA");
        usa.name="USA";//public
        usa.capital="DC";//protected
    }
}
