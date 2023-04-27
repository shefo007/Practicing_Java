package Java_DataHandling;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class FormulaExample {

    public static void main(String[] args) throws IOException {

        // Create object of XSSFWorkbook class
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create object of XSSFSheet class
        XSSFSheet sheet = workbook.createSheet("Calculate Salary");

        // Create Header row using XSSFRow class
        XSSFRow header = sheet.createRow(0);
        header.createCell(0).setCellValue("Employee_Name");
        header.createCell(1).setCellValue("Base_Salary");
        header.createCell(2).setCellValue("Variable_Pay");
        header.createCell(3).setCellValue("Other_Benefits");
        header.createCell(4).setCellValue("Total Salary");
        header.createCell(5).setCellValue("Base_Variable Salary");

        XSSFRow dataRow = sheet.createRow(1);
        dataRow.createCell(0).setCellValue("George");
        dataRow.createCell(1).setCellValue(5000);
        dataRow.createCell(2).setCellValue(650);
        dataRow.createCell(3).setCellValue(1200);

        // Set formula
        dataRow.createCell(4).setCellFormula("B2+C2+D2");
        dataRow.createCell(5).setCellFormula("SUM(B2:C2)");

        try {

            // Write the workbook in file system
            FileOutputStream out = new FileOutputStream("Salary_Slip.xlsx");
            workbook.write(out);
            out.close();
            System.out.println("Excel written successfully.");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
