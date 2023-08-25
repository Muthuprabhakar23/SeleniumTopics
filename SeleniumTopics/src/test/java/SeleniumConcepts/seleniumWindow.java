package SeleniumConcepts;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumWindow {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Personal\\Testing_Stuffs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");
		String Parentwindow=driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.id("menuform:j_idt39")).submit();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[2]/ul/li[2]/ul/li[3]/a/span")).click();
		WebElement openbutton=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span"));
		openbutton.click();

	     Set<String> Totalwindows= driver.getWindowHandles();
          for (String newWindow : Totalwindows) {
		driver.switchTo().window(newWindow);
	//	driver.findElement(By.xpath("/html/body/div[1]/a/i")).click();
		driver.switchTo().window(Parentwindow);
		driver.findElement(By.id("j_idt88:j_idt91")).click();

	    int count =driver.getWindowHandles().size();
		System.out.println(count);

		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]")).click();
	Set<String>	newlwindowhandles=driver.getWindowHandles();
	for (String newin:newlwindowhandles)
	{
		if(!newin.equals(Parentwindow));
		driver.switchTo().window(newin);

		//driver.close();

	}
	}
	}
}
