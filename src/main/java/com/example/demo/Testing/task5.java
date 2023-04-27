package com.example.demo.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class task5
{
	 public static void main( String[] args ) throws InterruptedException
	    {
		 WebDriverManager.edgedriver().setup();
	       WebDriver driver=new EdgeDriver();
	       driver.navigate().to("https://j2store.net/free");
	       String url=driver.getCurrentUrl();
	       System.out.println();
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
	       driver.navigate().to("https://j2store.net/free/index.php/shop?filter_catid=11");
	       String url1=driver.getCurrentUrl();
	       System.out.println();
	    }
}