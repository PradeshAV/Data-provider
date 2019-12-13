package facebook;



import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

//import org.apache.poi.ss.usermodel.Sheet;

//import org.apache.poi.sl.usermodel.Sheet;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datareader {

	public static void main(String[] args) throws Exception {
		

			File src=new File("C:\\Users\\Administrator\\Desktop\\DataDriven Library files\\New.xlsx");
			FileInputStream FIS = new FileInputStream(src);
		    XSSFWorkbook wb = new XSSFWorkbook(FIS);
			XSSFSheet sheet1=wb.getSheetAt(0);	
	        int rows=sheet1.getLastRowNum();
		    System.out.println("number of rows :" +rows);
		    for(int i=0;i<rows;i++)
		{
		String data=(sheet1.getRow(i).getCell(0).getStringCellValue());
		System.out.println("number of columns" +data);
		}
		wb.close();
		
		
		

	}

}
