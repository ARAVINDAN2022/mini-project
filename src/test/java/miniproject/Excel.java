package miniproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	static int d=1;

	public static String value()throws Exception 
	{
	    try {
		//To locate the input Excel file.
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\inputMiniProject.xlsx");
	     
		//To locate the Excel Workbook
		XSSFWorkbook book=new XSSFWorkbook(file);
	
		//To locate sheet of Workbook
		XSSFSheet sheet=book.getSheet("sheet1");
	
		//To locate required row
		XSSFRow cur=sheet.getRow(d);
	
		String val="";
	
		val=cur.getCell(0).toString();
	
		//To increment the d value to go to next row.
		d++;
	
	    //closing the resources.
		book.close();
	    file.close();
	
		return val;
	    }
	    catch(FileNotFoundException e) {
	    	System.out.println(e.getMessage());
	    	System.exit(0);
	    }
	    
	    return null;
	}

}
