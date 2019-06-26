package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class BrowserTest_01 {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath" + projectPath);
        System.setProperty("webdriver.gecko.driver", projectPath+"/src/main/resources/drivers/gecko/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com/");
        WebElement textBox= driver.findElement(By.name("q"));
        textBox.sendKeys("Automation Step by Step");

        driver.findElement(By.name("q")).sendKeys("abcd");
        List<WebElement> listOfInputElements = driver.findElements((By.xpath("//input")));
        int count = listOfInputElements.size();
        System.out.println("COunt of input elements - "+ count);

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();

    }
}
