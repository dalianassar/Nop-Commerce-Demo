package Tests;

import Pages.Home_Page;
import Pages.LoginPage;
import Pages.UserRegisteration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegisterationTestWithDDTAndExcel extends TestBase
{

    Home_Page homeObject;
    UserRegisteration registerObject;
    LoginPage loginObject;


    @Test(priority = 1, alwaysRun = true)
    public void UserCanRegisterSucssesfully()
    {
        homeObject  = new Home_Page(driver);
        homeObject.openRegisteration_Page();
        registerObject = new UserRegisteration(driver);
        registerObject.UserRegisteration("Dalia", "dalia1111@outlook.com","Nassar" , "1234567" );
        Assert.assertTrue(registerObject.SuccessMessage.getText().contains("Your registration completed"));
        // Assertion to verify Successful registration
        //Assert.assertTrue(registerObject.isRegistrationSuccess());
    }
    @Test(dependsOnMethods = {"UserCanRegisterSucssesfully"})
    public void RegisteredUserCanLogout(){
        registerObject.userLogout();
    }

    @Test(dependsOnMethods = {"RegisteredUserCanLogout"})
    public void RegisteredUserCanLogin(){
        homeObject.OpenLoginPage();
        loginObject = new LoginPage(driver);
        loginObject.Userlogin("dalia1111@outlook.com", "1234567");
        //Assert.assertTrue(registerObject.Logout_Link.isDisplayed());
        Assert.assertTrue(registerObject.Logout_Link.getText().contains("Log out"));

    }


    }



