package net.shipovalov.training;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class NTestBase {
    WebDriver driver;

    public static boolean isAlertPresent(ChromeDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    protected void submitReport() {
        driver.findElement(By.cssSelector("input.button")).click();
    }

    protected void fillReport(String reportfillsummary, String reportfilldescription, String reportfillstep) {
        if (!driver.findElement(By.xpath("//div[3]/form/table/tbody/tr[2]/td[2]/select//option[3]")).isSelected()) {
            driver.findElement(By.xpath("//div[3]/form/table/tbody/tr[2]/td[2]/select//option[3]")).click();
        }

        if (!driver.findElement(By.xpath("//div[3]/form/table/tbody/tr[3]/td[2]/select//option[6]")).isSelected()) {
            driver.findElement(By.xpath("//div[3]/form/table/tbody/tr[3]/td[2]/select//option[6]")).click();
        }

        if (!driver.findElement(By.xpath("//div[3]/form/table/tbody/tr[4]/td[2]/select//option[6]")).isSelected()) {
            driver.findElement(By.xpath("//div[3]/form/table/tbody/tr[4]/td[2]/select//option[6]")).click();
        }

        if (!driver.findElement(By.xpath("//div[3]/form/table/tbody/tr[5]/td[2]/select//option[4]")).isSelected()) {
            driver.findElement(By.xpath("//div[3]/form/table/tbody/tr[5]/td[2]/select//option[4]")).click();
        }

        driver.findElement(By.id("platform")).click();
        driver.findElement(By.id("platform")).clear();
        driver.findElement(By.id("platform")).sendKeys("NPlatform");
        driver.findElement(By.id("os")).click();
        driver.findElement(By.id("os")).clear();
        driver.findElement(By.id("os")).sendKeys("NOS");
        driver.findElement(By.id("os_build")).click();
        driver.findElement(By.id("os_build")).clear();
        driver.findElement(By.id("os_build")).sendKeys("NOS Version");
        if (!driver.findElement(By.xpath("//div[3]/form/table/tbody/tr[8]/td[2]/select//option[2]")).isSelected()) {
            driver.findElement(By.xpath("//div[3]/form/table/tbody/tr[8]/td[2]/select//option[2]")).click();
        }
        driver.findElement(By.name("summary")).click();
        driver.findElement(By.name("summary")).clear();
        driver.findElement(By.name("summary")).sendKeys(reportfillsummary);
        driver.findElement(By.name("description")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description")).sendKeys(reportfilldescription);
        driver.findElement(By.name("steps_to_reproduce")).click();
        driver.findElement(By.name("steps_to_reproduce")).clear();
        driver.findElement(By.name("steps_to_reproduce")).sendKeys(reportfillstep);
        driver.findElement(By.name("additional_info")).click();
        driver.findElement(By.name("additional_info")).clear();
        driver.findElement(By.name("additional_info")).sendKeys("NAdditional Information");

        driver.findElement(By.name("view_state")).click();
        if (!driver.findElement(By.id("report_stay")).isSelected()) {
            driver.findElement(By.id("report_stay")).click();
        }
    }

    protected void goToReportForm() {
        driver.findElement(By.linkText("Report Issue")).click();
    }

    protected void login(String username, String password) {
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.button")).click();
    }

    protected void openLoginPage(String urlMainPage) {
        driver.get(urlMainPage);
    }

    @AfterMethod

    public void tearDown() {
        logout();
        driver.quit();
    }

    private void logout() {
        driver.findElement(By.linkText("Logout")).click();
    }
}
