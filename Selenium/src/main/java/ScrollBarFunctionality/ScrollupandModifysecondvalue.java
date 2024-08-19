package ScrollBarFunctionality;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollupandModifysecondvalue {
	
	
		public static void main(String[]args) throws InterruptedException
		{
	System.setProperty("webdriver.geckodriver"," C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win32 " );
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.grammarly.com/plagiarism_checker");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,10000)");
Thread.sleep(5000);
js.executeScript("window.scrollBy(0,-3000)");

}}
