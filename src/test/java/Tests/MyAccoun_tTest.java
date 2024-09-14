package Tests;

import Pages.Home_Page;
import Pages.LoginPage;
import Pages.MyAccount_Page;
import Pages.UserRegisteration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccoun_tTest extends TestBase
{
    Home_Page homeObject;
    UserRegisteration registerObject;
    LoginPage loginObject;
    MyAccount_Page myAccountObject;
    String OldPassword = "1234567";
    String NewPassword = "12345678";
    String fristNmae = "Dalia";
    String LastName = "Nassar";
    String email = "dalia145@outlook.com";





    @Test(priority = 1)
    public void UserCanRegisterSucssesfully()
    {
        homeObject  = new Home_Page(driver);
        homeObject.openRegisteration_Page();
        registerObject = new UserRegisteration(driver);
        registerObject.UserRegisteration("Dalia", "dalia145@outlook.com","Nassar" , "1234567" );
        Assert.assertTrue(registerObject.SuccessMessage.getText().contains("Your registration completed"));
        System.out.println("Dalia Nassar123");
}
    @Test(priority = 2)
    public void RegisteredUserCanChangePassword() throws InterruptedException {
    myAccountObject = new MyAccount_Page(driver);
    registerObject.openMyAccountPage();
    myAccountObject.openChangePasswordPage();
    myAccountObject.Changepassord(OldPassword, NewPassword);
    Assert.assertTrue(myAccountObject.ResultLbl.getText().contains("Password was changed"));

    }
    @Test(priority = 3)
    public void RegisteredUserCanLogout(){
        registerObject.userLogout();
    }

    @Test(priority  =4)
    public void RegisteredUserCanLogin(){
        homeObject.OpenLoginPage();
        loginObject = new LoginPage(driver);
        loginObject.Userlogin(email, NewPassword);
        //Assert.assertTrue(registerObject.Logout_Link.isDisplayed());
        Assert.assertTrue(registerObject.Logout_Link.getText().contains("Log out"));
}
}
