package com.happyfresh.main;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src\\main\\java\\feature\\login.feature",glue={"testcases"})
public class LoginToTheApplication {

}
