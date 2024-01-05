package browserconnectivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		String orignalwindow=driver.getWindowHandle();
		
	//    driver.switchTo().newWindow(WindowType.WINDOW);
	    
	    driver.switchTo().newWindow(WindowType.TAB);
	    
	    driver.switchTo().window(orignalwindow);
	    
	    driver.quit();
	    //driver.close()
;	}

}
