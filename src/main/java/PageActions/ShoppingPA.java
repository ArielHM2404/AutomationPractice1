package PageActions;

import PageLocators.HomePL;
import PageLocators.ShoppingPL;
import Utils.SeleniumDriverClass;
import Utils.Utils;
import io.github.sukgu.support.ElementFieldDecorator;
import jdk.jshell.execution.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class ShoppingPA {

    WebDriver driver;
    ShoppingPL ShopPL = null;

    public ShoppingPA() {
        this.ShopPL = new ShoppingPL(SeleniumDriverClass.getDriver());
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(driver));
        PageFactory.initElements(SeleniumDriverClass.getDriver(), ShopPL);
    }


    public void selectSortDropDown(String value){

        Utils.customWait(3);

        Utils.SelectDropDown(ShopPL.sortSelect,value);
    }


    public void sortedElementPresent(String value){
        Utils.customWait(2);
        //boolean status;
        //status =
        Utils.isElementPresent(ShopPL.sortedValueSelected(value));
        System.out.println("value from shoppingPA is: "+value);

    }

    public void clickOnSale(){
        Utils.customWait(2);

        ShoppingPL.saleLabel.click();

    }

    public boolean priceVisibility(){
        boolean priceValue;

        if(!ShoppingPL.actualPrice.getText().isEmpty() &&
           !ShoppingPL.oldPrice.getText().isEmpty() ){
            System.out.println("Actual Price"+ShoppingPL.actualPrice.getText());
            System.out.println("Old Price"+ShoppingPL.oldPrice.getText());
            priceValue = true;
        }else{
            priceValue = false;
        }

        return priceValue;
    }


    public void clickAddToBasket(){
        Utils.customWait(2);
        ShoppingPL.addToBasketButton.click();

    }

    public void BookMenuVisibility(){
        Utils.customWait(2);
        Utils.isElementPresent(ShoppingPL.priceBookMenuLabel);

    }

    public void clickViewBasket(){
        Utils.customWait(2);
        ShoppingPL.viewBasketLink.click();

    }

    public void TotalSubtotalValuesVisibility(){
        Utils.customWait(2);
        ShoppingPL.totalPrice.isDisplayed();
        ShoppingPL.subTotalPrice.isDisplayed();
    }

    public boolean TotalSubtotalDifference(){
        Utils.customWait(2);
        String Total = ShoppingPL.totalPrice.getText();
        String Subtotal = ShoppingPL.subTotalPrice.getText();

        int total = Integer.parseInt(Total);
        int subtotal = Integer.parseInt(Subtotal);

        if(total > subtotal ){
            return true;
        }else{
            return false;
        }

    }

    public void clickOnProceedCheckOut(){
        Utils.customWait(2);
        ShoppingPL.checkOutButton.click();

    }

    public void billingDetailsVisibility(){
        Utils.customWait(2);
        Utils.isElementPresent(ShoppingPL.billingDetailsLabel);

    }


    public void orderDetailsVisibility(){
        Utils.customWait(2);
        Utils.isElementPresent(ShoppingPL.orderDetailsLabel);

    }

    public void additionalDetailsVisibility(){
        Utils.customWait(2);
        Utils.isElementPresent(ShoppingPL.addInfoLabel);

    }

    public void paymentDetailsVisibility(){
        Utils.customWait(2);
        Utils.isElementPresent(ShoppingPL.paymentMethodLabel);

    }

}
