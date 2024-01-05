package browserconnectivity;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;



public class ChromeConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//Setup the driverversion as well 
		
		//WebDriverManager.chromedriver().driverVersion("").setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.quit();
		
		
		
		

	}

}
