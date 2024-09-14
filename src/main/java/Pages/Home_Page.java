package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends PageBase {
    public Home_Page(WebDriver driver) {
        super(driver);
        jse= (JavascriptExecutor) driver;

    }

    @FindBy(linkText = "Register")
    WebElement registerlink;

    @FindBy(linkText = "Log in")
    WebElement loginLink;



    public void openRegisteration_Page() {
        // origen- refactor: registerlink.click();
        ClickBoton(registerlink);
    }

        public void OpenLoginPage() {
            ClickBoton(loginLink);

        }


        public void OpenContactUs_Page()
            {
                ScrollToBottom();
            }


    }


