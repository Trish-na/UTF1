package lab2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver_tc2 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "‪C:\\Batch1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
