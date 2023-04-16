package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BankAccountSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    Parent pr = new Parent();

    @And("Navigate to Bank Accounts")
    public void navigateToBankAccounts() {
        ln.clickFunction(ln.Setup);
        ln.clickFunction(ln.Parameters);
        ln.clickFunction(ln.bankAccounts);
    }

    @When("Create Bank Account")
    public void createBankAccount() {
        dc.clickFunction(dc.addImgButton);
        dc.sendKeysFunction(dc.nameInput, "Grup12");
        dc.sendKeysFunction(dc.iban, "123grup12");
        dc.clickFunction(dc.currency);
        dc.clickFunction(dc.currencyTRY);
        dc.clickFunction(dc.saveBtn);
    }

    @When("Edit Bank Account")
    public void editBankAccount() {

        dc.sendKeysFunction(dc.searchName, "Grup12");
        dc.clickFunction(dc.searchButton);
        pr.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));    // sitenin genel bekletmesi;
        dc.clickFunction(dc.myIBAN);
        dc.sendKeysFunction(dc.iban, "124grup12");
        dc.clickFunction(dc.saveBtn);
    }

    @When("Delete Bank Account")
    public void deleteBankAccount() {
        dc.sendKeysFunction(dc.searchName, "Grup12");
        dc.clickFunction(dc.searchButton);
        pr.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));    // sitenin genel bekletmesi;
        dc.clickFunction(dc.ibanDelete);
        dc.clickFunction(dc.deleteButton);
    }
}