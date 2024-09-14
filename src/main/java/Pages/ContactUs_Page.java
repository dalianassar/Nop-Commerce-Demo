package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs_Page extends PageBase{
    public ContactUs_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FullName")
    WebElement FullNameTxt;

    @FindBy(id =  "Email")
    WebElement EmailTxt;

    @FindBy(id = "Enquiry")
    WebElement EnquiryTxt;

    @FindBy(name = "send-email")
    WebElement SubmitBTN;

    @FindBy(css = "div.result")
    public WebElement SuccessMesseage;

    public void ContactUs(String FullName , String Email, String Enquiry)
    {
setTextElementText(FullNameTxt, FullName);
setTextElementText(EmailTxt, Email);
setTextElementText(EnquiryTxt, Enquiry);
ClickBoton(SubmitBTN);

    }



}
