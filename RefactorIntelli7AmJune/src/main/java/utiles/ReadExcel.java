package utiles;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    public static String readData(String sheetName, int row , int colum)  {
        File file = new File("src/main/resources/testdata/amazonTestData.xlsx");
        FileInputStream fileInputStream = null;
        try {
             fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook ;
        try {
             workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        XSSFSheet sheet =workbook.getSheet(sheetName);
       return sheet.getRow(row).getCell(colum).getStringCellValue();
    }

}
