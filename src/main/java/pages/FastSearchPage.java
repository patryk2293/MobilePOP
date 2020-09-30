package pages;

import helpers.Methods;
import locators.FastSearchLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FastSearchPage {

    WebDriver driver;
    WebDriverWait wait;
    FastSearchLocators fastSearchLocators;

    public FastSearchPage(WebDriver driver){
        this.driver = driver;
        fastSearchLocators = new FastSearchLocators();
        PageFactory.initElements(driver,fastSearchLocators);
        wait = new WebDriverWait(driver,10);
    }


    public void selectMark(String mark) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getMark()));
        Methods.selectElementFromDropDown(fastSearchLocators.getMark(),mark);
        Thread.sleep(6000);
    }

    public void selectModel(String model){
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getModel()));
        Methods.selectElementFromDropDown(fastSearchLocators.getModel(),model);
    }

    public void selectKilometer(String kilometer){
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getKilometer()));
        Methods.selectElementFromDropDown(fastSearchLocators.getKilometer(),kilometer);
    }

    public void selectCity(String city){
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getCity()));
        fastSearchLocators.getCity().sendKeys(city);
    }

    public void search(){
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getSearchButton()));
        Methods.clickOnButton(fastSearchLocators.getSearchButton());
    }
    public void cookieClose(){
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getCookie()));
        Methods.clickOnButton(fastSearchLocators.getCookie());
    }

}

