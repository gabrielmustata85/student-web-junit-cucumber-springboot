package com.example.studentcucumberjunit.steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductsStep {

    public WebDriver driver;
    @Given("The home page is visible")
    public void the_home_page_is_visible() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("");
    }

    @When("The users types phone name in the search bar")
    public void the_users_types_phone_name_in_the_search_bar(String phones) {
       driver.findElement(By.xpath("//input[@id='keyword']")).sendKeys(phones);
    }
    
    @When("The users press enter")
    public void the_users_press_enter() {
        driver.findElement(By.xpath("//input[@id='keyword']")).sendKeys(Keys.ENTER);

    }
    @Then("The results are displayed")
    public void the_results_are_displayed() {
        Assert.assertTrue(driver.getCurrentUrl().contains("iphone"));
    }

    @After
    public void closeDriver(){
        driver.quit();
    }
}
