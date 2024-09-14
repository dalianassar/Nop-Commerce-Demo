package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Searsh_Page extends PageBase{
    public Searsh_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "small-searchterms")
    WebElement SearshTxtBox;

    @FindBy (id = "ui-id-1")
   List<WebElement> ProductList;

    @FindBy(xpath = "//button[@class='button-1 search-box-button']")
    WebElement SearchBtn ;

    //@FindBy(xpath = "//h2[@class='product-title']")
    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement productTiltle;

    public void ProductSearch (String productName )
    {
        setTextElementText(SearshTxtBox,productName);
        ClickBoton(SearchBtn);
    }

    public void OpenProductDetailsPage()
    {
    ClickBoton(productTiltle);
    }

    public void ProductSearchUsingAutosugesstion(String searchTxt) throws InterruptedException {
    setTextElementText(SearshTxtBox, searchTxt);
    Thread.sleep(3000);
    ProductList.get(0).click();
    }
}
