package Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadScenario {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException
	{
	System.setProperty("webdriver.geckodriver", "C:\\Workspaces\\Javapgms\\Selenium\\src\\main\\resources\\Driver\\firefox");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.grammarly.com/plagiarism_checker");
	
JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)","");
	driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/div/div[2]/form/div/div[4]/button[2]/span")).click();	
	Robot rb= new Robot();
	StringSelection str=new StringSelection("C:\\Users\\HP\\Desktop\\samplefile.txt");
		
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
Thread.sleep(5000);	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	Thread.sleep(5000);	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	}}
