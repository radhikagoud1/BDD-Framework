package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsermethods 
{
 public static void main(String[]args) throws InterruptedException
			{
		System.setProperty("webdriver.geckodriver"," C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win32 " );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//maximize browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		driver.quit();

}}
