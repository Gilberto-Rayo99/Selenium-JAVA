  import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHelper {
    private WebDriver driver;

    public WebDriverHelper() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cyber\\Desktop\\Projects\\SeleniumJAVA\\FirstProject\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        driver.quit();
    }
}


