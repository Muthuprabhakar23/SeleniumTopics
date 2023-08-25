package SeleniumConcepts;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class TakeScreenShot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Personal\\Testing_Stuffs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://mmmmmmm-trials710.orangehrmlive.com/");
		
		 TakesScreenshot screenshot= (TakesScreenshot) driver; 
		 File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		 
		  File destinationfile =new File("E:\\personal\\sample.png");
		//FileUtils.copyDirectory(sourcefile, destinationfile);
		  FileHandler.copy(sourcefile, destinationfile);
		 
		Robot robot =new Robot();
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(screensize);
		BufferedImage so=robot.createScreenCapture(rectangle);
		File destinationfile1 =new File("E:\\personal\\sample.png");
		ImageIO.write(so, "png", destinationfile1);
		driver.quit();
		
	}

}
