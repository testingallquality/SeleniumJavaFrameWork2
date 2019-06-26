package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo_08 {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("ignoreProtectedModeSettings", true);

        System.out.println("projectPath" + projectPath);
        System.setProperty("webdriver.IEDriverServer.driver", projectPath+"/src/main/resources/drivers/IE/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver(caps);
driver.get("https://google.com");
driver.findElement(By.name("q")).sendKeys("hussain Ul haque");
driver.findElement(By.id("gbqfbb")).sendKeys(Keys.RETURN);
    }
}
