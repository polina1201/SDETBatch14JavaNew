package Class13StringMethods;

public class sample {
    public static void main(String[] args) {
        String c="Hello";
        boolean var;
        var=c.startsWith("hello");
        System.out.println(var);

        String onj="I like java";
        System.out.println(onj.charAt(3));

        String str="0123456789";
        System.out.println(str.substring(4));

        String str_Sample = "RockStar";
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));

}
}