package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class AddEditDeleteDocumentTypesSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
    Parent pr = new Parent();

    @When("Navigate to Document Types")
    public void navigateToDocumentTypes() {
       // pr.fuseProgressBar();
        ln.clickFunction(ln.Setup);
        ln.clickFunction(ln.Parameters);
        ln.clickFunction(ln.DocumentTypes);
    }

    @And("Creat a Documnet Types")
    public void creatADocumnetTypes() {
        pr.fuseProgressBar();
        dc.clickFunction(dc.addImgButton);
        dc.sendKeysFunction(dc.nameInput, "ITU-Techno");
        dc.clickFunction(dc.stage);
        dc.clickFunction(dc.certificate);
        dc.clickFunction(dc.contact);
        dc.clickFunction(dc.employment);
        js.executeScript("arguments[0].click();", dc.saveBtn);
    }

    @When("Edit Document Types")
    public void editDocumentTypes() {
        pr.fuseProgressBar();
        dc.sendKeysFunction(dc.searchName, "ITU-Techno");
        dc.clickFunction(dc.searchButton);
        pr.fuseProgressBar();
        dc.clickFunction(dc.editImgButton);
        dc.sendKeysFunction(dc.nameInput, "ODTU-Techno");
        js.executeScript("arguments[0].click();", dc.stage);
        dc.clickFunction(dc.certificate);
        dc.clickFunction(dc.contact);
        dc.clickFunction(dc.employment);
        dc.clickFunction(dc.dismissal);
        dc.clickFunction(dc.studentRgstr);
        dc.clickFunction(dc.examination);
        js.executeScript("arguments[0].click();", dc.saveBtn);
    }

    @And("Delete Document Types")
    public void deleteDocumentTypes() {
        pr.fuseProgressBar();
        dc.sendKeysFunction(dc.searchName, "ODTU-Techno");
        dc.clickFunction(dc.searchButton);
        pr.fuseProgressBar();
        dc.clickFunction(dc.deleteImgButton);
        dc.clickFunction(dc.deleteButton);
    }



}