package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Setup'][1]")
    public WebElement Setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement Parameters;

    @FindBy(xpath = "//span[text()='Discounts']")
    public WebElement Discounts;

    @FindBy(xpath = "//span[text()='School Setup']")
    public WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement SchoolDepartment;

    @FindBy(xpath = "//span[text()='Education']")
    public WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement setupEducation;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    public WebElement subjectCategories;


    @FindBy(xpath ="//span[text()='Human Resources']")
    public WebElement HumanResources;

    @FindBy(xpath ="(//span[text()='Setup'])[3]")
    public WebElement HumanResourcesSetup;

    @FindBy (xpath = "//span[text()='Position Categories']")
    public WebElement PositionCategories;

    @FindBy(linkText = "Fields")
    public WebElement fields;


}