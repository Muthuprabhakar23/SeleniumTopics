package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Personal\\Testing_Stuffs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.id("Click"));
		button.click();
		String text=button.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		String name=driver.switchTo().frame("frame2").getTitle();
		
		System.out.println(name);
	WebElement button1=driver.findElement(By.xpath("/html/body/button"));
	button1.click();
	driver.switchTo().defaultContent();
	List<WebElement> totalfrmaes=driver.findElements(By.tagName("iframe"));
	int sizeofframe=totalfrmaes.size();
	System.out.println(sizeofframe);
	driver.quit();

	}

}
