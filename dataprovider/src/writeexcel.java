import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcel {

	public static void main(String[] args) throws Exception 
	{
		File src=new File("D:\\Datawrite\\write.xlsx");
		FileInputStream FIS = new FileInputStream(src);
	    XSSFWorkbook wb = new XSSFWorkbook(FIS);
		XSSFSheet sheet1=wb.getSheetAt(0);	
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(1).createCell(2).setCellValue("fail");
		FileOutputStream fout=new FileOutputStream(src);
	   wb.write(fout);
		wb.close();
		
	}

}
