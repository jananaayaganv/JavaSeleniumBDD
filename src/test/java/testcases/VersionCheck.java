package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class VersionCheck {

	public static void main(String[] args) {
		
		FirefoxOptions fo = new FirefoxOptions();
		ChromeOptions co = new ChromeOptions();
		fo.setBrowserVersion("116");
		co.setBrowserVersion("116");
		
		WebDriver driver1 = new ChromeDriver(co);
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.google.com");
		driver1.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver1.getCurrentUrl());
		
		driver.quit();

	}

}
