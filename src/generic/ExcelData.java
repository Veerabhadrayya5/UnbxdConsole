package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static int getRow(String path, String sheet)
	{
		int row=0;
		FileInputStream file;
		try
		{
		file=	new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(file);
	row=	wb.getSheet(sheet).getLastRowNum();
		
		
		}
		catch(Exception e)
		{
			
		}
	
	return row;
	}
	
	public static String getCellValue(String path, String sheet, int row, int col)
	{
		String bh=" ";
		FileInputStream file;
		try
		{
		file=	new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(file);
	bh=	wb.getSheet(sheet).getRow(row).getCell(col).toString();
		
		
		}
		catch(Exception e)
		{
			
		}
	
	return bh;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
