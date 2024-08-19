package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionvsActions {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.geckodriver"," C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win32 " );
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
Actions actions=new Actions(driver);
Action action	=actions.moveToElement(driver.findElement(By.linkText("Agile Project"))).contextClick().build();
	action.perform();
	
	}
	
}
