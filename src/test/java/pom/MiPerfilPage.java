package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MiPerfilPage extends BasePage{

    private By Account     = By.cssSelector("#header > div > div.skip-links > div > a > span.label");
    private By MyAccount   = By.cssSelector("#header-account > div > ul > li.first > a");
    private By Bienvenida  = By.cssSelector("body > div.wrapper > div > div.main-container.col2-left-layout > div > div.col-main > div > div > div.welcome-msg > p.hello > strong");
    private By NEWSLETTERS = By.cssSelector("body > div.wrapper > div > div.main-container.col2-left-layout > div > div.col-main > div > div > div:nth-child(3) > div.col2-set > div.col-2 > div > div.box-title > h3");


    public MiPerfilPage(WebDriver driver){

        super(driver);
    }

    public void clickOnAccount() throws Exception {

        this.click(Account);
    }

    public void MyAccount() throws Exception {

        this.click(MyAccount);
    }

    public void Bienvenida() throws Exception {

        this.getText(Bienvenida);
    }
    public void NEWSLETTERS() throws Exception {

        this.getText(NEWSLETTERS);
    }

}
