package Basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wikipedia.org");

        Thread.sleep(2000);

        // Using CSS Selector with ID
        WebElement searchBox = driver.findElement(By.cssSelector("#searchInput"));
        searchBox.sendKeys("India");
        searchBox.submit();

        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(2000);

        // Using CSS Selector with CLASS
        WebElement languageBlock = driver.findElement(By.cssSelector(".central-featured-lang"));
        languageBlock.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
