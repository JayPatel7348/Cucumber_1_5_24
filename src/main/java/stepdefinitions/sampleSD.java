package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sampleSD {

    WebDriver driver;
    @Given("Login page should be opened")
    public void login_page_should_be_opened() {

        System.out.println("Login page should be opened");

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

    }
    @When("I enter username and password")
    public void i_enter_username_and_password() {

        System.out.println("I enter username and password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");

    }
    @When("I click on Login button")
    public void i_click_on_login_button() {

        System.out.println("I click on Login button");

        driver.findElement(By.xpath("//input[@name='submit']")).click();


    }
    @Then("I should be redirected to home page")
    public void i_should_be_redirected_to_home_page() {

        System.out.println("I should be redirected to home page");

        String pageTitle=driver.getTitle();
        //System.out.println(pageTitle);

        Assert.assertEquals(pageTitle,"POSNIC - Dashboard");

    }


}
