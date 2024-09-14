package Tests.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Helper {
    // Method to take screen shots when case fail
    public static void captureScreenShots(WebDriver driver, String ScreenhotName) throws IOException {

        Path dest = Paths.get("./Screenshhots",ScreenhotName+".png");
        Files.createDirectories(dest.getParent());
        FileOutputStream out = new FileOutputStream(dest.toString());
        out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        out.close();
    }
}
