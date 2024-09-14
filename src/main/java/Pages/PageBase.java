package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected  WebDriver driver;
    public JavascriptExecutor jse;

    // constactor
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    protected static void ClickBoton(WebElement Boton){
        Boton.click();
    }

    protected static void setTextElementText (WebElement TextElement , String value ){
        TextElement.sendKeys(value);
   }

   public void ScrollToBottom()
   {
jse.executeScript("ScrollBy(0,2500)");
   }
}
