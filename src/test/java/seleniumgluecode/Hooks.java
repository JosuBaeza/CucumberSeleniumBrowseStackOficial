package seleniumgluecode;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import java.net.MalformedURLException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


//En esta clase tenemos 2 metodos. 1 que se ejecuta antes y despues de cada "Escenario"
public class Hooks {

    private static WebDriver webDriver;

    public static final String AUTOMATE_USERNAME = "israel_aj7zMH";
    public static final String AUTOMATE_ACCESS_KEY = "WumFXg3pzzEbwmWnNxEf";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
            + "@hub-cloud.browserstack.com/wd/hub";

    @Before
    public void setUp() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        webDriver  = new ChromeDriver(options);
        //webDriver.get("http://live.demoguru99.com/index.php/");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "89.0");
        caps.setCapability("project", "josuejosuejosue");
        caps.setCapability("build", "josuejosuejosue");
        caps.setCapability("name", "josuejosuejosue");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.14.0");

        webDriver = new RemoteWebDriver(new java.net.URL(URL), caps);

        webDriver.get("http://live.demoguru99.com/index.php/");

    }

    /*
        @Before
        public void setUp(){
            System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.get("http://live.demoguru99.com/index.php/");
            webDriver.manage().window().maximize();
        }
  */




        @After
        public void tearDown(){
           webDriver.quit();
        }

    public static WebDriver getWebDriver(){
        return webDriver;
    }

}
