package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Personal\\Testing_Stuffs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj4rej0u_CAAxVsTWwGHXVZAVEQPAgI");

		WebElement mic=	driver.findElement(By.xpath("//div[@aria-label='Search by voice']"));
		Actions act= new Actions(driver);
	String name1=mic.getAttribute("title");
		//String name=mic.getAttribute("title");

		System.out.println(name1);
		driver.quit();
	}

}
