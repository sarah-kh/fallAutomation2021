package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;

import java.security.PublicKey;
import java.util.List;

public class Homepage extends CommonAPI {

//    public void SearchValue() {
//        driver.findElement (By.xpath ("//input[@id='nav-search-submit-button']")).click ();
//    }

    public void clickOnSearchBar(){
        clickOnElementByXpath ("//input[@id='twotabsearchtextbox']");
        TestLogger.log ("search bar clicked");
    }

    public void typeOnSearchBar(String value){
       typeOnElementByXpath ("//input[@id='twotabsearchtextbox']", value);
       TestLogger.log (value + "typed on searchbar");
    }

    public void clickOnSearchButton(){
        clickOnElementByXpath ("//input[@id='nav-search-submit-button']");
        TestLogger.log ("search button clicked");
    }

    public List<WebElement> getAllElementFromList(){
        //List<WebElement> elementList = driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
        //return elementList;
        return driver.findElements (By.xpath ("//*[contains(@value, 'search-alias')]")); //how many elements on the list
    }

}
