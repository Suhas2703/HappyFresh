package com.happyfresh.testcases;

import com.happyfresh.genericLib.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class LoginToTheApplication extends Base{

    @Given("when user opens application")
    public void when_user_opens_application() throws MalformedURLException {
        Base.openApp();
        Base.androidDriver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Account']")).click();
        Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/ui_view_user_info_email")).click();
        Base.sleep(2000);
        Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/login")).click();
    }

    @When("user enters valid {string} and {string}")
    public void user_enters_valid_email_and_password(String email, String password)  {
        Base.sleep(2000);
        Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/email")).sendKeys(email);
        System.out.println("Entered email is: " +email);
        Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/password")).sendKeys(password);
        System.out.println("Entered password is: "+password );
    }

    @Then("click on login button and verify {string}")
    public void click_on_login_button(String email) {
        Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/login")).click();
        Base.sleep(5000);
        Base.androidDriver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='com.happyfresh.staging:id/toolbar']/android.widget.ImageButton")).click();
        Base.sleep(3000);
        String emailId= Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/ui_view_user_info_email")).getText();
        if(emailId.equals(email))
        {
            System.out.println("Login email id is matched with the expected");
        }
        else
            System.out.println("Login email id is not matching with the expected");
    }

}
