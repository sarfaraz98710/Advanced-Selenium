package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();     
		
          driver.get("https://www.facebook.com/"); 
          
       WebElement First= driver.findElement(By.id("u_0_j"));
          First.sendKeys("Shiv");
          
       WebElement LName= driver.findElement(By.id("u_0_l"));
          LName.sendKeys("Pratap");
          
        WebElement Mobl=driver.findElement(By.id("u_0_o"));
           Mobl.sendKeys("8860942174");
           
        WebElement Pass= driver.findElement(By.id("u_0_v"));	
          Pass.sendKeys("Shiv@99pratap");
         //WebElement Birthday= driver.findElement(By.id("u_0_x"));
          //Birthday.sendKeys("cs083595");
          
         Select date = new Select(driver.findElement(By.id("day")));
        date.selectByVisibleText("8");
        
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Jul");
        
         Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1992");
        
        
        //fb.findElement(By.className("_58mt")).click(); //this code is working for female
        
        //driver.findElement(By.id("u_0_a")).click(); //this code is not working for male
        WebElement radioBtn = driver.findElement(By.id("u_0_a"));
        radioBtn.click();
        
        WebElement SignUp = driver.findElement(By.id("u_0_11"));
        SignUp.click();
	}

}
