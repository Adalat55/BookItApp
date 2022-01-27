package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookItLoginPage {




    public BookItLoginPage(WebDriver driver){
        PageFactory.initElements(driver,  this);
    }


    @FindBy(name = "email")
    public WebElement username;


    @FindBy(name = "password")
    public WebElement password;




    public void loginToBookIt(){

        username.sendKeys("wfarrell8n@usnews.com");
        password.sendKeys("doniafisby"+ Keys.ENTER);


    }

}
