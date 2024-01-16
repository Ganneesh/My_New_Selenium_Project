package TestNG_Practice;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Hooks {
	
	
	@BeforeClass
	public static void userLogin()
	{
		System.out.println("I am successfully login");
	}
	
	@AfterClass
	
	public static void userLogout()
	{
		System.out.println("I am successfully logout");
		
	}
	
	@Test(priority=1)
	
	public static void Test1()
	{
		System.out.println("This is my first test");
	}
	
	
	@Test(priority=2)
	public static void Test2()
	{
		System.out.println("This is my second test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2();
		
		userLogout();
		
		userLogin();
		
		Test1();
		
	}

}
