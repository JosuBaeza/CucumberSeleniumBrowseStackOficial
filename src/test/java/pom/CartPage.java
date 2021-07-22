package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    private By clickMobile           = By.cssSelector("#nav > ol > li.level0.nav-1.first > a");
    private By clickAddtoCartSony    = By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > button > span > span");
    private By clickAddtoCartIphone  = By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(2) > div > div.actions > button");
    private By clickAddtoCartSamsung = By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > button");
    private By clickBackToMobile     = By.cssSelector("#nav > ol > li.level0.nav-1.first.active > a");
    private By CantidadCart          = By.cssSelector("span.count");


    public CartPage(WebDriver driver){
        super(driver);
    }

    public void clickOnMobile() throws Exception {

        this.click(clickMobile);
    }

    public void clickAddtoCartSony() throws Exception {

        this.click(clickAddtoCartSony);
    }

    public void clickAddtoCartIphone() throws Exception{

        this.click(clickAddtoCartIphone);
    }

    public void clickAddtoCartSamsung() throws Exception{
        this.click(clickAddtoCartSamsung);
    }

    public String getCantidadCart() throws Exception{
        return this.getText(CantidadCart);
    }



}
