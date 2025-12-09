package Basicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnchorTagDemo {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wikipedia.org");

        Thread.sleep(2000);

        // Find all anchor tags
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total number of anchor tags: " + links.size());

        // Print each href attribute
        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }

        driver.quit();
    }
}
