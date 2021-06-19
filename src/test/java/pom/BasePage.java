package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.concurrent.ExecutionException;

//Aqui vamos a tener todos los comandos(acciones) Selenium, ejemplo click, getText, etc.
// Esta es la encargada de interacturar con webdriver
public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver ){
        this.driver = driver;
    }

    public void click(By element) throws Exception {

        try {
            driver.findElement(element).click();

        } catch (Exception e) {
            throw new Exception("No se pudo hacer click sobre el elemento: " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {

        try {
            return driver.findElement(element).isDisplayed();

        } catch (Exception e) {
            throw new Exception("No se pudo encontrar el elemento: " + element);
        }
    }


    public String getText(By element) throws Exception {
        try {

        return driver.findElement(element).getText();

        } catch (Exception e) {
            throw new Exception("No se pudo ontener el texto del elemento: " + element);
        }
    }

}
