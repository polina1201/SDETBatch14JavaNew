package Class14CreateObjMethods;

public class MethodsDemo4 {

    boolean mystery(){

        return true;
    }

    String mystery2 (int num){
        return "Java";
    }

    String method(String word){
        //return "Java";
        if(word.equals("Java")){
            return "python";
        }else{
            return "java";
        }
    }
    public static void main(String[] args) {
        MethodsDemo4 methodsDemo4=new MethodsDemo4();
        System.out.println(methodsDemo4.mystery());
        System.out.println(methodsDemo4.mystery2(5));//not a loop, so will print only 1 time, not 5 times
        System.out.println(methodsDemo4.method("python"));//we still will see Java
    }
}
