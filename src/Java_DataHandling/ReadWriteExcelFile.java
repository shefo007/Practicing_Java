package Java_DataHandling;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;

public class ReadWriteExcelFile {

    public static void main(String[] args) throws IOException {

        // create blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Write_TestData");

        ArrayList<Object[]> data = new ArrayList<>();
        data.add(new String[] { "Name", "Id", "Salary" });
        data.add(new Object[] { "Jim", "001A", 10000 });
        data.add(new Object[] { "Jack", "1001B", 40000 });
        data.add(new Object[] { "Tim", "2001C", 20000 });
        data.add(new Object[] { "Gina", "1004S", 30000 });

        // Iterate over data and write to sheet
        int rowNum = 0;
        for (Object[] employeeDetails : data) {

            // Create Row
            XSSFRow row = sheet.createRow(rowNum++);

            int cellNum = 0;
            for (Object obj : employeeDetails) {

                // Create cell
                XSSFCell cell = row.createCell(cellNum++);

                // Set value to cell
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Double)
                    cell.setCellValue((Double) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
        }
        try {

            // Write the workbook in file system
            FileOutputStream out = new FileOutputStream("EmployeeDetails.xlsx");
            workbook.write(out);
            out.close();
            System.out.println("EmployeeDetails.xlsx has been created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            workbook.close();
        }
    }
}
