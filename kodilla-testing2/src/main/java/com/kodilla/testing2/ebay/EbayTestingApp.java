package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTestingApp {
    public static final String SERACHFIELD = "gh-ac";

    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        driver.get("https://www.ebay.com");

        WebElement serachField = driver.findElement(By.id(SERACHFIELD));
        serachField.sendKeys("Laptop");
    }
}
