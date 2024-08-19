package Base;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Locators {

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
driver.findElement(By.id("email")).sendKeys("Radhika ceeturi");
driver.findElement(By.name("password")).sendKeys("Radan@987");
driver.findElement(By.name("confirmPassword")).sendKeys("Radan@987");
driver.findElement(By.name("submit")).click();
//tagname
List<WebElement>links= driver.findElements(By.tagName("a"));
for(int i=0;i<links.size();i++)
{
	System.out.println(links.get(i).getText());
}
driver.navigate().back();
driver.quit();
}
}