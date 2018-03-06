package cardtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheetretrival {

	public static void main(String[] args) throws IOException {

		String [][] a=null;

		FileInputStream file= new FileInputStream(new File("C:/Users/e3020651/Desktop/test123.xlsx"));
		XSSFWorkbook wbook= new XSSFWorkbook(file);
		XSSFSheet sheet=wbook.getSheetAt(0);
		int b=sheet.getLastRowNum();
		int c=sheet.getRow(0).getLastCellNum();		
		a=new String[b][c];

		for(int i=1;i<b+1;i++)
		{
			for(int j=0;j<c;j++)
			{
				XSSFRow row=sheet.getRow(i);
				String e=row.getCell(j).getStringCellValue();

				System.out.print(a[i-1][j]=e);
				
			}
			
		}


	}

}
