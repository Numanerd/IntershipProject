package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
@After
public void after (Scenario senaryo){
    System.out.println("Senaryo Bitti");

    if (senaryo.isFailed()){
        TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
final byte[] ramhali=ts.getScreenshotAs(OutputType.BYTES);
senaryo.attach(ramhali,"image/png","Screenshot name");
    }
GWD.quitDriver();
}
}
