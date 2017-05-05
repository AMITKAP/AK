package Retry;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class InterviewPrep 
{
	@Test
	public static void RetryFailed() throws IOException
	
	{    	

		Logger lt=Logger.getLogger("InterviewPrep");
		PropertyConfigurator.configure("Log4j.properties");
		lt.info("Running");
	    
		File fl=new File("C:\\Users\\akapoor2\\Desktop\\TestData.xlsx");
		try {
			FileInputStream str=  new FileInputStream(fl);
			XSSFWorkbook bk=new XSSFWorkbook(str);
			XSSFSheet sht=bk.getSheetAt(0);
			System.out.println(sht.getRow(1).getCell(1));
			sht.getRow(1).createCell(2).setCellValue("PASS");
			FileOutputStream fo=new FileOutputStream(fl);
			bk.write(fo);
			bk.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
	}

}
