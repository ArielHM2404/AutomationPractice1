package stepsdefinitions;

import PageActions.HomePA;
import Utils.SeleniumDriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class LoginSteps {

    HomePA homePA = null;

    public LoginSteps() {
        this.homePA = new HomePA();
        PageFactory.initElements(SeleniumDriverClass.getDriver(), homePA);
    }

//    private void invokeWebPage(){
//        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("http://practice.automationtesting.in/");
//
//        WebElement myAccountLink = driver.findElement(By.id("menu-item-50"));
//        myAccountLink.click();
//    }

    @Given("The user navigates to {string}")
    public void the_user_navigates_to(String webPage) {
        SeleniumDriverClass.navigateToPage(webPage);


    }

    @Given("the user is in the main page")
    public void theUserIsInTheMainPage() {
        System.out.println("abm: theUserIsInTheMainPage");
//        invokeWebPage();
    }

    @When("click on My Account menu")
    public void clickOnMyAccountMenu() {
        System.out.println("Step Implementation");
    }

    @And("enter valid username")
    public void enterValidUsername() {
        System.out.println("Step Implementation");
    }

    @And("enter valid password")
    public void enterValidPassword() {
        System.out.println("Step Implementation");
    }

    @And("click on Login button")
    public void clickOnLoginButton() {
        System.out.println("Step Implementation");
    }

    @Then("the user should be successfully login to the web page")
    public void theUserShouldBeSuccessfullyLoginToTheWebPage() {
        System.out.println("Step Implementation");
    }

    @And("enter invalid username")
    public void enterInvalidUsername() {
        System.out.println("Step Implementation");
    }

    @And("enter invalid password")
    public void enterInvalidPassword() {
        System.out.println("Step Implementation");
    }

    @Then("the user should be displayed with invalid user\\/password error message")
    public void theUserShouldBeDisplayedWithInvalidUserPasswordErrorMessage() {
        System.out.println("Step Implementation");
    }

    @And("enter empty password")
    public void enterEmptyPassword() {
        System.out.println("Step Implementation");
    }

    @Then("the user should be displayed with empty password error message")
    public void theUserShouldBeDisplayedWithEmptyPasswordErrorMessage() {
        System.out.println("Step Implementation");
    }

    @And("enter empty username")
    public void enterEmptyUsername() {
        System.out.println("Step Implementation");
    }

    @Then("the user should be displayed with empty user error message")
    public void theUserShouldBeDisplayedWithEmptyUserErrorMessage() {
        System.out.println("Step Implementation");
    }

    @Then("the user should be displayed with empty user\\/password error message")
    public void theUserShouldBeDisplayedWithEmptyUserPasswordErrorMessage() {
        System.out.println("Step Implementation");
    }

    @And("enter a password")
    public void enterAPassword() {
        System.out.println("Step Implementation");
    }

    @Then("the password should be masked")
    public void thePasswordShouldBeMasked() {
        System.out.println("Step Implementation");
    }

    @And("enter valid username in upper case")
    public void enterValidUsernameInUpperCase() {
        System.out.println("Step Implementation");
    }

    @And("enter valid password in upper case")
    public void enterValidPasswordInUpperCase() {
        System.out.println("Step Implementation");
    }
}
