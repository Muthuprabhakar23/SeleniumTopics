package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Personal\\Testing_Stuffs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		Thread.sleep(3000);
		WebElement element=	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/select"));
ChromeOptions options = new ChromeOptions();
String name=options.getBrowserName();
String version=options.getBrowserVersion();
System.out.println(name);
System.out.println(version);
		Select select =new Select(element);
		select.selectByVisibleText("Selenium");
		

	}

}
