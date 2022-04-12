package batch1package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_tc1 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Batch1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
}
