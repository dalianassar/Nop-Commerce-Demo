package Tests;

import Pages.ProductDetails_Page;
import Pages.Searsh_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProduct_Test extends TestBase{
String ProductName = "Apple MacBook Pro 13-inch" ;
Searsh_Page searchObject;
ProductDetails_Page detailsObject ;



    @Test
    public void UserCanSearchForProduct() throws InterruptedException {
searchObject = new Searsh_Page(driver);
detailsObject=new ProductDetails_Page(driver);
searchObject.ProductSearch(ProductName);
searchObject.OpenProductDetailsPage();
        System.out.println("Hello");

        //  Assert.assertTrue(detailsObject.productNameBreadCrumb.getText().equalsIgnoreCase(ProductName));
        Assert.assertEquals(detailsObject.productNameBreadCrumb.getText(),ProductName);

}


}
