package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import  pages.GoogleSearchPage;

public class GoogleSearchTest_03 {

    private static  WebDriver driver = null;
    public static void main(String[] args) {
        googleSearch();

    }

    public static void googleSearch(){

        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath" + projectPath);
        System.setProperty("webdriver.gecko.driver", projectPath+"/src/main/resources/drivers/gecko/geckodriver.exe");
        driver = new FirefoxDriver();
        //goto google.com
        driver.get("http://google.com");
        //enter the text in search box
        GoogleSearchPage.textbox_search(driver).sendKeys("hussain ul haque");
        // click on search button
        GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);

        //close browser
        try{
             Thread.sleep(3000);
            }
        catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
        driver.close();
        System.out.println("test completed successfully");



    }

}

