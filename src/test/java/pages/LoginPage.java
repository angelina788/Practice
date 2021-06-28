package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

      // username
     @FindBy( id ="user-name" )
     public WebElement username;

     // password
    @FindBy (id = "password")
    public WebElement password;

    //login button

    @FindBy(id="login-button")
    public WebElement loginButton;


}
