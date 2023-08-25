package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Personal\\Testing_Stuffs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[2]/ul/li[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[2]/ul/li[4]/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
	String name =driver.findElement(By.xpath("//*[text()='Misaki Nicolas']")).getAttribute("class");
		System.out.println("name is : " +name);
	}

}
