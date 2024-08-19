package Base;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShots {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.geckodriver", "C:\\Workspaces\\Javapgms\\Selenium\\src\\main\\resources\\Driver\\firefox");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		//convert webdriver object to take screenshots
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		//call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//move image file to new destination
		File DestFile=new File("C:\\Workspaces\\Javapgms\\Selenium\\src\\main\\resources\\TestResults\\test.png" );
	//copy file to destination
				FileUtils.copyFile(SrcFile,DestFile);
	}

}
