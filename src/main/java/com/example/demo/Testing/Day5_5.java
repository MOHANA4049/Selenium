package com.example.demo.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_5 {
public static void main(String[] args)
{
    WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
    WebDriver driverr= new EdgeDriver();
    WebDriver driverrr = new EdgeDriver();
    String url="https://www.google.com/";
    driver.get(url);
    driverr.get(url);
    driverrr.get(url);
    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Apple",Keys.ENTER);
    driverr.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium",Keys.ENTER);
    driverrr.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Cucumber",Keys.ENTER);
   
    String t1=driver.getTitle();
    System.out.println(t1);
   
    String t2=driverr.getTitle();
    System.out.println(t2);
   
    String t3=driverrr.getTitle();
    System.out.println(t3);
   
    String msg1=driver.getWindowHandle();
    System.out.println(msg1);
    String msg2=driverr.getWindowHandle();
    System.out.println(msg2);
    String msg3=driverrr.getWindowHandle();
    System.out.println(msg3);
}
}
