package com.happyfresh.genericLib;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Base
{
    public static AndroidDriver<AndroidElement> androidDriver;
    public static void openApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A20s");
        cap.setCapability("appPackage", "com.happyfresh.staging");
        cap.setCapability("appActivity", "com.happyfresh.ui.module.splash.SplashActivity");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("fullReset", "false");
        cap.setCapability("noReset", "true");
        androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        System.out.println("App opened");
    }

    public static void sleep(int value)
    {
        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
