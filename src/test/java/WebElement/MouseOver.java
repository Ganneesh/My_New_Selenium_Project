package WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.chrome.*;

public class MouseOver {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement over=driver.findElement(By.id("mousehover"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(over).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Top']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
