package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class MyAccount_Page extends PageBase{
    public MyAccount_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='main']/div/div[1]/div/div[2]/ul/li[7]/a")
     WebElement changPasswordLink;

    //@FindBy(id ="OldPassword" )
    @FindBy(xpath = "//*[@id='OldPassword']")
     WebElement OldPasswordTxt;

    //@FindBy(id = "NewPassword")
    @FindBy(xpath = "//*[@id='NewPassword']")
     WebElement NewpasswordTxt;

    //@FindBy(id = "ConfirmNewPassword")
    @FindBy(xpath = "//*[@id='ConfirmNewPassword']")
      WebElement ConfirmPassordTxt;

    //@FindBy(css = "input.button-1.change-password-button")
    @FindBy(xpath = "//*[@id='main']/div/div[2]/div/div[2]/form/div[2]/button")
     WebElement ChangepasswordBTN;

    //@FindBy(css = "div.result")
    @FindBy(xpath = "//*[@id='bar-notification']/div/p")
    public WebElement ResultLbl;

    public void openChangePasswordPage()
    {
    ClickBoton(changPasswordLink);
    }
    public void Changepassord(String OldPassword, String NewPassword)
    {
    setTextElementText(OldPasswordTxt,OldPassword);
    setTextElementText(NewpasswordTxt,NewPassword);
    setTextElementText(ConfirmPassordTxt,NewPassword);
    ClickBoton(ChangepasswordBTN);
    }
}
