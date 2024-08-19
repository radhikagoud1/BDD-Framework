package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validationmethods {

	public static void main(String []args) throws InterruptedException 	
	{
	System.setProperty("webdriver.geckodriver"," C:\\Users\\HP\\Downloads\\geckodriver-v0.34.0-win32 " );
	WebDriver driver=new FirefoxDriver();
driver.get("https://www.naukri.com");
 //maximize browser
driver.manage().window().maximize();
Thread.sleep(5000);
//driver.findElement(By.id("register_layer")).click();
//Thread.sleep(5000);
//is displayed()
boolean isdisplayed=driver.findElement(By.xpath("//a[@id='login_Layer']")).isDisplayed();
System.out.println(isdisplayed);
//is Enabled()
boolean isenabled=driver.findElement(By.xpath("//a[@id='login_Layer']")).isEnabled();
System.out.println(isenabled);
//is selected()
boolean isselected=driver.findElement(By.xpath("//label/i")).isSelected();
	System.out.println(isselected);
}}