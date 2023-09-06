import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonsDemo {
    private WebDriver driver;

    public RadioButtonsDemo(WebDriver driver) {
        this.driver = driver;
    }

    public void performRadioButtonDemo() {
        driver.get("http://demo.guru99.com/test/ajax.html");

        var checkedYes = driver.findElement(By.id("yes"));
        checkedYes.click();
        driver.findElement(By.id("no")).click();
        driver.findElement(By.id("buttoncheck")).click();

        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements:" + elements.size());

        for (int i = 0; i < elements.size(); i++) {
            System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
        }
    }
}
