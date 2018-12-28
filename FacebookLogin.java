package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http:\\www.facebook.com");

        WebElement element1 = driver.findElement(By.id("email"));
        element1.sendKeys("moh.sarfaraj@gmail.com");

        WebElement element2 = driver.findElement(By.id("pass"));
        element2.sendKeys("pa$$word123");

        WebElement element3 = driver.findElement(By.id("u_0_2"));
        element3.click();
        //driver.quit();
        driver.close();

      //  System.out.println("Login");
	}

}
