package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.ExelUtulity;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.ArrayList;

public class Step_09_Create_Edit_Delete_School_Depart {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to School Departments")
    public void navigateToSchoolDepartments() {
        ln.clickFunction(ln.Setup);
        ln.clickFunction(ln.schoolSetup);
        ln.clickFunction(ln.SchoolDepartment);
    }

    @When("Create School Departments with Apache")
    public void createSchoolDepartmentsWithApache()  {

        ArrayList<ArrayList<String>> tablo= ExelUtulity.getData("src/test/java/Apache/Resource/schoolDepartment.xlsx","Sheet1",2);

        for (ArrayList<String> satir:tablo   ) {
            dc.clickFunction(dc.addImgButton);
            dc.sendKeysFunction(dc.nameInput, satir.get(0));
            dc.sendKeysFunction(dc.codeInput, satir.get(1));
            dc.clickFunction(dc.saveBtn);

        }


    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.verifyContainsTextFunction(dc.successfullyElement, "successfully");
    }
}
