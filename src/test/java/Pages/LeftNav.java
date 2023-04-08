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
}
