package uiElements.pages;

import config.PropertiesFile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.AppDriver;

public class BasePage {

    protected static AppiumDriver driver = AppDriver.getDriver();

    public BasePage () {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        PropertiesFile.readPropertiesFile();
    }

    /**
     * Refreshes browser
     */
    public void refreshBrowser()
    {
        driver.navigate().refresh();
    }

    /**
     * Close App
     */
    public void closeAppMethod() {
        driver.closeApp();
    }

}
