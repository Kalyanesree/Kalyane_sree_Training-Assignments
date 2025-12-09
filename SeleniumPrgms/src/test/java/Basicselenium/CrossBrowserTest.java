package Basicselenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter browser name (chrome / edge / firefox): ");
        String browserName = sc.nextLine();

        WebDriver driver = null;

        // equalsIgnoreCase() used to compare input with browser name
        if (browserName.equalsIgnoreCase("chrome")) {
            
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("edge")) {
            
            driver = new EdgeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            
            driver = new FirefoxDriver();

        } else {
            System.out.println("Invalid browser name");
            sc.close();
            return;   // stop the program if browser name is wrong
        }

        // Common code for all browsers
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org");

        System.out.println("Page title: " + driver.getTitle());
        
        Thread.sleep(10000);

        driver.quit();
        sc.close();
    }
}
