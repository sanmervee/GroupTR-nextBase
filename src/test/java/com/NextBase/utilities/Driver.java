package com.NextBase.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /*
Creating the private constructor so this class object is not reachable from outside
*/
    private Driver() {}

        /*
        making our driver instance private so that is not reachable from outside of the class
        we make it static because we want it to run before everything else, and also we will use it in a static method
         */

    private static WebDriver driver;
    /*
    Creating re-usable utility method that will return same driver instance everytime we call it
     */

    public static WebDriver getDriver(){
        if(driver == null){
            /*
            We read our browser type from configuration.properties file using
            .getProperty method we creating in ConfigurationReader class
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
            Depending on the browser type
             */

            switch(browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }
        }
        /*
        Same driver instance will be returned  every time we call Driver.getDriver(); method
         */
        return driver;
    }


    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver=null;
        }
    }

    }


