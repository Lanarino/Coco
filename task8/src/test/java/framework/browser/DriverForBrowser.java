package framework.browser;

import framework.utils.PropertiesWorker;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class DriverForBrowser {
    private static DriverForBrowser instanceOfSingletonBrowserClass = null;
    private static WebDriver driver;

    private DriverForBrowser() {

        driver = BrowserFactory.setupDriver(PropertiesWorker.getConfigProperties("framework"));

    }

    public static DriverForBrowser getInstanceOfSingletonBrowserClass() {
        if (instanceOfSingletonBrowserClass == null) {
            instanceOfSingletonBrowserClass = new DriverForBrowser();
        }
        return instanceOfSingletonBrowserClass;
    }


    public static WebDriver getDriver() {
        return driver;
    }

    public void implicitly() {
        int time = Integer.parseInt(PropertiesWorker.getConfigProperties("implicitlyWaiting"));
        DriverForBrowser.getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void maximize() {
        DriverForBrowser.getDriver().manage().window().maximize();
    }

    public void goToAddress(String address) {
        DriverForBrowser.getDriver().get(address);
    }

    public void quit() {
        driver.quit();
        instanceOfSingletonBrowserClass = null;
    }

}
