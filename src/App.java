import org.openqa.selenium.WebDriver;

public class App {

    public static void main(String[] args) throws Exception {

        WebDriverHelper webDriverHelper = new WebDriverHelper();
        WebDriver driver = webDriverHelper.getDriver();
        Login login = new Login(driver);
        RadioButtonsDemo radioButtonsDemo = new RadioButtonsDemo(driver);
        
        radioButtonsDemo.performRadioButtonDemo();
        login.LoginCredentials();
        webDriverHelper.quitDriver();
    }
}
