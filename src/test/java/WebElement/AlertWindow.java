package WebElement;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class AlertWindow {
	
	
	@Test
	
	public static void alertWindow()throws Exception
	{
WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(2000);
		
		//Assert.assertTrue(false)
		
		Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
		
		Assert.assertEquals(alert.getText(), "Hello , share this practice page and share your knowledge");
		
		System.out.println(text);
		Thread.sleep(2000);
		
		alert.accept();
		
		driver.quit();		
		
	}

	public static void main(String[] args) {
		
		try
		{
			alertWindow();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		

	}

}
