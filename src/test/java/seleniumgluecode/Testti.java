package seleniumgluecode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pom.CartPage;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//@ExtendWith(SeleniumExtension.class)
public class Testti extends TestBase {

    //Logger log;

    //private static WebDriver webDriver;

    private String PriceTvLG;
    private String PriceTvSamsung;
    private String TitleTv1;
    private String TitleTv2;
    private String TotalCart;
    private String MensajeBienvenida;
    private String NEWSLETTERS;
    private String DefaultBillingAddress;
    private String DefaultShippingAddress;



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
        tvPage.clickOnTV();
    }

    @Then("^La primera TV debe tener el siguiente titulo \"([^\"]*)\"$")
    public void laPrimeraTVDebeTenerElSiguienteTitulo(String TitleTv1) throws Throwable {
        this.TitleTv1 = TitleTv1;
        String CurrentTitleTV1 = tvPage.getCurrentTitleTV().replaceAll("\\p{Punct}", "");

        assertEquals( TitleTv1, CurrentTitleTV1, "Error: no es correcto el titulo de la TV LG'");
    }

    @Then("^La segunda TV debe tener el siguiente titulo \"([^\"]*)\"$")
    public void laSegundaTVDebeTenerElSiguienteTitulo(String TitleTv2) throws Throwable {
        this.TitleTv2 = TitleTv2;
        String CurrentTitleTV2 = tvPage.getCurrentTitleTV2().replaceAll("\\p{Punct}", "");

        assertEquals( TitleTv2, CurrentTitleTV2, "Error: no es correcto el titulo de la TV SAMSUNG'");

    }


    /*
         Validar carrito de compras



     */

    @Given("^El usuario se encuentra en la pagina de Smartphones$")
    public void elUsuarioSeEncuentraEnLaPaginaDeSmartphones() throws Throwable {

        cartPage.clickOnMobile();

    }

    @When("^hace click sobre el boton Add To Cart en el celular Sony$")
    public void haceClickSobreElBotonAddToCartEnElCelularSony() throws Throwable {
        cartPage.clickAddtoCartSony();

    }


    @When("^Hace click sobre el boton Add To Cart en el celular Iphone$")
    public void haceClickSobreElBotonAddToCartEnElCelularIphone() throws Throwable {

        Thread.sleep(2000);
        cartPage.clickAddtoCartIphone();
    }

    @When("^Hace click sobre el boton Add To Cart en el celular Samsung$")
    public void haceClickSobreElBotonAddToCartEnElCelularSamsung() throws Throwable {
        cartPage.clickAddtoCartSamsung();
    }

    @Then("^Se deben agregar los (\\d+) smartphones al carrito de manera correcta$")
    public void seDebenAgregarLosSmartphonesAlCarritoDeManeraCorrecta(String TotalCart) throws Throwable {
        this.TotalCart = TotalCart;
        String CantidadCart = cartPage.getCantidadCart().replaceAll("\\p{Punct}", "");

        assertEquals( TotalCart, CantidadCart, "Error: el total de productos del carrito no es el correcto'");


    }

    @Then("^El Carrito no debe estar Vacio$")
    public void elCarritoNoDebeEstarVacio() throws Throwable {
        String CantidadCart = cartPage.getCantidadCart().replaceAll("\\p{Punct}", "");

        int CantidadCart2 = Integer.parseInt(CantidadCart);
        Boolean condicion;

        if(CantidadCart2 >=1){
            condicion = true;
        }else{
            condicion = false;
        }
        Assert.assertFalse("error, el carrito esta vacio", condicion.equals(false));

    }

    @Then("^El total a pagar debe ser de \\$(\\d+)\\.(\\d+)$")
    public void elTotalAPagarDebeSerDe$(int arg1, int arg2) throws Throwable {

    }

    @Then("^El subtotal a pagar debe ser de \\$(\\d+)\\.(\\d+)$")
    public void elSubtotalAPagarDebeSerDe$(int arg1, int arg2) throws Throwable {

    }



    /*
          Validar informacion personal
     */


    @Given("^el usuario ingreso a la pagina$")
    public void elUsuarioIngresoALaPagina() throws Throwable {

    }

    @Given("^hace click en Account$")
    public void haceClickEnAccount() throws Throwable {





    }

    @Given("^hace click en MyAccount$")
    public void haceClickEnMyAccount() throws Throwable {


    }

    @Given("^el usuario esta en MyAccount$")
    public void elUsuarioEstaEnMyAccount() throws Throwable {

    }

    @When("^busca informacion de su perfil$")
    public void buscaInformacionDeSuPerfil() throws Throwable {

    }

    @Then("^el mensaje de bienvenida debe ser \"([^\"]*)\"$")
    public void elMensajeDeBienvenidaDebeSer(String mensajeBienvenida) throws Throwable {
        this.TotalCart = mensajeBienvenida;



    }

    @Then("^el titulo de contact debe ser \"([^\"]*)\"$")
    public void elTituloDeContactDebeSer(String NEWSLETTERS) throws Throwable {
        this.TotalCart = NEWSLETTERS;



    }


}
