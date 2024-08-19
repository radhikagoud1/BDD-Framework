package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
	public static void main(String[]args)
	{
System.setProperty("webdriver.geckodriver"," C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win32 " );
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com");
}

}
