package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.ExelUtulity;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class YB_12_AddSubjectCategories {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to Education tab Subject Categories")
    public void navigateToEducationTabSubjectCategories() {

        ln.clickFunction(ln.education);
        ln.clickFunction(ln.setupEducation);
        ln.clickFunction(ln.subjectCategories);

    }

    @When("Create a Subject Categories")
    public void createASubjectCategories() {
        ArrayList<ArrayList<String>>tablo= ExelUtulity.getData("src/test/java/Apache/Resource/YB_12_SubjectCategories.xlsx","Sheet1",2);
        for (ArrayList<String>satir:tablo
             ) {
            dc.clickFunction(dc.addImgButton);
            dc.sendKeysFunction(dc.nameInput, satir.get(0));
            dc.sendKeysFunction(dc.codeInput,satir.get(1));
            dc.clickFunction(dc.saveBtn);

        }


    }

    @When("Edit a Subject Catogory")
    public void editASubjectCatogory(DataTable dataTable) {
        ArrayList<ArrayList<String>>tablo= ExelUtulity.getData("src/test/java/Apache/Resource/YB_12_SubjectCategories.xlsx","Sheet1",4);
        for (ArrayList<String>satir:tablo
        ) {
            dc.sendKeysFunction(dc.searchName,satir.get(0));
            dc.clickFunction(dc.searchButton);
            dc.searcBtnBayatlama();
            dc.clickFunction(dc.editImgButton);


        }




        List<List<String>> items=dataTable.asLists(String.class);

        for (int i = 0; i <items.size() ; i++) {
            WebElement element=dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element,items.get(i).get(1));
            dc.clickFunction(dc.saveBtn);

        }
    }
}
