import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        // Đường dẫn đến ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        // Khởi tạo trình duyệt
        WebDriver driver = new ChromeDriver();

        // Mở trang web
        driver.get("https://www.google.com");

        // In ra tiêu đề trang
        System.out.println("Title: " + driver.getTitle());

        // Đóng trình duyệt
        driver.quit();
    }
}
