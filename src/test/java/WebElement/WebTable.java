package WebElement;

import org.openqa.selenium.By;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table=driver.findElement(By.id("product"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		int total=0;
		
	for(int i=1;i<rows.size();i++)
	{
		
			WebElement cols=rows.get(i).findElements(By.tagName("td")).get(2);	
			
			String price=cols.getText();
			
			total+=Integer.parseInt(price);
	}
	
	System.out.println("Total is :- "+total);
		
		for(WebElement row :rows)
		{
			List<WebElement>cols=row.findElements(By.tagName("td"));
			
				for(WebElement col :cols)
				{
					
					
					System.out.println(col.getText());
				}
		}
		
		
		
		
		driver.quit();	
		}

}
