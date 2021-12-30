package PageLocators;

import io.github.sukgu.support.ElementFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class HomePL {

    WebDriver driver;

    public HomePL(WebDriver driver) {
        this.driver = driver;
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(driver));
        //?  need to use decorator if you want to use @FindElementBy in your PageFactory model.
        PageFactory.initElements(decorator, this);
    }

    //* HOME PAGE OBJECTS

    @FindBy (xpath = "//a[text() = \"My Account\"]")
    public WebElement accountMenu;
}
