package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

import static org.testng.reporters.jq.BasePanel.C;

public class AutoITDemo_11 {

    public static void main(String[] args) {
       try{
        test();
    }catch (Exception exp){

        exp.getStackTrace();
        }
    }

    public static void test() throws IOException {

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.geckodriver.driver",projectPath+"/src/main/resources/drivers/gecko/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://tinyupload.com");
        driver.findElement(By.name("uploadfile")).click();
        Runtime.getRuntime().exec("C:/Users/Shareyalihaque/Documents/Selenium/AutoIt3/AutoITDemo/ImageUploadScript.exe");

        try{
        Thread.sleep(3000);

    }catch (Exception exp){
            exp.getMessage();
        }
}}
