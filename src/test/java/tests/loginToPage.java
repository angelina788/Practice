package tests;

import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class loginToPage extends LoginPage {

   @Test
    public void loginPractice1(){

       String url = ConfigurationReader.getProperty("url");
       Driver.getDriver().get(url);

       LoginPage login = new LoginPage();


       String userName = ConfigurationReader.getProperty("username");
       login.username.sendKeys(userName);
       BrowserUtils.sleep(1);

       String password = ConfigurationReader.getProperty("password");
       login.password.sendKeys(password);
       BrowserUtils.sleep(1);

       login.loginButton.click();

       ////div[@class='pricebar']



    }
}
