package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest_04 {
    private static  WebDriver driver = null;
    public static void main(String[] args) {
        googleSearchTest();
    }

    public static void googleSearchTest(){

        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath" + projectPath);
        System.setProperty("webdriver.gecko.driver", projectPath+"/src/main/resources/drivers/gecko/geckodriver.exe");
        driver = new FirefoxDriver();

        GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);

        driver.get("https://google.com");
        searchPageObj.setTextInSearchBox("Sharey Ali Haque");
        searchPageObj.clickSearchButton();

        //close browser
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

