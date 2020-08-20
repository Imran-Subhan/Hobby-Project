//package com.qa.frontendtest;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class createplayertest {
//	
//	static ChromeDriver driver;
//    
//    @Before
//    public void init() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        
//         driver = new ChromeDriver();
//        
//    } 
//
//    
//    @Test
//    public void CreateAPlayer() throws InterruptedException{
//        WebElement target;
//        
//        driver.get("http://127.0.0.1:5501/Create.html");
//
//        target = driver.findElementByXPath("//*[@id=\"choice\"]");
//        target.click();
//        Select players = new Select(driver.findElement(By.id("choice")));
//        players.selectByVisibleText("Pepe");
//        Thread.sleep(1000);
//        
//        target = driver.findElementByXPath("//*[@id=\"inputPlayerno\"]");
//        target.sendKeys("19");
//        
//        Thread.sleep(2000);
//  
//        driver.findElementByXPath("//*[@id=\"form-row5\"]/div/center/button").click();
//        
//        Thread.sleep(2000);
//        
//        driver.findElementByXPath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a").click();
//        
//        Thread.sleep(2000);
//           
//    }
//    
//    @After
//    public void UpdateDeletePlayer() throws InterruptedException{
//        WebElement target;
//        
//        
//        driver.get("http://127.0.0.1:5501/CreateTeam.html");
//        Thread.sleep(4000);
//        target = driver.findElementById("openUpdateForm");
//        target.click();
//        
//        target = driver.findElementByXPath("//*[@id=\"updAttack\"]");
//        target.clear();
//        target.sendKeys("65");
//        driver.findElementByXPath("//*[@id=\"myForm\"]/form/button[1]").click();
// 
//        Thread.sleep(2000);
//        
//        target = driver.findElementByXPath("//*[@id=\"player\"]/td[5]/button[2]");
//        target.click();
//        
//        Thread.sleep(1000);
//      
//        
//        
//    
//    }
//}
