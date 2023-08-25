package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class textBoxExample {

	public static void main(String[] args) {
		//TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "E:\\Personal\\Testing_Stuffs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[2]/ul/li[3]/a/i[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_input\"]/a/span")).click();
	String name=driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		System.out.println("text is: " + name);
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[6]/div/input")).sendKeys("hii");
		action.sendKeys(Keys.TAB).build().perform();
	boolean movedtonextelement=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[7]/div/textarea")).isEnabled();
	if (movedtonextelement) {
		System.out.println("boss i have moved to next line");
	}

	driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]")).sendKeys("is nice");
	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[8]/div/div/div[2]/div[1]")).sendKeys("i am good");
    driver.quit();
	}

}
