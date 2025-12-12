package Basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WindowTabHandling {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(5000);

        Set<String> allWindows = driver.getWindowHandles();

        
        for (String win : allWindows) {
            if (!win.equals(parentWindow)) {
                driver.switchTo().window(win);
                System.out.println("Child Window Title : " + driver.getTitle());
                Thread.sleep(5000);
                driver.close(); 
            }
        }

     
        driver.switchTo().window(parentWindow);
        System.out.println("Back to Parent Window");

        driver.findElement(By.id("opentab")).click();
        Thread.sleep(2000);

     
        Set<String> allTabs = driver.getWindowHandles();

     
        for (String tab : allTabs) {
            if (!tab.equals(parentWindow)) {
                driver.switchTo().window(tab);
                System.out.println("New Tab Title : " + driver.getTitle());
                Thread.sleep(5000);
                driver.close(); 
            }
        }

        
        driver.switchTo().window(parentWindow);
        System.out.println("Again Back to Parent Window");

        //driver.quit();
    }
}
