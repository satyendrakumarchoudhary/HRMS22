package package1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {
	public static void main(String args[]) throws Exception {
		FileInputStream fileinput = new FileInputStream("E:\\Excel jar file\\WriteData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
		XSSFSheet sheet = workbook.getSheet("test");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating Cell Data" + sheet.getRow(2).getCell(1));
		// write the data to excel file
		XSSFCell cell = sheet.getRow(2).getCell(1);
		cell.setCellValue("Test123");
		fileinput.close();
		FileOutputStream fileOut = new FileOutputStream("E:\\Excel jar file\\WriteData.xlsx");
		workbook.write(fileOut);
		System.out.println("Updated data after write is done" + cell.getStringCellValue());
		fileOut.close();

	}

}
