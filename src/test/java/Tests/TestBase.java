package Tests;

import Tests.utilities.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

public class TestBase {
    //public static WebDriver driver;

    public static WebDriver driver;
    static ChromeOptions options;


    @BeforeSuite
    @Parameters({"browser"})
    public void startDriver (@Optional("Chrome") String BrowserName) throws InterruptedException {
        if (BrowserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (BrowserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            }
            else if (BrowserName.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            }

            //System.setProperty("Webdriver.Chrome.driver",System.getProperty("user.dir")+"/drivers/Chromedriver.exe");
            //WebDriverManager.chromedriver().setup();
            //options = new ChromeOptions();
            //options.addArguments("--remote-allow-origins=*");
            //driver = new ChromeDriver(options);
            //driver = new ChromeDriver();
            driver.manage().window().maximize();
            //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
           driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

    }

        @AfterSuite
        public void StopDriver ()
        {

            //driver.quit();
        }
        // take screenshot when testcase fail and add to screnshot Folder
        @AfterMethod
    public void ScreenshotOnfailure(ITestResult result) throws IOException {
if (result.getStatus()==ITestResult.FAILURE){
    System.out.println("Failed!");
    System.out.println("Taking screenshot.....");
    Helper.captureScreenShots(driver,result.getName());
}
    }
}

