package Class13StringMethods;

public class Main {
    public static void main(String[] args) {
    /*
   StringBuilder  allows any methods to change the original contents of the
variables  because StringBuilder is mutable.
    */
        StringBuilder stringBuilder=new StringBuilder("Intellij is great");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    /*
    String does not allow any methods to change the original contents of the
variables because String is immutable
     */
    String str="Intellij ";
        str.toLowerCase(); //String class doesn't allow to change the original content. It'll come back as original
        System.out.println(str);
      /*  String country="USA";
        String home="USA";
        StringBuilder state=new StringBuilder("New york");
        StringBuilder state2=new StringBuilder("New york");*/
}


}
