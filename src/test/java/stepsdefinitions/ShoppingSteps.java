package stepsdefinitions;

import PageActions.HomePA;
import PageActions.ShoppingPA;
import Utils.SeleniumDriverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ShoppingSteps {

    HomePA homePA = null;
    ShoppingPA shoppingPA = null;

    public ShoppingSteps() {
        this.shoppingPA = new ShoppingPA();
        this.homePA = new HomePA();
        PageFactory.initElements(SeleniumDriverClass.getDriver(), shoppingPA);
        PageFactory.initElements(SeleniumDriverClass.getDriver(), homePA);
    }


//    @Given("The user navigates to {string}")
//    public void the_user_navigates_to(String webPage) {
//        SeleniumDriverClass.navigateToPage(webPage);
//
//

    @Then("The user click on Shop Menu")
    public void the_user_click_on_shop_menu() {
        homePA.clickShopMenu();

    }
    @Then("The user adjust the price filter between {int} and {int}")
    public void the_user_adjust_the_price_filter_between_and(int minimunValue, int maximumValue) {
        shoppingPA.filterByPrice(minimunValue, maximumValue);
    }
    @When("The user click on filter button")
    public void the_user_click_on_filter_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user should view only books between {string} and {string}")
    public void the_user_should_view_only_books_between_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
