package WebElement;
import org.openqa.selenium.chrome.*;
import java.util.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		//Assertion
		
	
	Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
	
	System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	
	Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	
	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
	System.out.println(element.getText());
	
	WebElement ele=driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
	

	Assert.assertEquals(ele.getText(), "Senior Citizen");
	
	//Assert.ass
	if(element.isSelected())
	{
		System.out.println(ele.getText()+"This code i want");
		
	
	}
	
	
	
	
	
	driver.quit();
	}

}
