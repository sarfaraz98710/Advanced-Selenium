package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		
       /* driver.get("https://www.freecrm.com/register/"); 
        
// First Web Page UI Script//
     Select editionabove = new Select(driver.findElement(By.id("payment_plan_id")));
     editionabove.selectByVisibleText("Free Edition");
        
    WebElement FName= driver.findElement(By.name("first_name"));
      FName.sendKeys("MOHAMMAD");
      
      WebElement LName= driver.findElement(By.name("surname"));
      LName.sendKeys("SARFARAZ");
      
      WebElement Email= driver.findElement(By.name("email"));
      Email.sendKeys("mohd.sarfaraz@megahaat1.com");
      
      WebElement Confirm_Email= driver.findElement(By.name("email_confirm"));
      Confirm_Email.sendKeys("mohd.sarfaraz@megahaat1.com");
      
      WebElement UserName= driver.findElement(By.name("username"));
      UserName.sendKeys("Sarfaraz1");
      
      WebElement Password= driver.findElement(By.name("password"));
      Password.sendKeys("Megahaat.com");
      
      WebElement Confirm_Password= driver.findElement(By.name("passwordconfirm"));
      Confirm_Password.sendKeys("Megahaat.com");
      
      WebElement Terms= driver.findElement(By.name("agreeTerms"));
      Terms.click();
      
      driver.findElement(By.id("submitButton")).click();

// Second Web Page UI Script//      
      WebElement ComapnyName= driver.findElement(By.name("company_name"));
      ComapnyName.sendKeys("Megahaat E-World");
      
      WebElement Phone= driver.findElement(By.name("phone"));
      Phone.sendKeys("9871078058");
      
      WebElement fax= driver.findElement(By.name("fax"));
      fax.sendKeys("011-12345678");
      
      WebElement website= driver.findElement(By.name("website"));
      website.sendKeys("www.megahaat.com");
      
      WebElement CEmail= driver.findElement(By.name("company_email"));
      CEmail.sendKeys("mohd.sarfaraz@megahaat.com");
      
      WebElement Description= driver.findElement(By.name("service"));
      Description.sendKeys("E-Commerce Website");
      
      WebElement address= driver.findElement(By.name("address"));
      address.sendKeys("Greater Noida P3");
      
      WebElement city= driver.findElement(By.name("city"));
      city.sendKeys("Greater Noida");
      
      WebElement state= driver.findElement(By.name("state"));
      state.sendKeys("Uttar Pradesh");
      
      WebElement postcode= driver.findElement(By.name("postcode"));
      postcode.sendKeys("201308");
      
      Select Country = new Select(driver.findElement(By.name("country")));
      Country.selectByVisibleText("India");
      
      WebElement addresschk= driver.findElement(By.name("copy_address"));
      addresschk.click();
      
      driver.findElement(By.name("btnSubmit")).click();
      
// Third Web Page UI Script// 
      
      // Select editionabove = new Select(driver.findElement(By.id("payment_plan_id")));
      // editionabove.selectByVisibleText("Free Edition");
         
     WebElement first_name= driver.findElement(By.name("first_name"));
     first_name.sendKeys("Raghib");
       
       WebElement Lastname= driver.findElement(By.name("surname"));
       Lastname.sendKeys("Anjum");
       
       WebElement EmailID= driver.findElement(By.name("email"));
       EmailID.sendKeys("Raghib.anjum@megahaat.com");
       
       WebElement CFMEmail= driver.findElement(By.name("email_confirm"));
       CFMEmail.sendKeys("Raghib.anjum@megahaat.com");
       
       WebElement UserNM= driver.findElement(By.name("username"));
       UserNM.sendKeys("Raghib");
       // For Shortcut = driver.findElement(By.name("username")).sendKeys("Raghib");
     
       WebElement PWD= driver.findElement(By.name("password"));
       PWD.sendKeys("Megahaat.com");
       
       WebElement CFMPWD= driver.findElement(By.name("passwordconfirm"));
       CFMPWD.sendKeys("Megahaat.com");
       
       Select Role = new Select(driver.findElement(By.name("role_id")));
       Role.selectByVisibleText("User Administrator");
       
       driver.findElement(By.name("finish")).click(); */
       
       // Fourth Web Page UI Script // Login Window Page//
       driver.get("https://www.freecrm.com/login.cfm?pr=1"); 
       driver.findElement(By.name("username")).sendKeys("Sarfaraz1");
       
       driver.findElement(By.name("password")).sendKeys("Megahaat.com");
       
       driver.findElement(By.xpath("//*[@id=\"loginForm\"]/input[3]")).click();      
      
	}

}
