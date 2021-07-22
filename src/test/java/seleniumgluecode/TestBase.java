package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.CartPage;
import pom.HomePage;
import pom.MobilePage;
import pom.TvPage;

public class TestBase {

    protected WebDriver  driver     = Hooks.getWebDriver();
    protected HomePage   homePage   = new HomePage(driver);
    protected MobilePage mobilePage = new MobilePage(driver);
    protected TvPage     tvPage     = new TvPage(driver);
    protected CartPage   cartPage   = new CartPage(driver);


}
