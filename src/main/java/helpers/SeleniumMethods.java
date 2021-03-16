package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumMethods {

    public static void selectElementFromDropDown (WebElement locator, String expectedtext){
        new Select(locator).selectByVisibleText(expectedtext);
    }

    public static void clickOnButton (WebElement locator){
        locator.click();
    }

    public static void selectFromList(List <WebElement> listLocators, String expectedText){
        for (int i = 0; i <listLocators.size();i++){
            if (listLocators.get(i).getText().contains(expectedText)){
                listLocators.get(i).click();
            }
        }
    }
}
