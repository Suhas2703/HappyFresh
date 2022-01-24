package com.happyfresh.testcases;

import com.happyfresh.genericLib.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.ArrayList;

public class ProductsList {
    @Given("when user select pantry option")
    public void whenUserSelectPantryOption() throws MalformedURLException {
        Base.openApp();
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Deals']")).click();
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[@text='On Sale']")).click();
        Base.sleep(2000);
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'HappyAds')]")).click();
        Base.sleep(2000);
        Base.androidDriver.findElement(By.xpath("//android.widget.Button[@text='Start Shopping']")).click();
        Base.sleep(8000);
        Base.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Pantry')]")).click();
        Base.sleep(2000);
    }

    @When("Fetch the list of the product")
    public void fetchTheListOfTheProduct() {
        java.util.List<AndroidElement> list = Base.androidDriver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.happyfresh.staging:id/ui_view_product_list_product_name_text_view']"));
        ArrayList<String> productList = new ArrayList<>();

        for(int i=0;i<list.size();i++)
        {
            productList.add(list.get(i).getText());
        }
        System.out.println(productList.toString());
    }
}
