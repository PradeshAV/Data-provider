package dataconf;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class drivenconf 
{
	 XSSFWorkbook wb;
	 XSSFSheet sheet1;
	
	public drivenconf(String Excelpath)
	{
		try {
			File src=new File(Excelpath);
			FileInputStream FIS = new FileInputStream(src);
			wb = new XSSFWorkbook(FIS);
			
		
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			
		
		}	

		
	}

	public String dataread(int sheetNumber,int rows,int column)
	{
		sheet1=wb.getSheetAt(sheetNumber);
		String data=sheet1.getRow(rows).getCell(column).getStringCellValue();
		return data;
	}
}
