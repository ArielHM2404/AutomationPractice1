package PageActions;

import PageLocators.HomePL;
import PageLocators.ShoppingPL;
import Utils.SeleniumDriverClass;
import io.github.sukgu.support.ElementFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class ShoppingPA {



    WebDriver driver;
    HomePL homePL = null;
    ShoppingPL shoppingPL = null;

    public ShoppingPA() {
        this.shoppingPL = new ShoppingPL(SeleniumDriverClass.getDriver());
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(driver));
        PageFactory.initElements(SeleniumDriverClass.getDriver(), shoppingPL);
    }

    public void filterByPrice(int minimunValue, int maximumValue) {
        Actions robo = new Actions(driver);
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/div"));
        WebElement slider1 = driver.findElement(By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/span[2]"));

        robo.dragAndDropBy(slider1, maximumValue,0).perform();



    }
}
