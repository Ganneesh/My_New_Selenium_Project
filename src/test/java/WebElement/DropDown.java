package WebElement;
import org.openqa.selenium.chrome.*;
import java.util.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DropDown {
	
	static WebElement element;
	static WebDriver driver;
	
	
	
	public static void selectDropDown()throws Exception
	{
		driver=new ChromeDriver();
		element= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(element);
		
		Thread.sleep(1000);
		
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("AED");
		Thread.sleep(1000);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
	
		Thread.sleep(1000);
	}
	
	public static void dynamicDropDown()throws Exception
	{
	driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[@value='GOI']")).click();
	
	Thread.sleep(1000);
	
	//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//a[@value='COK'])[2]")).click();
	
	Thread.sleep(3000);
	
	}
	
	public static void autosugesstionDropDown()throws Exception
	{
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(2000);
		
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));
		
		for(WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("india"))
			{
				
				option.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	public static void updatedDropDown()throws Exception
	{
		
		
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		for(int i=1;i<=4;i++)
		{
		
			driver.findElement(By.id("hrefIncAdt")).click();
			
			
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		
	
		
	
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		
		//selectDropDown();
	
		Thread.sleep(2000L);
		//updatedDropDown();
		
		//dynamicDropDown();
		
		autosugesstionDropDown();
		
	
		driver.quit();
		
	}

}
