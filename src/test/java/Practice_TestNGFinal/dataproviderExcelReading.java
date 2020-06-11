package Practice_TestNGFinal;


import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderExcelReading {
	String sFile = System.getProperty("user.dir")+"/Logindetails.xls";
	@BeforeClass
	public void launch()
	{
		BrowserUtility.launchbrowser("ch");
	}
	
	@Test(dataProvider="Logindetails")
	public void Loginwithcredentials(String username ,String password) throws Exception {
		System.out.println(username+"\t"+password);
		BrowserUtility.loginToTekArch(username,password);
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
	@DataProvider(name="Logindetails")
	Object[][] trainerInfoFromExcel()throws Exception{
		//String sFile = System.getProperty("user.dir")+"/Logindetails.xls";
		 return readDataFromExcelSheet(sFile);
	}
	

	public Object[][] readDataFromExcelSheet(String sFile) throws Exception {
		FileInputStream fi=new FileInputStream(sFile);
			HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
	//File f = new File(System.getProperty("user.dir")+"/Logindetails.xls");
	//HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(sFile));
	HSSFSheet myExcleSheet = myExcelBook.getSheet("details");
	HSSFRow row1 = myExcleSheet.getRow(0);
	System.out.println(row1.getPhysicalNumberOfCells()); //To take total number of collumns
	System.out.println(myExcleSheet.getPhysicalNumberOfRows());//To take total number of Rows
	//System.out.println(row1.getLastCellNum());
	int iCountCol =row1.getLastCellNum();
	System.out.println(iCountCol);
	
	int iCountRow = myExcleSheet.getPhysicalNumberOfRows();
	System.out.println(iCountRow);
	Object[][] excelData= new Object[iCountRow][iCountCol]; //Creating multi dimensional array
	
	for(int countRow=0;countRow<iCountRow;countRow++) {
		for(int countCol = 0; countCol<iCountCol;countCol++) {
			HSSFRow tempRow=myExcleSheet.getRow(countRow);
			String sTemp;
			try {
			//System.out.println(tempRow.getCell(countCol).getStringCellValue());
			sTemp=tempRow.getCell(countCol).getStringCellValue();
			System.out.println(sTemp);
			}catch(Exception e) {
				//System.out.println(tempRow.getCell(countCol).getNumericCellValue());
				sTemp=Double.toString(tempRow.getCell(countCol).getNumericCellValue());
			}
			excelData[countRow][countCol] = sTemp;
		}
	}	
	return excelData;
	}
	@AfterClass
	public void quit()
	{
		BrowserUtility.quitbrowser();
	}

}
