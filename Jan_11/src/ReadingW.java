import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingW {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File xlfile = new File("C:\\Users\\PSQA\\Documents\\Testdata.xlsx");
		
		FileInputStream xlFIS = new FileInputStream(xlfile);
		
		// file type xls = HSSF and xlsx = XSSF
		
		XSSFWorkbook xlbook = new XSSFWorkbook(xlFIS);
		
		XSSFSheet xlsheet = xlbook.getSheet("Test1");
		//Read and Write multiple data set
		
		
		/*
		XSSFRow xlrow = xlsheet.getRow(1);
		XSSFCell xlcell = xlrow.getCell(0);
		System.out.println(xlcell.getStringCellValue());
		
		xlcell = xlrow.getCell(1);
		System.out.println(xlcell.getNumericCellValue());
		xlFIS.close();
		
		FileOutputStream xlFOS = new FileOutputStream(xlfile);
		xlrow.createCell(2).setCellValue("PASSED");
		xlbook.write(xlFOS);
		xlFOS.close();
		*/
		
		//created object for rows and cell
		XSSFRow objRow;
		XSSFCell objCell;
		
		// trying to find the last row number
		System.out.println(xlsheet.getLastRowNum());
		
		for (int i = 0; i<=xlsheet.getLastRowNum(); i++) {
			objRow = xlsheet.getRow(i);
			objCell = objRow.getCell(0);
			System.out.println(objCell.getStringCellValue());
			objCell= objRow.getCell(1);
			System.out.println(objCell.getStringCellValue());
			
			objCell = objRow.createCell(2);
			objCell.setCellValue("PASSED");
			
		}
		
		FileOutputStream xlFOS = new FileOutputStream(xlfile);
		xlbook.write(xlFOS);
		xlFIS.close();
		xlFOS.close();
		
	}

}
