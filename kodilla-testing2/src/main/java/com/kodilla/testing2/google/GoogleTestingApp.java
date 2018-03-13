package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SERACHFIELD = "lst-ib";

    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        //System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        driver.get("https://www.google.com");

        WebElement serachField = driver.findElement(By.id(SERACHFIELD));
        serachField.sendKeys("Kodilla");
    }
}
