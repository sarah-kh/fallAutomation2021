package searchResult;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import reporting.TestLogger;

public class ResultPage extends CommonAPI {

    public void validateSearchPageDisplayed(){
        WebElement element = getElement ("//span[@class='a-size-base a-color-base a-text-bold']");
        Assert.assertEquals (element.isDisplayed (),true, "element isn`t displayed");
        TestLogger.log ("search result panel is displayed:" + element.isDisplayed ());
    }
}
