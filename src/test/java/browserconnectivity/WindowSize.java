package browserconnectivity;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
	
		//driver.get("https://google.com");

			driver.get("https://www.facebook.com/");
		
		Dimension size=driver.manage().window().getSize();
		
		System.out.println("Size of the window:- "+size.getHeight()+"   "+size.getWidth());
		driver.quit();	
		
		
		
		
	}

}
