package Basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.redbus.in");

        
        WebElement searchButton = driver.findElement(By.xpath("//*[@aria-label='Search buses']"));

        String tooltipText = searchButton.getAttribute("aria-label");

        System.out.println("Tooltip / Accessible text is: " + tooltipText);

        driver.quit();
    }
}
