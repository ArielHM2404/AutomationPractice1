package PageActions;

import PageLocators.HomePL;
import PageLocators.LoginPL;
import Utils.SeleniumDriverClass;
import io.github.sukgu.support.ElementFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class LoginPA {


    WebDriver driver;
    HomePL homePL = null;
    LoginPL loginPL = null;

    public LoginPA() {
        this.loginPL = new LoginPL(SeleniumDriverClass.getDriver());
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(driver));
        PageFactory.initElements(SeleniumDriverClass.getDriver(), loginPL);
    }




    public void login(String username, String password) {
        loginPL.getusernameInput.sendKeys(username);
        loginPL.getpasswordInput.sendKeys(password);
    }

    public void clickLoginBtn() {
        loginPL.getloginBtn.click();
    }



}
