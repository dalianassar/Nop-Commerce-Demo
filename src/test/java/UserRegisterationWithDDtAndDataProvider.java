import Pages.Home_Page;
import Pages.LoginPage;
import Pages.UserRegisteration;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserRegisterationWithDDtAndDataProvider extends TestBase {
    Home_Page homeObject;
    UserRegisteration registerObject;
    LoginPage loginObject;


    @DataProvider(name = "TestData")
    public static Object [][] UserData()
    {
        return new Object [][]{
                {"Dalia","Nassar", "dalia3333@outlook.com","521545"}
                ,

                {"Sara", "Mohamed", "Sara3333@outlook.com","521546"}
        };
    }
    @Test(priority = 1, alwaysRun = true , dataProvider = "TestData")
    public void UserCanRegisterSucssesfully(String Fname, String Lname, String email, String Password)
    {
        homeObject  = new Home_Page(driver);
        homeObject.openRegisteration_Page();
        registerObject = new UserRegisteration(driver);
        registerObject.UserRegisteration(Fname,Lname,email,Password );
        Assert.assertTrue(registerObject.SuccessMessage.getText().contains("Your registration completed"));
        registerObject.userLogout();
        homeObject.OpenLoginPage();
        loginObject = new LoginPage(driver);
        loginObject.Userlogin(email,Password);
        //Assert.assertTrue(registerObject.Logout_Link.isDisplayed());
        Assert.assertTrue(registerObject.Logout_Link.getText().contains("Log out"));
        // Assertion to verify Successful registration
        //Assert.assertTrue(registerObject.isRegistrationSuccess());
    }
    }


