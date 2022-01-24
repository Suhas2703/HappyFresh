package com.happyfresh.testcases;

import com.happyfresh.genericLib.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductDetails {
    @Given("when user select the product")
    public void whenUserSelectTheProduct() throws MalformedURLException {
        Base.openApp();
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Deals']")).click();
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[@text='On Sale']")).click();
        Base.sleep(2000);
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'HappyAds')]")).click();
        Base.sleep(2000);
        Base.androidDriver.findElement(By.xpath("//android.widget.Button[@text='Start Shopping']")).click();
        Base.sleep(10000);
        Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/textview_search_store_home")).click();

    }

    @When("Fetch the details of the product {string}")
    public void fetchTheDetailsOfTheProduct(String productName) {
        Base.sleep(4000);
        Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/ui_view_input_product_find_product_edittext")).sendKeys(productName);
        Base.sleep(1000);
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[@text='bango']")).click();
        Base.sleep(4000);
        Base.androidDriver.findElement(By.xpath("(//android.widget.TextView[contains(@text,'Bango')])[1]")).click();
        Base.sleep(2000);
        String selectedProductName=Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/ui_view_product_name_textview")).getText();
        System.out.println("Product Details are below:");
        System.out.println("Name: " +selectedProductName);
        String productPrice=Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/ui_view_product_price_textview")).getText();
        System.out.println("Price: "+productPrice);
        String productWeight=Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/ui_view_product_weight_textview")).getText();
        System.out.println("Weight: "+productWeight);
        String unitPrice=Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/ui_view_product_unit_price_textview")).getText();
        System.out.println("Unit Price: "+unitPrice);
        String productDescription=Base.androidDriver.findElement(By.id("com.happyfresh.staging:id/ui_view_product_description_textview")).getText();
        System.out.println("Description: "+productDescription);

    }


}
