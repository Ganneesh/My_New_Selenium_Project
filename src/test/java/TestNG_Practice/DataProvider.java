package TestNG_Practice;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class DataProvider {
	
	@org.testng.annotations.DataProvider(name="mydata1")
	
	public Object[][] mydata()
	{
		return new Object[][]{{"Ganesh"}};
		
	}
	
	@Test(dataProvider="mydata1")
	
	public void myTest(String str)
	{
		System.out.println(str);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

}
