package PageLocators;

import Utils.Utils;
import io.github.sukgu.support.ElementFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class ShoppingPL {

    WebDriver driver;

    public ShoppingPL(WebDriver driver) {
        this.driver = driver;
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(driver));
        //?  need to use decorator if you want to use @FindElementBy in your PageFactory model.
        PageFactory.initElements(decorator, this);
    }

    //* SHOPPING PAGE OBJECTS

    @FindBy (xpath = "//*[@id='content']/form/select")
    public static WebElement sortSelect;

    @FindBy (xpath = "//*[contains(@href,'/shop/?orderby=[\"+value+\"')]")
    public static WebElement sortedProduct;

    @FindBy (xpath = "(//span[contains(.,'Sale!')])[1]")
    public static WebElement saleLabel;

    @FindBy (xpath = "(//span[@class='woocommerce-Price-amount amount'])[2]")
    public static WebElement actualPrice;

    @FindBy (xpath = "(//span[@class='woocommerce-Price-amount amount'])[1]")
    public static WebElement oldPrice;

    @FindBy (xpath = "(//a[contains(.,'Add to basket')])[1]")
    public static WebElement addToBasketButton;

    @FindBy (xpath = "(//span[contains(@class,'amount')])[1]")
    public static WebElement priceBookMenuLabel;

    @FindBy (xpath = "//a[contains(.,'View Basket')]")
    public static WebElement viewBasketLink;

    @FindBy (xpath = "(//span[@class='woocommerce-Price-amount amount'])[3]")
    public static WebElement subTotalPrice;

    @FindBy (xpath = "(//span[@class='woocommerce-Price-amount amount'])[5]")
    public static WebElement totalPrice;

    @FindBy (xpath = "//a[contains(.,'Proceed to Checkout')]")
    public static WebElement checkOutButton;

    @FindBy (xpath = "//h3[contains(.,'Billing Details')]")
    public static WebElement billingDetailsLabel;

    @FindBy (xpath = "//h3[contains(.,'Your order')]")
    public static WebElement orderDetailsLabel;

    @FindBy (xpath = "//h3[contains(.,'Additional Information')]")
    public static WebElement addInfoLabel;

    @FindBy (xpath = "//ul[contains(@class,'methods methods')]")
    public static WebElement paymentMethodLabel;

    public WebElement sortedValueSelected(String Value){
         System.out.println("value from shoppingPL is: "+Value);
         sortedProduct =  driver.findElement(By.xpath("//*[contains(@href,'/shop/?orderby="+Value+"')]"));

         return sortedProduct;
     }



}
