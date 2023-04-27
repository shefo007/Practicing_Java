package Java_DataHandling;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadSpecificData {

    public static void main(String[] args) {

        String path = "resourses/Book1.xlsx";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

            XSSFSheet sheet = workbook.getSheet("sheet1");

            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
            System.out.println("row count: " + rowCount);

            for (int i = 0; i <= rowCount; i++) {
                int cellCount = sheet.getRow(i).getLastCellNum();
                for (int j = 0; j < cellCount; j++) {
                    System.out.print(sheet.getRow(i).getCell(j).getStringCellValue().toString() + " || ");
                }
                System.out.println();
            }

//            System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
//            System.out.println(sheet.getRow(2).getCell(1));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
