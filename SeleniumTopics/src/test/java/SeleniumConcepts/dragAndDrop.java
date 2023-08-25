package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Personal\\Testing_Stuffs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		
	WebElement element=	driver.findElement(By.xpath("//p[@class='ui-widget-header']"));
	WebElement element2=driver.findElement(By.xpath("//div[@id='form:drag_content']"));
	Actions act= new Actions(driver);
	act.dragAndDrop(element2, element).build().perform();
	
		
		
	}

}
