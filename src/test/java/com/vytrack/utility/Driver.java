package com.vytrack.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver obj ;

    private Driver(){ }

    public static WebDriver getDriver(){

        String browserName = com.vytrack.utility.ConfigReader.read("browser");

        if(obj == null){

            switch (browserName.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;

                default:
                    obj = null;
                    System.out.println("Unknown Browser Type! "+browserName);
            }
            return obj ;

        }else{
//            System.out.println("You have it just use existing one");
            return obj ;

        }

    }

    public static void closeBrowser(){

        if(obj != null){
            obj.quit();
            obj = null;
        }
    }
}
