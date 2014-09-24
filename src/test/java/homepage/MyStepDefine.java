package homepage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class MyStepDefine {
    private WebDriver driver = new FirefoxDriver();


    @Before
    public void setup() {

    }

    @After
    public void teardown() {
        driver.close();
        driver.quit();
    }


    @Given("^set username (.*)$")
    public void set_username_username(String username) throws Throwable {
    }

    @And("^set password (.*)$")
    public void set_password_password(String password) throws Throwable {
        System.out.println("use password : " + password);
    }

    @Then("^I should get my username (.*) on the page$")
    public void I_should_get_my_username_username_on_the_page(String username) throws Throwable {
    }

    @Then("^I should get login failed information on the page$")
    public void I_should_get_login_failed_information_on_the_page() throws Throwable {
    }

    @When("^I click login button$")
    public void I_click_login_button() throws Throwable {
    }

    @Given("^open the page$")
    public void open_the_page() throws Throwable {
        driver.get("http://localhost:8080");
    }
}
