package Base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingBrowserWindow
{
	public static void main(String[]args) throws InterruptedException
	{
System.setProperty("webdriver.geckodriver"," C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win32 " );
WebDriver driver=new FirefoxDriver();

	driver.get("https://www.naukri.com");
String parentwindow	=driver.getWindowHandle();
System.out.println("parentwindow:"+ parentwindow);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@class='ntc__chip-label']")).click();
	Set<String>windowids=driver.getWindowHandles();
	windowids.remove(parentwindow);
	Iterator<String>it=windowids.iterator();
	while(it.hasNext())
	{ 
		String childwindowId=it.next();
		driver.switchTo().window(childwindowId);
	}
	String enabledwindowId=driver.getWindowHandle();
	System.out.println("After switching enabledwindowid:"+enabledwindowId);
	}
	}
