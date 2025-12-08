package Basicselenium;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedbusLinkTextDemo {

	public static void main(String[] args) {
	
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_leak_detection", false);
		
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("prefs",prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Help")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("He")).click();
		driver.quit();

	}

}
