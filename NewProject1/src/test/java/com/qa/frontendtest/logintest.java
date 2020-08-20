//package com.qa.frontendtest;
//
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//
//
//
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class logintest {
//	    
//	static ChromeDriver driver;
//	    
//	    @Before
//	    public void init() {
//	        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//	        
//	         driver = new ChromeDriver();
//	        
//	    }
//	    
//	    
//
//	    
//	    @Test
//	    public void BecomeAMember() throws InterruptedException{
//	        WebElement target;
//	        
//	        driver.get("file:///C:/Users/imran/Desktop/Hobby-Project/Arsenal_Project/UserReg.html");
//
//	        target = driver.findElementByXPath("//*[@id=\"UsernameInp\"]");
//	        target.sendKeys("tester");
//	        
//	        target = driver.findElementByXPath("//*[@id=\"PasswordInp\"]");
//	        target.sendKeys("passer");
//	        
//	        Thread.sleep(1000);
//      
//	        driver.findElementByXPath("/html/body/form/button").click();
//	        
//	        
//	    }
//	    
//	    @After
//	    public void LoginUpdateDelete() throws InterruptedException{
//	        WebElement target;
//	        
//	        
//	        driver.get("http://127.0.0.1:5501/login.html");
//	        target = driver.findElementByXPath("//*[@id=\"UsernameInp\"]");
//	        target.sendKeys("tester");
//	        
//	        target = driver.findElementByXPath("//*[@id=\"PasswordInp\"]");
//	        target.sendKeys("passer");
//	        driver.findElementByXPath("/html/body/div/form/div[2]/div[1]/button").click();
//	        
//	        Thread.sleep(2000);
//	        
//	        target = driver.findElementByXPath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a");
//	        target.click();
//	        
//	        Thread.sleep(1000);
//	        
//	        target = driver.findElementByXPath("//*[@id=\"userid\"]/td[5]/button");
//	        target.click();
//	        
//	        target = driver.findElementByXPath("//*[@id=\"Updpassword\"]");
//	        target.click();
//	        
//	        target = driver.findElementByXPath("//*[@id=\"Updpassword\"]");
//	        target.sendKeys("12345");
//	        
//	        Thread.sleep(2000);
//	        
//	        target = driver.findElementByXPath("//*[@id=\"myForm\"]/form/button[2]");
//	        target.click();
//	        
//	        Thread.sleep(1000);
//	        
//	        target = driver.findElementByXPath("//*[@id=\"userid\"]/td[4]/button");
//	        target.click();
//	        
//	      
//	        
//	        
//        
//	    }
//	    
//	  
//	    
//	    
//}

