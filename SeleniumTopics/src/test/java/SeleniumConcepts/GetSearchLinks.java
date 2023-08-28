package SeleniumConcepts;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSearchLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver;
		System.setProperty("WebDriver.Chrome.driver", "E:\\\\Personal\\\\Testing_Stuffs\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.id("APjFqb")).sendKeys("bestwaystomakemoney\n");
		Thread.sleep(5000);
		/*List<WebElement>alllinks=driver.findElements(By.xpath("//a"));
		for (WebElement webElement : alllinks) {
	String allthelinks=	webElement.getAttribute("href");*/
		//***********************
		//getting only for major links 
	List<WebElement> fulllinks=driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
	for (WebElement link : fulllinks) {
		
		System.out.println(link.getText());
		
		
	}

	driver.quit();



	}

}
