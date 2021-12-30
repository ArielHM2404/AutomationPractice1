package PageLocators;

import io.github.sukgu.support.ElementFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class LoginPL {

    WebDriver driver;

    public LoginPL(WebDriver driver) {
        this.driver = driver;

        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(driver));
        // need to use decorator if you want to use @FindElementBy in your PageFactory model.
        PageFactory.initElements(decorator, this);
    }

    //* LOGIN PAGE ---------------------
    @FindBy (xpath = "//*[@name=\"username\"]")
    public WebElement getusernameInput;

    @FindBy (xpath = "//*[@name=\"password\"]")
    public WebElement getpasswordInput;

    @FindBy (xpath = "//*[@name=\"login\"]")
    public WebElement getloginBtn;





}
