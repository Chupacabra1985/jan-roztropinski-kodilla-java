package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;


import static junit.framework.TestCase.assertTrue;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://chupacabra1985.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests(){
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest(){
        driver.switchTo().alert().accept();
        driver.close();
    }

    private String createCrudAppTask() throws InterruptedException{
        final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action, \"createTask\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTesttaskToTrello(String taskName) throws InterruptedException{
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm->anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(theForm->{
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException{
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("jan.roztropinski@op.pl");
        driverTrello.findElement(By.id("password")).sendKeys("jachu1985");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(5000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHerf->aHerf.findElements(By.xpath(".//span[@title=\"Kodilla Application\"]")).size()>0)
                .findFirst().get().click();
        Thread.sleep(5000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan->theSpan.getText().contains(taskName))
                .findFirst().isPresent();
        driverTrello.close();

        return result;
    }

    public boolean deleteTask(String taskName) throws InterruptedException{
        final String SERVICE_URL = "https://chupacabra1985.github.io/";
        WebDriver driverService = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverService.get(SERVICE_URL);

        while (!driverService.findElement(By.xpath("//select[1]")).isDisplayed());

       driverService.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm->anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
                .forEach(theForm->{
                    WebElement buttonDeleteCard = theForm.findElement(By.xpath(".//button[contains(@class, \"task-delete\")]"));
                    buttonDeleteCard.click();
                });
       return true;
    }


    @Test
    public void shouldCreateTrelloCard() throws InterruptedException{
        String taskName = createCrudAppTask();
        sendTesttaskToTrello(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
        assertTrue(deleteTask(taskName));
    }

}
