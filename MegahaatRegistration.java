package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MegahaatRegistration {

	private static final String Terms_of_ServiceIsSelected = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);

		driver.get("http://www.megahaateworld.com/");
		WebElement Join= driver.findElement(By.xpath("//*[@id=\"user-benefits\"]/div[1]/div[3]/span[1]/a"));
		Join.click();
		
		Select Dropdown= new Select(driver.findElement(By.id("myselect")));
		Dropdown.selectByValue("megahaatvillage");
		//driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		/*String mainWindow=driver.getWindowHandle();
		 // It returns no. of windows opened by WebDriver and will return Set of Strings
		 Set<String> set =driver.getWindowHandles();
		 // Using Iterator to iterate with in windows
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext()){
		 String childWindow=itr.next();
		    // Compare whether the main windows is not equal to child window. If not equal, we will close.
		 if(!mainWindow.equals(childWindow)){
		 driver.switchTo().window(childWindow);
		 System.out.println(driver.switchTo().window(childWindow).getTitle());
		 driver.close();
		 }
		 }
		 // This is to switch to the main window
		 driver.switchTo().window(mainWindow);*/
		
		//WebElement FirstName =driver.findElement(By.className("form-control"));
		//FirstName.sendKeys("Mohd");
		
		//WebElement LastName =driver.findElement(By.name("form-control"));
		//LastName.sendKeys("Sarfaraz");
		
		//WebElement EmailAddress =driver.findElement(By.id("email"));
		//EmailAddress.sendKeys("mohd.sarfaraz@megahaat.com");
		
		//WebElement MobileNo =driver.findElement(By.id("mobile_number"));
		//MobileNo.sendKeys("9871078058");
		
		Thread.sleep(3000);
		Select State= new Select(driver.findElement(By.id("state")));
		State.selectByValue("2_Bihar_BI");
		Thread.sleep(3000);
		Select District= new Select(driver.findElement(By.id("district")));
		District.selectByVisibleText("CHAMPARAN");
		Thread.sleep(3000);
		
		Select Block= new Select(driver.findElement(By.id("block")));
		Block.selectByValue("152_CHAKIA_CK");
		Thread.sleep(3000);
		
		WebElement PinCode= driver.findElement(By.xpath("//*[@id=\"wp_signup_form\"]/div[5]/div[2]/div/input"));
		PinCode.sendKeys("201308");
		
		WebElement FullAddress= driver.findElement(By.id("village_address"));
		FullAddress.sendKeys(" I-59 , Block G, Block D, Surajpur Site V, Greater Noida, Uttar Pradesh 203202");
		
		WebElement EWorldBranchCode= driver.findElement(By.id("franchise_id"));
		EWorldBranchCode.sendKeys("BICPCK1030");
		Thread.sleep(3000);
		
		Select AddressProof= new Select(driver.findElement(By.id("identity_id")));
		AddressProof.selectByValue("Voter Card");
		
		//File Upload Syntax below
		WebElement UploadAddressProof = driver.findElement(By.id("proof_id"));
		UploadAddressProof.sendKeys("C:\\Users\\Ravi\\Desktop\\Voter-ID.jpg");
		Thread.sleep(3000);
		
		
		
		
		
		
		
	}

}
