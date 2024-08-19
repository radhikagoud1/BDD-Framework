package Base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getmethods {

		public static void main(String[]args) throws InterruptedException
		{
	System.setProperty("webdriver.geckodriver"," C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win32 " );
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	//maximize browser
	driver.manage().window().maximize();
	//get current url
	String Current_url=driver.getCurrentUrl();
	System.out.println(Current_url);
	//getTtitle()
	String page_title=driver.getTitle();
	System.out.println(page_title);
	Thread.sleep(5000);
	//get window handle()
	String winID=driver.getWindowHandle();
	System.out.println(winID);
	driver.findElement(By.xpath("//span[text()='Remote']")).click();
	//get window handles()
	Set<String>windowIds=driver.getWindowHandles();
	Iterator<String>it=windowIds.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}

}
