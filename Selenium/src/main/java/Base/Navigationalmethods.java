package Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigationalmethods 
 {
	public static void main(String []args) throws InterruptedException 	
	{
	System.setProperty("webdriver.geckodriver"," C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win32 " );
	WebDriver driver=new FirefoxDriver();
driver.get("https://www.naukri.com");
 //maximize browser
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.id("register-layer")).click();
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().forward();
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(5000);
driver.navigate().to("https://www.facebook.com");
	}}
			


	
