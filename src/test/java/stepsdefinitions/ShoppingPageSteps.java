package stepsdefinitions;

import PageActions.ShoppingPA;
import PageLocators.ShoppingPL;
import Utils.SeleniumDriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class ShoppingPageSteps {

    ShoppingPA shoppingPA = null;

    public ShoppingPageSteps() {
        this.shoppingPA = new ShoppingPA();
        PageFactory.initElements(SeleniumDriverClass.getDriver(), shoppingPA);
    }

    @When("The user clicks on sort by {string}")
    public void the_user_clicks_on_sort_by(String value) {

        shoppingPA.selectSortDropDown(value);

    }

    @Then("The user can view the sorted product {string}")
    public void the_user_can_view_the_sorted_product(String value) {

        System.out.println("value from stepsdefinitions is: "+value);
        shoppingPA.sortedElementPresent(value);

       // Assert.assertEquals(true, status);

    }

    @When("The user clicks on Sale product label")
    public void the_user_clicks_on_sale_product_label() {
        shoppingPA.clickOnSale();

    }


    @Then("The user can see actual and old price")
    public void the_user_can_see_actual_and_old_price() {
        boolean priceValueStatus;
        shoppingPA.priceVisibility();
        priceValueStatus = shoppingPA.priceVisibility();
        System.out.println("Bool value status: "+priceValueStatus);

        Assert.assertEquals(true, priceValueStatus );

    }

    @When("The user clicks on the Add To Basket button")
    public void the_user_clicks_on_the_add_to_basket_button() {
        shoppingPA.clickAddToBasket();
    }

    @Then("The user can view the Book in the Menu")
    public void the_user_can_view_the_book_in_the_menu() {
        shoppingPA.priceVisibility();
    }

    @Then("The user clicks on View Basket link")
    public void the_user_clicks_on_view_basket_link() {
        shoppingPA.clickViewBasket();

    }

    @Then("The user finds total and subtotal values")
    public void the_user_finds_total_and_subtotal_values() {
        shoppingPA.TotalSubtotalValuesVisibility();
    }

    @Then("The total value is less than the subtotal")
    public void the_total_value_is_less_than_the_subtotal() {
        shoppingPA.TotalSubtotalDifference();

    }

    @Then("The user clicks on on Proceed to Check out button")
    public void the_user_clicks_on_on_proceed_to_check_out_button() {
        shoppingPA.clickOnProceedCheckOut();

    }

    @Then("The user confirms visibility of Billing Details")
    public void the_user_confirms_visibility_of_billing_details() {
        shoppingPA.billingDetailsVisibility();

    }

    @Then("The user confirms visibility of Order Details")
    public void the_user_confirms_visibility_of_order_details() {
        shoppingPA.orderDetailsVisibility();
    }

    @Then("The user confirms visibility of Additional details")
    public void the_user_confirms_visibility_of_additional_details() {
        shoppingPA.additionalDetailsVisibility();
    }

    @Then("The user confirms visibility of Payment gateway details")
    public void the_user_confirms_visibility_of_payment_gateway_details() {
        shoppingPA.paymentDetailsVisibility();
    }



}
