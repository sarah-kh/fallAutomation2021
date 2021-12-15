package testHomepage;

import homepage.Homepage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import searchResult.ResultPage;

import java.lang.reflect.GenericArrayType;
import java.util.List;

public class TestHomepage extends Homepage {

    @Test(enabled = false)
    public void clicksearchbox(){
        //SearchValue ();
    }
    ResultPage resultPage = new ResultPage ();

    @Test(enabled = false)
    public void validateSearchButton(){
        clickOnSearchBar ();
        typeOnSearchBar ("Java Book");
        clickOnSearchButton ();
        sleepFor (2);
        resultPage.validateSearchPageDisplayed ();
        sleepFor (10);
    }

    @Test(enabled = true)
    public void testAllDropDownMenu(){
        List<WebElement> elementList = getAllElementFromList ();
        System.out.println(elementList.size ()); //how many elements on the list
        for (int i =0; i < elementList.size ();i ++){
            System.out.println(elementList.get (i).getText ());
        }
    }
}
