package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1_GoogleSearchTestNGDemo_05 {
    private static WebDriver driver = null;
    @BeforeTest
    public void setUpTest(){
        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath" + projectPath);
        System.setProperty("webdriver.gecko.driver", projectPath+"/src/main/resources/drivers/gecko/geckodriver.exe");
        driver = new FirefoxDriver();

    }
    @Test
    public static void googleSearch(){

        //goto google.com
        driver.get("http://google.com");

        //enter the text in search box
        driver.findElement(By.name("q")).sendKeys("Hussain Ul Haque");

        // click on search button
//      driver.findElement(By.id("gbqfbb")).click();
        driver.findElement(By.id("gbqfbb")).sendKeys(Keys.RETURN);


    }
    @AfterTest
    public void tearDownTest(){
        try{
            Thread.sleep(6000);
        }
        catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
        driver.close();
        System.out.println("test completed successfully");

    }
}

