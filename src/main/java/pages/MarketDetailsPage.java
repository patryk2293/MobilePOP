package pages;

import helpers.SeleneiumMethods;
import locators.MarkDetailsLocators;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MarketDetailsPage {

    WebDriver driver;
    WebDriverWait wait;
    MarkDetailsLocators markDetailsLocators;

    public MarketDetailsPage(WebDriver driver){
        this.driver = driver;
        markDetailsLocators = new MarkDetailsLocators();
        PageFactory.initElements(driver,markDetailsLocators);
        wait = new WebDriverWait(driver, 10);
    }

    public void clickDropdownInformation(){
        wait.until(ExpectedConditions.elementToBeClickable(markDetailsLocators.getInformationList()));
        SeleneiumMethods.clickOnButton(markDetailsLocators.getInformationList());

    }

    public void clickMarketDetails(){
        wait.until(ExpectedConditions.elementToBeClickable(markDetailsLocators.getMarketDetail()));
        SeleneiumMethods.clickOnButton(markDetailsLocators.getMarketDetail());
    }

    public void selectMark(String mark){
        wait.until(ExpectedConditions.visibilityOfAllElements(markDetailsLocators.getMarkList()));
        SeleneiumMethods.selectFromList(markDetailsLocators.getMarkList(),mark);
    }

    public void selectModel(String model){
        wait.until(ExpectedConditions.visibilityOfAllElements(markDetailsLocators.getModelList()));
        SeleneiumMethods.selectFromList(markDetailsLocators.getModelList(),model);
    }

    public void verifyTitle(String titleExpected){
        wait.until(ExpectedConditions.visibilityOf(markDetailsLocators.getTitle()));
        String title = markDetailsLocators.getTitle().getText();
        Assert.assertEquals("Tytuł nie jest zgodny",titleExpected,title);
    }

}
