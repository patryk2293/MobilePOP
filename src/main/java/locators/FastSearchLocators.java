package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.awt.windows.WBufferStrategy;

public class FastSearchLocators {

    @FindBy(id="qsmakeBuy")
    private WebElement mark;

    public WebElement getMark() {
        return mark;
    }

    public void setMark(WebElement mark) {
        this.mark = mark;
    }

    @FindBy(id="qsmodelBuy")
    private WebElement model;

    public WebElement getModel() {
        return model;
    }

    public void setModel(WebElement model) {
        this.model = model;
    }

    @FindBy(css="#qsmilwrp .form-control.form-control--combobox")
    private WebElement kilometer;

    public WebElement getKilometer() {
        return kilometer;
    }

    public void setKilometer(WebElement kilometer) {
        this.kilometer = kilometer;
    }

    @FindBy(id="ambit-search-location")
    private WebElement city;

    public WebElement getCity() {
        return city;
    }

    public void setCity(WebElement city) {
        this.city = city;
    }

    @FindBy(id="qssub")
    private WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }

    @FindBy(id="gdpr-consent-accept-button")
    private WebElement cookie;

    public WebElement getCookie() {
        return cookie;
    }

    public void setCookie(WebElement cookie) {
        this.cookie = cookie;
    }
}
