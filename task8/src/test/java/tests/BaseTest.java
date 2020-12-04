package tests;

import framework.browser.DriverForBrowser;
import framework.utils.PropertiesWorker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected DriverForBrowser browser;


    @BeforeClass
    public void setUpBeforeClass() {

    }

    @BeforeMethod
    public void setUpBeforeTest() {
        browser = DriverForBrowser.getInstanceOfSingletonBrowserClass();
        browser.implicitly();
        browser.goToAddress(PropertiesWorker.getConfigProperties("url"));
        browser.maximize();
    }

    @AfterMethod
    public void afterMethod() {
        browser.quit();
    }
}
