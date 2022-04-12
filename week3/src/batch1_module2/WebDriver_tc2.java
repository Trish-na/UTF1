package batch1_module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_tc2 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "‪‪C:\\Batch1\\week3\\‪‪C:\\Batch1\\week3\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
