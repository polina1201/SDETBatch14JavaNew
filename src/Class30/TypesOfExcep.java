package Class30;

import Utils.ExcelReader;

import java.io.IOException;

public class TypesOfExcep {
    public static void main(String[] args) throws IOException {
        String name = null;
        if (name != null) {
            System.out.println(name.length());
        }

        int[] arr = new int[5];
        int index = 10;
        try {
            System.out.println(arr[index]);
        } catch (Exception e) {
            System.out.println("Please fix these issues");
        }

        if(index<arr.length){
            System.out.println(arr[index]);
        }
        System.out.println(ExcelReader.read("Data/TestTest.xlsx"));
    }
}
