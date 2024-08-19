package Base;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Readmultiplelinksataatime {


	public static void main(String[] args) {
System.setProperty("webdriver.geckodriver"," C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win32 " );
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com");
List<WebElement>links=driver.findElements(By.tagName("a"));
for(int i=0;i<links.size();i++)
{
	System.out.println(links.get(i).getText());
}
}}
