package Tests;

import Pages.ContactUs_Page;
import Pages.Home_Page;
import org.testng.annotations.Test;

public class ContactUs_Test extends TestBase
{
Home_Page home;
ContactUs_Page contactPage;
String Email = "test@test.com";
String FullName ="Test User";
String Inquiry = "Hello admin, This is for test";

@Test
    public void UserCanUseContactUs()
{
  home= new Home_Page(driver);
  home.OpenContactUs_Page();
  contactPage=new ContactUs_Page(driver);
  contactPage.ContactUs(FullName, Email, Inquiry);
}
}
