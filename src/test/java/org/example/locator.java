package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locator {
    @Test
    public void test(){
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.name("email")).sendKeys("jitendra12345klu");
       driver.findElement(By.className("form-control input-block js-login-field")).sendKeys("jitendra12345klu");
        driver.findElement(By.id("pass")).sendKeys("Test@1234567890@Test");
       driver.findElement(By.tagName("button")).click();
        driver.findElement(By.linkText("Forgotten account?")).click();
  //  driver.findElement(By.partialLinkText("Sign up for Facebook")).click();
    }
}
