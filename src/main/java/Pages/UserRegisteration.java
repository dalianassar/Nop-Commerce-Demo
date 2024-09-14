package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisteration extends PageBase {

    public UserRegisteration(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "gender-female")
    WebElement GenderRadioBtn;


    @FindBy(id ="FirstName")
      WebElement FrstNameTxtBox;

    @FindBy(id = "LastName")
    WebElement LnameTxtBox;

    @FindBy(id = "Email")
    WebElement MailTxtBox ;

    @FindBy(id = "Password")
    WebElement passTxtBox ;

    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPassTxtBpox;

    @FindBy(id = "register-button")
    WebElement RegisterBtb;

    @FindBy(css = "div.result")
    public WebElement SuccessMessage;

   // @FindBy(linkText = "Log out")
    @FindBy(xpath = "//a[@class='ico-logout']")
     public WebElement Logout_Link ;

    @FindBy(linkText ="My account" )
    WebElement myAccountLink;
    
    public void UserRegisteration(String fristNmae, String Mail , String LastName , String Password ){
        /*GenderRadioBtn.click();
        FrstNameTxtBox.sendKeys(fristNmae);
        LnameTxtBox.sendKeys(LastName);
        MailTxtBox.sendKeys(Mail);
        passTxtBox.sendKeys(Password);
        ConfirmPassTxtBpox.sendKeys(Password);
        RegisterBtb.click();
       */ ClickBoton(RegisterBtb);
        ClickBoton(GenderRadioBtn);
        setTextElementText(FrstNameTxtBox,fristNmae);
        setTextElementText(LnameTxtBox,LastName);
        setTextElementText(MailTxtBox,Mail);
        setTextElementText(passTxtBox,Password);
        setTextElementText(ConfirmPassTxtBpox,Password);
        ClickBoton(RegisterBtb);
    }
    public void userLogout(){
    ClickBoton(Logout_Link);
    }

    public void openMyAccountPage()
    {
        ClickBoton(myAccountLink);
    }


}






