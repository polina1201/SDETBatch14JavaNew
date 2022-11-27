package Class29;

import Utils.ExcelReader;

import java.io.IOException;

public class ReadingExcelFileDemo2 {
    public static void main(String[] args) throws IOException {

        var excelData=   ExcelReader.read("Data/TestTest.xlsx");
        System.out.println(excelData);

    }
}
