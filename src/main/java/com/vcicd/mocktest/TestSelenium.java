package com.vcicd.mocktest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Apps\\Testing\\TestSelenium\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=old");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://localhost:8080/SpringBootCRUDApp/#/");
        WebElement body = driver.findElement(By.tagName("body"));
        System.out.println(body.isDisplayed());
        driver.quit();
    }
}
