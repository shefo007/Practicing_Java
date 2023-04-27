package Java_DataHandling;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileUpdateExample {

    public static void main(String[] args) throws IOException {

        try {

            FileInputStream fis = new FileInputStream("EmployeeDetails.xlsx");

            // Create object of XSSFWorkbook class
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            // Create object of XSSFWorkbook class
            XSSFSheet sheet = workbook.getSheet("Write_TestData");

            Object[][] bookData = { { "SeleniumTest", "0000A", 9999 },
                                    { "JavaTest", "0000B", 9990 },
                                                                        };

            // Get last row in Sheet
            int rowCount = sheet.getLastRowNum();

            for (Object[] Book : bookData) {

                // Create row for all the new data
                XSSFRow row = sheet.createRow(++rowCount);

                int columnCount = 0;

                for (Object field : Book) {

                    // Create new cell for each row
                    XSSFCell cell = row.createCell(columnCount++);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }

            }

            fis.close();

            // Write the workbook in file system
            FileOutputStream outputStream = new FileOutputStream("EmployeeDetails.xlsx");
            workbook.write(outputStream);
            System.out.println("Excel is updated successfully");

            // Close the workbook
            workbook.close();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
