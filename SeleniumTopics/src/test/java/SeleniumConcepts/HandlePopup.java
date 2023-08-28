package SeleniumConcepts;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("WebDriver.Chrome.driver", "E:\\\\Personal\\\\Testing_Stuffs\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		String Mytext=driver.findElement(By.xpath("//h3[normalize-space()='Basic Auth']")).getText();
		System.out.println(Mytext);






		////driver.quit();









	}

}
