package Basicselenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProductSearch {

    public static void main(String[] args) throws Exception {

       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com");

        Thread.sleep(3000);

     // Close login popup using ESC key
        try {
            Thread.sleep(3000);
            driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
            System.out.println("Login popup closed using ESC key.");
        } catch (Exception e) {
            System.out.println("Popup not shown.");
        }


        // Laptop - 7th product
        searchAndPrint(driver, "Laptop", 7);

        // TV - 13th product
        searchAndPrint(driver, "TV", 13);

        // Smart Phone - 2nd product
        searchAndPrint(driver, "Smart Phone", 2);

        driver.quit();
    }

    static void searchAndPrint(WebDriver driver, String product, int n) throws Exception {

        Thread.sleep(3000);

        // ✅ Re-locate the search box freshly every time
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();

        // ✅ FORCE CLEAR using CTRL + A + BACKSPACE
        searchBox.sendKeys(Keys.CONTROL + "a");
        searchBox.sendKeys(Keys.BACK_SPACE);

        Thread.sleep(1000);

        // ✅ Type new product name
        searchBox.sendKeys(product);
        searchBox.sendKeys(Keys.ENTER);

        Thread.sleep(5000);

        List<WebElement> products = driver.findElements(By.cssSelector("div._4rR01T"));

        System.out.println("Product searched: " + product);

        if (products.size() >= n) {
            System.out.println("Nth product: " + products.get(n - 1).getText());
        } else {
            System.out.println("Less number of products found.");
        }

        System.out.println("----------------------------------------");
    }
}