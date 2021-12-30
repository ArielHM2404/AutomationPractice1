package stepsdefinitions;

import PageActions.HomePA;
import PageActions.LoginPA;
import Utils.SeleniumDriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSteps {


//    HomePA homePA = null;
    LoginPA loginPA = null;

    public LoginPageSteps() {
        this.loginPA = new LoginPA();
        PageFactory.initElements(SeleniumDriverClass.getDriver(), loginPA);
    }


    @When("enter valid {string} and {string}")
    public void enter_valid_and(String username, String password) {
        loginPA.login(username, password);

    }

    @And("click on Login button")
    public void clickOnLoginButton() {

        loginPA.clickLoginBtn();
    }

    @Then("the user should be successfully login to the web page")
    public void the_user_should_be_successfully_login_to_the_web_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verified");
    }
}
