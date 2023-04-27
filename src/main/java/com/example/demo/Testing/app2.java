
package com.example.demo.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class app2 
{
    public static void main( String[] args ) throws InterruptedException
    {
       WebDriverManager.edgedriver().setup();
       WebDriver driver=new EdgeDriver();
       driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Mohana");
       driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("R");
       driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("mohanarajendran37@gmail.com");
       driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Mohana@123");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
    }
}
