package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;
    public BasePage() {

        PageFactory.initElements(driver,this);
    }
}
