package WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import java.util.*;


public class SwitchTab {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("opentab")).click();
		
		Thread.sleep(2000);
		
		 //Set<String> windowHandles = driver.getWindowHandles();
		 
		 String str=driver.getWindowHandle();
		 
		 driver.switchTo().window(str);


		 
		  	Thread.sleep(2000);
		
	        
	        driver.quit();
		
		
	
	
	}

}
