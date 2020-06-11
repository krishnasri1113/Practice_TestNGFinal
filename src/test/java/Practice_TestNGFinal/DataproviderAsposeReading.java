package Practice_TestNGFinal;


import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class DataproviderAsposeReading {
	String sFile = System.getProperty("user.dir")+"/Logindetails.xls";
	@BeforeClass
	public void launch()
	{
		BrowserUtility.launchbrowser("ch");
	}
	
	@Test(dataProvider="asposelogindetails")
	public void Loginwithcredentials(String username ,String password) throws Exception {
		System.out.println(username+"\t"+password);
		BrowserUtility.loginToTekArch(username,password);
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}

	@DataProvider(name="asposelogindetails")
	Object[][] trainerInfoFromExcel_aspose()throws Exception{
		//String sFile = System.getProperty("user.dir")+"/Logindetails.xls";
		 return readDataFromExcelSheet_aspose(sFile);
	}
	//open source free tools can be used anywhere. 
	private Object[][] readDataFromExcelSheet_aspose(String sFile) throws Exception {
		//Creating a file stream containing the Excel file to be opened
				FileInputStream fstream = new FileInputStream(sFile);
				
				//Instantiating a Workbook object
				Workbook workbook = new Workbook(fstream);
				
				//Accessing the first worksheet in the Excel file
				Worksheet worksheet = workbook.getWorksheets().get(0);
				
				//Exporting the contents of 7 rows and 2 columns starting from 1st cell to Array.
				Object[][] dataTable = worksheet.getCells().exportArray(0,0,2,2);
				//0,0,2,2 means starting from 0th row 0th column 2 rows 2 columns
				/*for (int i = 0 ; i < dataTable.length ; i++)
				{
					System.out.println("["+ i +"]: "+ Arrays.toString(dataTable[i]));
				}*/
				//Closing the file stream to free all resources
				fstream.close();
		return dataTable;
	}
	@AfterClass
	public void quit()
	{
		BrowserUtility.quitbrowser();
	}
	
	
	
}
