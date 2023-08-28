package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("WebDriver.Chrome.driver", "E:\\\\Personal\\\\Testing_Stuffs\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.id("APjFqb")).sendKeys("testing");
		Thread.sleep(5000);
		List<WebElement>allele=	driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		int position=0;
		for (WebElement webElement : allele) {
		System.out.println(webElement.getText());
		position++;
		if(position==3) {
			webElement.click();
			break;
		}


		}
	}}

