package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Aqui estan los elementos de la página TV. en donde los vamos a definir como variables en esta clase.
public class TvPage extends BasePage{

    private String expectedTitleTV          = "TV";
    private By     currentTitleTV           = By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.page-title.category-title > h1");
    private By     getCurrentPriceTvLG      = By.cssSelector("#product-price-4");
    private By     getCurrentPriceTvSamsung = By.cssSelector("#product-price-5 > span");
    private By     clickOnTV                = By.cssSelector("#nav > ol > li.level0.nav-2.last > a");
    private By     getCurrentTitleTV        = By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > h2 > a");
    private By     getCurrentTitleTV2       = By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(2) > div > h2 > a");

    public String getExpectedTitleTV() {
        return expectedTitleTV;
    }

    public TvPage(WebDriver driver) {
        super(driver);
    }

    public String getTextTitleTv() throws Exception {

        return this.getText(currentTitleTV);
    }

    public String getTextPriceTVLG() throws Exception {

        return this.getText(getCurrentPriceTvLG);
    }

    public String getTextPriceTVSAMSUNG() throws Exception {

        return this.getText(getCurrentPriceTvSamsung);
    }

    public void clickOnTV() throws Exception {
        this.click(clickOnTV);
    }

    public String getCurrentTitleTV() throws Exception {

        return this.getText(getCurrentTitleTV);
    }

    public String getCurrentTitleTV2()throws Exception{
        return this.getText(getCurrentTitleTV2);
    }

}
