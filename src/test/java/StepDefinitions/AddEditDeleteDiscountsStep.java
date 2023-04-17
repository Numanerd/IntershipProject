package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AddEditDeleteDiscountsStep {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    Parent pr = new Parent();

    @Given("Navigate to Campus Page")
    public void NavigateToCampusPage() {

        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();

    }

    @When("Enter username and password then click login button")
    public void EnterUsernameAndPasswordThenClickLoginButton() {

        dc.sendKeysFunction(dc.username,"turkeyts");
        dc.sendKeysFunction(dc.password,"TechnoStudy123");
        dc.clickFunction(dc.loginButton);

    }

    @Then("User should login successfully on the Website")
    public void UserShouldLoginSuccessfullyOnTheWebsite() {

        dc.verifyContainsTextFunction(dc.txtTechnoStudy,"Techno Study");

    }


    @Given("User clicks Setup on the LeftNav")
    public void userClicksSetupOnTheLeftNav() {

        ln.clickFunction(ln.Setup);

    }

    @When("click on Parameters")
    public void clickOnParameters() {

        ln.clickFunction(ln.Parameters);

    }

    @Then("click on Discounts")
    public void clickOnDiscounts() {

        ln.clickFunction(ln.Discounts);

    }

    @And("click on Add Button")
    public void clickOnAddButton() {

        dc.clickFunction(dc.addImgButton);
        dc.sendKeysFunction(dc.description,"Numan");
        dc.sendKeysFunction(dc.codeInput,"erd1");
        dc.sendKeysFunction(dc.priority,"12");
        dc.clickFunction(dc.boslukclick);
        dc.clickFunction(dc.saveBtn);

    }

    @Then("click on Edit Button")
    public void clickOnEditButton() {

        pr.wait.until(ExpectedConditions.elementToBeClickable(dc.descriptionInput));
        dc.clickFunction(dc.descriptionInput);
        dc.sendKeysFunction(dc.descriptionInput,"Numan");
        dc.clickFunction(dc.searchButton);
        pr.fuseProgressBar();
        dc.clickFunction(dc.editImgButton);
        dc.sendKeysFunction(dc.description,"Num");
        dc.sendKeysFunction(dc.codeInput,"e");
        dc.sendKeysFunction(dc.priority,"11");
        dc.clickFunction(dc.boslukclick);
        dc.clickFunction(dc.saveBtn);

    }

    @Then("click on Delete Button")
    public void clickOnDeleteButton() {

        pr.fuseProgressBar();
        ln.clickFunction(ln.fields);
        ln.clickFunction(ln.Discounts);
        dc.clickFunction(dc.descriptionInput);
        dc.sendKeysFunction(dc.descriptionInput,"Num");
        dc.clickFunction(dc.searchButton);
        pr.fuseProgressBar();
        dc.clickFunction(dc.deleteImgButton);
        dc.clickFunction(dc.deleteButton);

    }


}

