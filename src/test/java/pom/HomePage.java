package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
El "page object model" es un patrón de diseño de objetos en Selenium, donde las páginas web se representan como clases y
los diversos elementos de la página se definen como variables en la clase.
*/

/*
Entonces, el Page Object Model es la solución que se encontró al problema de que las funciones se repiten y
las acciones las tenemos que hacer varias veces para diferentes tests.
 */

/*
PAGE OBJECT MODEL o Page Factory. POM
 */
public class HomePage extends BasePage{


    private String  ExpectedURL   = "http://live.demoguru99.com/index.php/";
    private  By     clickMobile   = By.cssSelector("#nav > ol > li.level0.nav-1.first > a");
    private  By     clickBotonTV  = By.cssSelector("#nav > ol > li.level0.nav-2.last > a");

    public String getExpectedURL() {
        return ExpectedURL;
    }

    public HomePage(WebDriver driver){

        super(driver);
    }

    public void clickOnMobile() throws Exception {

        this.click(clickMobile);
    }

    public void clickOnTv() throws Exception {

        this.click(clickBotonTV);
    }
}
