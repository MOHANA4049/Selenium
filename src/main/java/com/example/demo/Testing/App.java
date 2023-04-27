
package com.example.demo.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
       WebDriverManager.edgedriver().setup();
       WebDriver driver=new EdgeDriver();
       driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
       driver.manage().window().maximize();
       //Navigating down
       JavascriptExecutor js =  (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,800)", args);
       driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Mohana");
       driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("R");
       driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("mohanarajendran37@gmail.com");
       driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Mohana@123");
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]/div/div/button")).click();
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
       Thread.sleep(5000);
    }
}
