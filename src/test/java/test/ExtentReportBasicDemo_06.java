package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtentReportBasicDemo_06 {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
       // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test1 = extent.createTest("MyFirstTest", "Sample description");

        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath" + projectPath);
        System.setProperty("webdriver.gecko.driver", projectPath+"/src/main/resources/drivers/gecko/geckodriver.exe");
        driver = new FirefoxDriver();

        test1.log(Status.INFO, "Starting Test Case");
        driver.get("https://google.com");
        test1.pass("Navigated to Google.com");
        driver.findElement(By.name("q")).sendKeys("Hussain Ul Haque");
        test1.pass("Entered text in searchbox");
        driver.findElement(By.id("gbqfbb")).sendKeys(Keys.RETURN);
        test1.pass("pressed keyboard enter key");
        test1.info("test completed");


        // creates a toggle for the given test, adds all log events under it
        ExtentTest test2 = extent.createTest("MyFirstTest", "Sample description");

        test2.log(Status.INFO, "Starting Test Case");
        driver.get("https://google.com");
        test2.fail("Navigated to Google.com2");
        driver.findElement(By.name("q")).sendKeys("Hussain Ul Haque");
        test2.fail("Entered text in searchbox2");
        driver.findElement(By.id("gbqfbb")).sendKeys(Keys.RETURN);
        test2.pass("pressed keyboard enter key2");
        test2.info("test completed");


        // calling flush writes everything to the log file
        extent.flush();
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
