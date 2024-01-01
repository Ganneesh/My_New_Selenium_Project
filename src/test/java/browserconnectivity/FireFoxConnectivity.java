package browserconnectivity;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.Assert;





public class FireFoxConnectivity {
	
	@Test
	public void Test1_chromebrowser()

	{
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement txtarea=driver.findElement(By.xpath("(//textarea)[1]"));
		
		txtarea.sendKeys("Ganesh");
		driver.quit();

	}
	

}
