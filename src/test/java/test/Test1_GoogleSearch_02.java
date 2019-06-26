package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1_GoogleSearch_02 {
    public static void main(String[] args) {
        googleSearch();

    }

    public static void googleSearch(){
        //String projectPath = System.getProperty("user.dir");
        //System.out.println("projectPath" + projectPath);
        //System.setProperty("webdriver.chrome.driver", projectPath+"/src/main/resources/drivers/chrome/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath" + projectPath);
        System.setProperty("webdriver.gecko.driver", projectPath+"/src/main/resources/drivers/gecko/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //goto google.com
        driver.get("http://google.com");
        //enter the text in search box
        driver.findElement(By.name("q")).sendKeys("Hussain Ul Haque");
        // click on search button
//        driver.findElement(By.name("btnk")).click();
        driver.findElement(By.id("gbqfbb")).click();
        //driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);
        //driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
        driver.findElement(By.id("gbqfbb")).sendKeys(Keys.RETURN);

        //close browser
        driver.close();
        System.out.println("test completed successfully");



    }

}

