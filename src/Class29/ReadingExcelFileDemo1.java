package Class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public class ReadingExcelFileDemo1 {
    public static void main(String[] args) throws IOException {

        //Location of the file on your HardDrive where file is stored
        String path="Data/TestTest.xlsx";
        //Reads the data from HardDrive, brings it to RAM in the raw for 10101010
        //In simple words, we can say computer has navigated to that file
        FileInputStream fis=new FileInputStream(path);
        //This class converts the raw bytes to Excel format or in simple words, it's that special software
        //that helps us read and write data to an Excel file
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet=excel.getSheet("Sheet1");
        int noOfRow=sheet.getPhysicalNumberOfRows();
        //getting the first row, so that we can use it as keys for our map
        Row headerRow=sheet.getRow(0);
        //The Map that will store the data for each row
        LinkedHashMap<String,String> rowMap=new LinkedHashMap();
        //A loop that goes through all the rows tht contain the data
        for (int rowNo=1; rowNo<noOfRow;rowNo++) {
            //get a dataRow from sheet one by one through loop
            Row dataRow=sheet.getRow(rowNo);
            //getting the count of how many cells contain the data
            int noOfCell=dataRow.getPhysicalNumberOfCells();
            //A loop to go thorugh all the cells
            for (int cellNo = 0; cellNo < noOfCell; cellNo++) {
            //getting ketys from header row and value from data row
                rowMap.put(headerRow.getCell(cellNo).toString(),dataRow.getCell(cellNo).toString());

            }

            System.out.println(rowMap);


        }




    }}