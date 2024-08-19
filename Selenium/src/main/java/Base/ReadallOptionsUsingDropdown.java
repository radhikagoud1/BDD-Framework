package Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadallOptionsUsingDropdown {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.geckodriver"," C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win32 " );
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
driver.findElement(By.linkText("Register here")).click();
driver.findElement(By.name("firstName")).sendKeys("Radhika");
driver.findElement(By.name("lastName")).sendKeys("Ceeturi");
driver.findElement(By.name("phone")).sendKeys("7659811644");
driver.findElement(By.id("userName")).sendKeys("Radhikagoud70@gmail.com");
driver.findElement(By.name("address1")).sendKeys("Ameerpet");
driver.findElement(By.name("city")).sendKeys("Hyderabad");	
driver.findElement(By.name("state")).sendKeys("Telangana");
driver.findElement(By.name("postalCode")).sendKeys("500038");
Select sel=new Select(driver.findElement(By.name("country")));
//read all options from dropdown
List<WebElement>options=sel.getOptions();
for(int i=0;i<options.size();i++)
{
System.out.println(options.get(i).getText());	

}}
	
	
	
	}
