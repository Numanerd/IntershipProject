package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DocumentTypesSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    Parent pr = new Parent();


    @And("Navigate to Document Types page")
    public void navigateToDocumentTypesPage() {
        ln.clickFunction(ln.Setup);
        ln.clickFunction(ln.Parameters);
        ln.clickFunction(ln.DocumentTypes);
    }

    @When("Create a Document Types")
    public void createADocumentTypes() {
        pr.fuseProgressBar();
        dc.clickFunction(dc.addImgButton);
        dc.sendKeysFunction(dc.nameInput, "ITU-Techno");
        dc.clickFunction(dc.stage);
        dc.clickFunction(dc.certificate);
        dc.clickFunction(dc.contact);
        dc.clickFunction(dc.employment);
        dc.clickFunction(dc.dismissal);
        dc.clickFunction(dc.certificate);
        js.executeScript("arguments[0].click();", dc.saveBtn);
    }

    @When("Edit Document Types")
    public void editDocumentTypes() {
        dc.sendKeysFunction(dc.searchName,"ITU-Techno");
        dc.clickFunction(dc.searchButton);
        pr.fuseProgressBar();
        dc.clickFunction(dc.editImgButton);
        dc.sendKeysFunction(dc.nameInput, "ITUTechno");
        js.executeScript("arguments[0].click();", dc.saveBtn);
    }

    @And("Delete Document Types")
    public void deleteDocumentTypes() {
        dc.sendKeysFunction(dc.searchName,"ITUTechno");
        dc.clickFunction(dc.searchButton);
        pr.fuseProgressBar();
        dc.clickFunction(dc.deleteImgButton);
        dc.clickFunction(dc.deleteButton);
    }
}
