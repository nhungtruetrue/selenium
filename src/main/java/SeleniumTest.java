import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
    }

    @Test
    public void TC01() {
        driver.get("https://abc.staging.weekly.vn/login");
        WebElement inputUsername = driver.findElement(new By.ByXPath("(//form//input[@type='email'])[2]"));
        inputUsername.sendKeys("nhungdth@rabiloo.com");
        WebElement inputPassword = driver.findElement(new By.ByXPath("(//form//input[@type='password'])[2]"));
        inputPassword.sendKeys("a12345678X");
        WebElement button = driver.findElement(new By.ByXPath("(//button)[2]"));
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/"));

        // Gán URL sau khi đăng nhập
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.equals("https://abc.staging.weekly.vn")) {
            System.out.println("✅ Điều hướng thành công!");
        } else {
            System.out.println("❌ Điều hướng thất bại. URL hiện tại: " + currentUrl);
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
