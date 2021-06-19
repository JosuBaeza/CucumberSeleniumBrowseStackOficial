package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

//Aqui estan los elementos de la página Mobile. en donde los vamos a definir como variables en esta clase.
public class MobilePage extends BasePage{

   private  String ExpectedTitleMobile = "MOBILE";
   private  By     CurrentTitielMobile = By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.page-title.category-title > h1");

    public MobilePage(WebDriver driver){
        super(driver);
    }

    public String getExpectedTitleMobile() {
        return ExpectedTitleMobile;
    }

    public String getTextTitle() throws Exception {

         return this.getText(CurrentTitielMobile);
    }

    /*
   //esto me va a devolver un boolean. si se cumple lo de adentro es verdadero y si no falso
    public boolean getTextTitleFormaVideo() throws Exception {

        return this.getText(CurrentTitielMobile).equals(ExpectedTitleMobile);

    }
    */




}

