package PageActions;

import PageLocators.HomePL;
import Utils.SeleniumDriverClass;
import io.github.sukgu.support.ElementFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import static Utils.SeleniumDriverClass.wait;

public class HomePA {
    WebDriver driver;
    HomePL homePL = null;

    public HomePA() {
        this.homePL = new HomePL(SeleniumDriverClass.getDriver());
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(driver));
        PageFactory.initElements(SeleniumDriverClass.getDriver(), homePL);
    }

    public void clickMyAccount() {
        homePL.accountMenu.click();
    }

}
