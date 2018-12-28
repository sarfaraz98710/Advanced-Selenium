package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MegahaatEworldLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://www.megahaateworld.com/");
WebElement SignIn= driver.findElement(By.xpath("//*[@id=\"user-benefits\"]/div[1]/div[3]/span[2]/a"));
SignIn.click();

WebElement FirstName =driver.findElement(By.id("fname"));
FirstName.sendKeys("Mohd");

WebElement LastNmae =driver.findElement(By.id("lname"));
LastNmae.sendKeys("Sarfaraz");

WebElement EmailId =driver.findElement(By.id("user_login"));
EmailId.sendKeys("mohd.sarfaraz@megahaat.com");

WebElement LogIn= driver.findElement(By.id("wp-submit"));
LogIn.click();

WebElement OTP =driver.findElement(By.id("otp"));
OTP.sendKeys("9818");
WebElement Submit = driver.findElement(By.id("submitbtn"));
Submit.submit();

//driver.get("https://estatos.megahaateworld.com/");



//WebElement Enquiry = driver.findElement(By.className("icon-text"));
//Enquiry.sendKeys("Mohd Sarfaraz");

	}

}
