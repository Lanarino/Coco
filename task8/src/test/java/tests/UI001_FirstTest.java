package tests;

import framework.browser.DriverForBrowser;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UI001_FirstTest extends BaseTest{
    @Test
    public void testScenario() throws InterruptedException {
        DriverForBrowser.getDriver().findElement(By.xpath("//*[@id=\"userbar\"]/div[2]/div/div/div[1]")).click();
        Thread.sleep(5000);
        DriverForBrowser.getDriver().findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input")).sendKeys("i.korolev.dmitry@gmail.com");
        DriverForBrowser.getDriver().findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div/div/input")).sendKeys("qwerty123");
        DriverForBrowser.getDriver().findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]")).click();
        Thread.sleep(80000);
        DriverForBrowser.getDriver().findElement(By.xpath("//*[@id=\"userbar\"]/div[1]/div[1]/a/div")).click();
        Thread.sleep(3000);
        String actualresult = DriverForBrowser.getDriver().findElement(By.xpath("//*[@id=\"userbar\"]/div[1]/div[1]/div/div[1]/div[1]/div[2]/div/a")).getText();
        Assert.assertEquals("Выйти",actualresult);

    }
}
