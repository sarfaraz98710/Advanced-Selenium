package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.out.println("Hello Megahaat");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.megahaateworld.com/");
	}

}
