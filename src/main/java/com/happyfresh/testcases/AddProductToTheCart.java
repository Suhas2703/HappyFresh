package com.happyfresh.testcases;

import com.happyfresh.genericLib.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.swing.plaf.basic.BasicEditorPaneUI;
import java.net.MalformedURLException;

public class AddProductToTheCart
{
    @Given("when user select any product")
    public void when_user_select_any_product() throws MalformedURLException {
        Base.openApp();
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Deals']")).click();
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[@text='On Sale']")).click();
        Base.sleep(2000);
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'HappyAds')]")).click();
        Base.sleep(2000);
        Base.androidDriver.findElement(By.xpath("//android.widget.Button[@text='Start Shopping']")).click();
        Base.sleep(8000);
        Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/textview_search_store_home")).click();

    }

    @When("User add product to the cart {string}")
    public void user_add_product_to_the_cart(String productName) {
        Base.sleep(4000);
        Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/ui_view_input_product_find_product_edittext")).sendKeys(productName);
        Base.sleep(1000);
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[@text='bango']")).click();
        Base.sleep(4000);
        Base.androidDriver.findElement(By.xpath("(//android.widget.TextView[contains(@text,'Bango')])[1]/../following-sibling::android.widget.RelativeLayout")).click();
        Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/ui_view_cart_menu_icon")).click();
    }

    @Then("Verify product in the cart")
    public void verify_product_in_the_cart() {
        Base.sleep(3000);
        Boolean itemInCart = Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/ui_view_product_cart_name_textview")).isDisplayed();
        if(itemInCart==true)
        {
            System.out.println("Successfully added product added to the cart");
        }
        else
            System.out.println("Some error occured while adding product to the cart");
    }


}
