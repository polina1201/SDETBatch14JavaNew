package Class17Constructor;

public class Task1Tester {
    public static void main(String[] args) {
        Task1 task=new Task1();
        int[]array={10,10,20,30};
        System.out.println(task.sumArray(array));


        //task.sumArray(new int []{10,10,20,30}); - another way of writing and converting
    }
}
