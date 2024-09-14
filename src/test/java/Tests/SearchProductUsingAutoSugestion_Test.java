package Tests;

import Pages.ProductDetails_Page;
import Pages.Searsh_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductUsingAutoSugestion_Test extends TestBase{
    String ProductName = "Apple MacBook Pro 13-inch" ;
    Searsh_Page searchObject;
    ProductDetails_Page detailsObject ;
    @Test
    public void UserCanSearchWithAutoSuggest() throws InterruptedException {
        try {
            searchObject = new Searsh_Page(driver);
            searchObject.ProductSearchUsingAutosugesstion("MacB");
            detailsObject = new ProductDetails_Page(driver);
            Assert.assertEquals(detailsObject.productNameBreadCrumb.getText(),ProductName);

        }
        catch (Exception e)
        {
            System.out.println("Error occured " + e.getMessage());
        }

    }
}
