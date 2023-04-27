package com.example.demo.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println("Hello World!" );
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
        driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Mohana");
        driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("Mohana44@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Mohana");
        driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("Mohana44@gmail.com");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
     
    }
}