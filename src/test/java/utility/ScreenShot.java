package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenShot {
	
	
//	WAP to capture the screenshot using a method that ask the filename from user
	
	public  String getScreenshotWithFilename(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

//		String path = "F:\\Desktop\\VimanNagar\\May 21\\Jan7SeleniumBasics\\Screenshots\\google.jpg";

		String path = System.getProperty("user.dir")+"\\reports\\Screenshots\\"+filename+".jpg";
		
		File file = new File(path);

		FileHandler.copy(source, file);
		
		return path;
	}
	
	

	
}
