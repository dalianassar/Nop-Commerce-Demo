package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email")
    WebElement emailTxtBox;

    @FindBy(id = "Password")
    WebElement PasswordTxtBox;

    @FindBy(xpath ="//*[@id='main']/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    WebElement LoginBtn;

    public void Userlogin(String email , String password){

        setTextElementText(emailTxtBox, email);
        setTextElementText(PasswordTxtBox, password);
        ClickBoton(LoginBtn);
    }
}
