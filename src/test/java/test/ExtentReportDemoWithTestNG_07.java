package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.*;

public class ExtentReportDemoWithTestNG_07 {

    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;

    @BeforeSuite
    public void setup(){
        // start reporters
        htmlReporter = new ExtentHtmlReporter("extent.html");

        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

    }
    @Test
    public void test1(){

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
        try{
            Thread.sleep(6000);
//            test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        }
        catch(InterruptedException e){
            //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
            System.out.println("main thread interrupted");
            // test with snapshot
  //          test.addScreenCaptureFromPath("screenshot.png");

        }



    }
    @Test
    public void test2(){

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
        try{
            Thread.sleep(6000);
//            test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        }
        catch(InterruptedException e){
            //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
            System.out.println("main thread interrupted");
            // test with snapshot
            //          test.addScreenCaptureFromPath("screenshot.png");

        }



    }

    @Test
    public void test3(){

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
        try{
            Thread.sleep(6000);
//            test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        }
        catch(InterruptedException e){
            //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
            System.out.println("main thread interrupted");
            // test with snapshot
            //          test.addScreenCaptureFromPath("screenshot.png");

        }



    }

    @AfterSuite
    public void tearDown(){
        // calling flush writes everything to the log file
        extent.flush();
        try{
            Thread.sleep(6000);
        }
        catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
//        driver.close();
        System.out.println("test completed successfully");


    }
}
