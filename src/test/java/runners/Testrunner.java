package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features",
    glue= ("seleniumgluecode"),
    plugin = {"json:test/report/cucumber_report.json"},
    snippets= CAMELCASE
)


//solo una vez

public class Testrunner {

    @AfterClass
    public static void finished(){

        /*
        try{
            System.out.println("Generarndo Reporte");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Generarndo Generado Satifactoriamente!");

        }catch(Exception ex){

        }
        */
    }

}
