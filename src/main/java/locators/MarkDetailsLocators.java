package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MarkDetailsLocators {

    @FindBy (css="[data-se=\"header-nav-link-toggle__hdinf\"]")
    private WebElement informationList;

    public WebElement getInformationList() {
        return informationList;
    }

    public void setInformationList(WebElement informationList) {
        this.informationList = informationList;
    }

    @FindBy (css="[data-se=\"header-nav-link__hdinfmd\"]")
    private WebElement marketDetail;

    public WebElement getMarketDetail() {
        return marketDetail;
    }

    public void setMarketDetail(WebElement marketDetail) {
        this.marketDetail = marketDetail;
    }

    @FindBy (css=".CardInfo___3YfD_F")
    private List<WebElement> markList;

    public List<WebElement> getMarkList() {
        return markList;
    }

    public void setMarkList(List<WebElement> markList) {
        this.markList = markList;
    }

    @FindBy (css=".Card___10_9TK")
    private List<WebElement> modelList;

    public List<WebElement> getModelList() {
        return modelList;
    }

    public void setModelList(List<WebElement> modelList) {
        this.modelList = modelList;
    }

    @FindBy (css=".SeriesStage__Title___3n6MmJ")
    private WebElement title;

    public WebElement getTitle() {
        return title;
    }

    public void setTitle(WebElement title) {
        this.title = title;
    }
}
