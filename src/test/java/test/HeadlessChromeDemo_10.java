package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessChromeDemo_10 {
    public static void main(String[]args){
        test();
    }
public static void test(){
String projetcPath = System.getProperty("user.dir");
    System.setProperty("webdriver.chrome.driver",projetcPath+"\\src\\main\\resources\\drivers\\chrome\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    WebDriver driver = new ChromeDriver(options);

    driver.get("https://google.com");
    System.out.println(driver.getTitle());
    driver.findElement(By.name("q")).sendKeys("Automation");
    driver.findElement(By.id("btnk")).sendKeys(Keys.RETURN);

    driver.close();


}

}
