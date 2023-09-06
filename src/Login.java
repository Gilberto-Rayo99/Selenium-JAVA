
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void LoginCredentials() {
        try {
            driver.get("https://demo.guru99.com/test/login.html");

            var email = driver.findElement(By.id("email"));
            var psw = driver.findElement(By.id("passwd"));
            var BtnLogin = driver.findElement(By.id("SubmitLogin"));
            email.sendKeys("ksdfjhds@gmail.com");
            psw.sendKeys("mitomano1234");
            Thread.sleep(2000);
            psw.submit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
