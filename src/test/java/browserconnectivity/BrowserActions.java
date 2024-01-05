package browserconnectivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {

	public static void main(String[] args)throws Exception {
		
		
		WebDriverManager .chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		//This is also another way to navigate url
		
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		
		//This is also used to get the current url of the webpage
		
		System.out.println("Current url of the page :- "+driver.getCurrentUrl());
		
		//Get the title of the page
		
		System.out.println("Title of the page:- "+driver.getTitle());
		
		//Navigate back to the page
		
		driver.navigate().back();
		
		//navigate page to forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//refresh the page
		driver.navigate().refresh();
		
		//Open the new window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//Open the new tab 
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.quit();
		

	}

}
