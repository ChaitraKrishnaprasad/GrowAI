package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginStepDefinitions {
    static WebDriver driver;
    LoginPage login;
    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.saucedemo.com/");
    }
    @When("user enters valid {string} and {string}")
    public void userEntersValidAnd(String username, String password) {
       login = new LoginPage(driver);
       login.enterUserName(username);
       login.enterPassword(password);
    }

//    @When("user enters valid username and password")
//    public void user_enters_valid_username_and_password() {
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//    }

    @And("click on login button")
    public void click_on_login_button() {
       login.ClickLogin();
    }
    @Then("user should be navigated to home page")
    public void user_should_be_navigated_to_home_page() {
        login.isProductDisplayed();
    }

    @Then("add products to the cart")
    public void add_products_to_the_cart() {
     login.addToCart();
    }

    @And("close the browser")
    public void close_the_browser() {
        driver.quit();
    }

}
