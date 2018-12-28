package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HalfDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.out.println("Hello Megahaat");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.megahaateworld.com/#tab3");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		//WebDriverWait signin=new WebDriverWait(driver,10);
		//WebElement element=signin.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("sign-link")));
		//driver.findElement(By.linkText("sign-link")).click();
	}

}
