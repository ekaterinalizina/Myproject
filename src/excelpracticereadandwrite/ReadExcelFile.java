package excelpracticereadandwrite;

import org.apache.poi.ss.format.CellFormatPart;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Iterator;

public class ReadExcelFile {
    public static String filePath = " ../DataTest/We_SE_IN_Class.xlsx";

    public static void main(String[] args)  {
        XSSFWorkbook workbook = new XSSFWorkbook();
      //  XSSFSheet sheet = workbook.createSheet(sheetName);
        try {
            ReadExcelFile.readExcelFile(filePath, 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void readExcelFile(String filePath, int sheetNumber) throws FileNotFoundException {
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(1);
            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                Cell currentCell = cellIterator.next();
                //if else will help to get a Type of data
                if (currentCell.getCellType() == CellType.STRING) {
                    System.out.println(currentCell.getStringCellValue());
                } else if (currentCell.getCellType() == CellType.NUMERIC) {
                    System.out.println(currentCell.getNumericCellValue() + " ");
                }
            }
        } catch (FileNotFoundException fn) {
            System.out.println("File not found");
        } catch (IOException io) {
            System.out.println("Reading done");
        }
    }



}
