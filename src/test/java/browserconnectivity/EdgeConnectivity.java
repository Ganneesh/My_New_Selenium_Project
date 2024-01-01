package browserconnectivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.*;

public class EdgeConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.quit();

	}

}
