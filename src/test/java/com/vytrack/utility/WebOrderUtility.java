package com.vytrack.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtility {

    public static void login(WebDriver driverParam){

        // WebDriver driver =   WebDriverFactory.getDriver("chrome");

        // enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // click login
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();

    }


    public static void login(WebDriver driverParam, String username ,String password){

        // BELOW LINE WILL NOT WORK BECAUSE IT WILL OPEN NEW DRIVER EACH TIME
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        // enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")) .sendKeys(password);
        // click login
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();

    }


    public static void logout(WebDriver driverParam){

        // logout link has id of ctl00_logout
        driverParam.findElement(By.id("ctl00_logout")).click();

    }


    public static boolean isAtOrderPage(WebDriver driverParam){
        boolean result = false;

        try{
            WebElement header = driverParam.findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']"));
            System.out.println("ELEMENT WAS IDENTIFIED ");
            result = true ;
        }catch (NoSuchElementException e){
            System.out.println("NO Such element! you are not at the right page");
        }

        return result ;

        //  System.out.println("header.isDisplayed() = " + header.isDisplayed());

    }
}
