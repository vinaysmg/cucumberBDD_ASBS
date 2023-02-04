package util;

import enums.Browsers;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class DriverManagerUtil {
    private static ThreadLocal<WebDriver> driverTl = new ThreadLocal<>();

    public static void initDriver(Browsers browsers){
        WebDriver driver = DriverUtil.initDriver(browsers);
        driverTl.set(driver);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public static void tearDown(){
        driverTl.get().quit();
    }

    public static WebDriver getDriver(){
        return driverTl.get();
    }
}
