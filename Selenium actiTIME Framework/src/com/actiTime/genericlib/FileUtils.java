package com.actiTime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author SunnyRaj
 *
 */

public class FileUtils
{
	String exelPath="./Test Data\\FrameWork.xlsx";
	String propertyFilePath="./Test Data\\PropertiesFile.Properties";
	
	/**
	 * @return
	 * @throws IOException 
	 * it returns object of the properties file and load allthe keys
	 */
	
	public Properties getPropertiesObj() throws IOException
	{
		FileInputStream fis=new FileInputStream(propertyFilePath);
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj;
	}
	
	public String getexcelData(String sheetName,int rowNum,int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(exelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		String data=row.getCell(colNum).getStringCellValue();
		return data;
	}
	
	/**
	 * @param sheetName
	 * @param rowNum
	 * @param colNum
	 * @param data
	 * its used to write data back to excel based on user argument
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 */
	
	public void setExcelData(String sheetName,int rowNum,int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(exelPath);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet(sheetName);
		
		Row row=sh.getRow(rowNum);
		
		Cell cel=row.getCell(colNum);
		
		String data=row.getCell(colNum).getStringCellValue();
		
		cel.setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(exelPath);
		
		wb.write(fos);
		
		wb.close();
	}
}
	
	
	
	
	
	
	
	
	
