package seleniumgluecode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


//@ExtendWith(SeleniumExtension.class)
public class Testti extends TestBase {

    //Logger log;

    private String PriceTvLG;
    private String PriceTvSamsung;
    private String TitleTv1;
    private String TitleTv2;



    @Given("^El usuario se encuentra en la pagina Home de la tienda$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_la_tienda() throws Throwable {
        assertEquals( driver.getCurrentUrl(), homePage.getExpectedURL(), "Error: no es correcta la URL");
    }

    @When("^hace click sobre el boton Mobile$")
    public void hace_click_sobre_el_boton_Mobile() throws Throwable {
        homePage.clickOnMobile();
    }


    @Then("^Se debe redirigir a la pantalla mobile$")
    public void se_debe_redirigir_a_la_pantalla_de_comics() throws Throwable {
       //esto lo usamos si queremos validar como lo hacen en el video
      // Assert.assertTrue("no se obtuvo el elemento", mobilePage.getTextTitle());

        String CurrentTitleMobile = mobilePage.getTextTitle();
        assertEquals( mobilePage.getExpectedTitleMobile(), CurrentTitleMobile, "Error: no es correcto el titulo de la pestaña 'Mobile'");

    }

    /*
        Ingresar a la categoria TV desde la pantalla Home

     */

    @When("^hace click sobre el boton TV$")
    public void hace_click_sobre_el_boton_TV() throws Throwable {
       homePage.clickOnTv();

    }

    @Then("^Se debe redirigir a la pantalla TV$")
    public void se_debe_redirigir_a_la_pantalla_TV() throws Throwable {

        String CurrentTitleTv = tvPage.getTextTitleTv();
        assertEquals( tvPage.getExpectedTitleTV(), CurrentTitleTv, "Error: no es correcto el titulo de la pestaña 'TV'");

    }

    /*
         Validar precios de los televisores

     */

    @Given("^El usuario se encuentra en la pagina de televisores$")
    public void elUsuarioSeEncuentraEnLaPaginaDeTelevisores() throws Throwable {


    }

    @Then("^El valor de TV marca Lg debe ser \\$(\\d+)$")
    public void elValorDeTVMarcaLgDebeSer$(String PriceTvLG) throws Throwable {
        this.PriceTvLG = PriceTvLG;
        String CurrentPriceTV = tvPage.getTextPriceTVLG().replaceAll("\\p{Punct}", "");
        assertEquals( PriceTvLG, CurrentPriceTV, "Error: no es correcto el precio de la TV marca LG'");

    }

    @Then("^El valor de la TV marca Samsung debe ser (\\d+)$")
    public void elValorDeLaTVMarcaSamsungDebeSer(String PriceTvSamsung) throws Throwable {
        this.PriceTvSamsung = PriceTvSamsung;
        String CurrentPriceTV = tvPage.getTextPriceTVSAMSUNG().replaceAll("\\p{Punct}", "");

        assertEquals( PriceTvSamsung, CurrentPriceTV, "Error: no es correcto el precio de la TV marca Samsung'");


    }

    /*
         Validar los titulos de los televisores

         Se vuelven a escribir los metdoos, porque ahora estamos usando la estructura de java. es por eso que el meotodo haceClickSobreElBotonTV se vuelve a escribir.

     */


    @When("^Hace click sobre el boton TV$")
    public void haceClickSobreElBotonTV() throws Throwable {

    }

    @Then("^La primera TV debe tener el siguiente titulo \"([^\"]*)\"$")
    public void laPrimeraTVDebeTenerElSiguienteTitulo(String TitleTv1) throws Throwable {

    }

    @Then("^La segunda TV debe tener el siguiente titulo \"([^\"]*)\"$")
    public void laSegundaTVDebeTenerElSiguienteTitulo(String TitleTv2) throws Throwable {

    }












}
