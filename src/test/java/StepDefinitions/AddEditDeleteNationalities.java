package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEditDeleteNationalities {

    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();

    @Given("navigate to Campus Page")
    public void NavigateToCampusPage() {

        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("enter username and password then click login button")
    public void EnterUsernameAndPasswordThenClickLoginButton() {

        dc.sendKeysFunction(dc.username, "turkeyts");
        dc.sendKeysFunction(dc.password, "TechnoStudy123");
        dc.clickFunction(dc.loginButton);
    }

    @Then("user should login successfully on the Website")
    public void UserShouldLoginSuccessfullyOnTheWebsite() {

        dc.verifyContainsTextFunction(dc.txtTechnoStudy, "Techno Study");
    }
    @Given("user clicks Setup on the LeftNav")
    public void userClicksSetupOnTheLeftNav() {

        ln.clickFunction(ln.Setup);
    }
    @When("Click on Parameters")
    public void clickOnParameters() {

        ln.clickFunction(ln.Parameters);
    }
    @And("Click on Nationalities")
    public void Nationalities()
    {
        ln.clickFunction(ln.Nationalities);
    }

    @Then("Click on Add Button")
    public void clickOnAddButton() {

        dc.clickFunction(dc.addImgButton);
        dc.clickFunction(dc.closeButton);

    }

    @Then("Click on Edit Button")
    public void clickOnEditButton() {

        dc.clickFunction(dc.editImgButton);
        dc.clickFunction(dc.closeButton);

    }

    @Then("Click on Delete Button")
    public void ClickOnDeleteButton() {

        dc.clickFunction(dc.deleteImgButton);
        dc.clickFunction(dc.deleteButton);

    }

}

