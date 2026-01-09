package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import utils.DriverSetup;

import static org.junit.Assert.assertTrue;

public class FlipkartSteps {

    @Given("user opens Flipkart website")
    public void open_flipkart() {
        DriverSetup.initDriver();
    }

    @Then("login popup should be displayed")
    public void login_popup_displayed() {
        assertTrue(
            DriverSetup.driver.findElement(By.xpath("//span[text()='Login']")).isDisplayed()
        );
    }

    @Then("mobile number input field should be visible")
    public void mobile_input_visible() {
        assertTrue(
            DriverSetup.driver.findElement(By.xpath("//input[@type='text']")).isDisplayed()
        );
        DriverSetup.quitDriver();
    }

    @When("user searches for {string}")
    public void search_product(String product) {
        DriverSetup.driver.findElement(By.name("q")).sendKeys(product);
        DriverSetup.driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("search results should be displayed")
    public void results_displayed() {
        assertTrue(
            DriverSetup.driver.findElement(By.xpath("//span[contains(text(),'results')]")).isDisplayed()
        );
        DriverSetup.quitDriver();
    }

    @Then("Flipkart logo should be visible")
    public void logo_visible() {
        assertTrue(
            DriverSetup.driver.findElement(By.xpath("//img[contains(@title,'Flipkart')]")).isDisplayed()
        );
        DriverSetup.quitDriver();
    }
}
