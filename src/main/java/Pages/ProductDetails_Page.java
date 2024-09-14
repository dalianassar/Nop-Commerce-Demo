package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails_Page extends PageBase{
    public ProductDetails_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//strong[@class='current-item']")
    public WebElement productNameBreadCrumb;


}
