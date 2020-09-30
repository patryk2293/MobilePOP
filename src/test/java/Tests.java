import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FastSearchPage;
import pages.MarketDetailsPage;

public class Tests {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.mobile.de/");
        driver.manage().window().maximize();

    }

    @Test
    public void mobileSearch() throws InterruptedException {

        FastSearchPage fastSearchPage = new FastSearchPage(driver);
        fastSearchPage.cookieClose();
        fastSearchPage.selectMark("Audi");
        fastSearchPage.selectModel("A4");
        fastSearchPage.selectKilometer("150.000 km");
        fastSearchPage.selectCity("Berlin");
        fastSearchPage.search();
    }


    @Test
    public void modelDetailsSearch(){

        FastSearchPage fastSearchPage = new FastSearchPage(driver);
        MarketDetailsPage marketDetailsPage = new MarketDetailsPage(driver);
        fastSearchPage.cookieClose();
        marketDetailsPage.clickDropdownInformation();
        marketDetailsPage.clickMarketDetails();
        marketDetailsPage.selectMark("Audi");
        marketDetailsPage.selectModel("A4");
        marketDetailsPage.verifyTitle("Audi A4 (Serie)");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
