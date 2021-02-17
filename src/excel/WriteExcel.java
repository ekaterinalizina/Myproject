package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class WriteExcel {
    //Write: want to create Excel file using Java
    //insert data to the created Excel file

    //let's write File Path
    //as we declare final - we write CAPPITAL LETTERS
    public static final String FILE_PATH="../LearnInClass/DataTest/SampleExcelFile.xlsx";

    public static void main(String[] args) throws IOException {
        Object [][] stDetails={
                {"sl", "FirstName", "LastName","Phone", "Address"},
                {"101", "Amar","Alili", "9868668858", "NY,USA"},
                {"102", "Amy","Peterson", "9868668858", "NJ,USA"},
                {"102", "Aman","Jackson", "9868668858", "NY,USA"},
        };

        WriteExcel.writeExcel(FILE_PATH, "pnt", stDetails );
    }
    public static void writeExcel(String filePath, String sheetName, Object [][]data) throws IOException {
        // Object - Data Type, Parent class of any Class
        XSSFWorkbook workbook = new XSSFWorkbook();// we created Workbook obj
        XSSFSheet sheet = workbook.createSheet(sheetName);// we create sheet
        int rowNum = 0;//here we will start a code from 0 index, then we need 2D array - to insert Data
        System.out.println("Excel file Created");
        for (Object[] dt : data) {
            Row row = sheet.createRow(rowNum++);// Row is interface, 2nd time when Loop will be executed it will
            // create other row
            int colNum = 0;
            for (Object field : dt) {
                Cell cell = row.createCell(colNum);
                // If the data is String type then insert String value// Check Data type
                if (field instanceof String) {
                    cell.setCellValue((String) field);// field is Object type, we doing Casting

                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }

            }
        }

        // to save file
        try {

            FileOutputStream out = new FileOutputStream(filePath);
//            OutputStream outputStream = new BufferedOutputStream(out);
            workbook.write(out);

            workbook.close();

        }catch (FileNotFoundException fn){
            System.out.println("File not find Ex");
        }catch (IOException io){
            System.out.println("File not ");
        }
    }






}
