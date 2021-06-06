package testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import uiElements.pages.GenericPage;
import utils.TestListeners;

@Listeners(TestListeners.class)
public class VerifyCalculator1 {

    GenericPage genericPage = new GenericPage();

    @Test(priority = 1, groups = "Smoke")
    public void openCalculatorONE(){
        Assert.assertTrue(genericPage.numberOne.isDisplayed());
        System.out.println("IN CLASS 1 - METHOD 1");
    }

    @Test(priority = 2, groups = "Regression")
    public void openCalculator1(){
        Assert.assertTrue(genericPage.numberOne.isDisplayed());
        System.out.println("IN CLASS 1 - METHOD 2");
    }

    @AfterClass
    public void closeTheApp(){
        genericPage.closeAppMethod();
    }

}
