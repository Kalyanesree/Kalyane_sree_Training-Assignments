package Basicselenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioCheckboxDemo {

	public static void main(String[] args) {
		
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_leak_detection", false);
		
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("prefs",prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		try {
            Thread.sleep(2000); 
            WebElement radio1 = driver.findElement(By.name("radioButton"));
            radio1.click();  

            Thread.sleep(2000); 

            WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));

            WebElement checkBox2 = driver.findElement(By.id("checkBoxOption2"));

            checkBox1.click();  
            Thread.sleep(1000);
            checkBox2.click();  

            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit(); 
        }

	}

}
