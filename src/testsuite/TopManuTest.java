package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilitis.Utility;

public class TopManuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";


    @Before

    public void setUp()
    {
        openbrowser(baseUrl);

    }

    @Test

    public void userShouldNavigateToComputerPageSuccessfully() {

        //* click on the ‘Computers’ Tab
        clickOnElement(By.linkText("Computers"));

        //* Verify the text ‘Computers’
        String actualTest = getTextFromElement(By.linkText("Computers"));
        String expectedText = "Computers";
        Assert.assertEquals(expectedText,actualTest);

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        //* click on the ‘Electronics’ Tab
        clickOnElement(By.linkText("Electronics"));

        //* Verify the text ‘Electronics’
        String actualTest = getTextFromElement(By.linkText("Electronics"));
        String expectedTest = "Electronics";
        Assert.assertEquals(expectedTest,actualTest);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

        //* click on the ‘Apparel’ Tab
        clickOnElement(By.linkText("Apparel"));

        //* Verify the text ‘Apparel’
        String actualTest = getTextFromElement(By.linkText("Apparel"));
        String expectedtext = "Apparel";
        Assert.assertEquals(expectedtext,actualTest);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        //* click on the ‘Digital downloads’ Tab
        clickOnElement(By.linkText("Digital downloads"));

        //* Verify the text ‘Digital downloads’
        String actualTest = getTextFromElement(By.linkText("Digital downloads"));
        String expectedText = "Digital downloads";
        Assert.assertEquals(expectedText,actualTest);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){

        //* click on the ‘Books’ Tab
        clickOnElement(By.linkText("Books"));

        //* Verify the text ‘Books’
        String actualTest = getTextFromElement(By.linkText("Books"));
        String expectedTest = "Books";
        Assert.assertEquals(expectedTest,actualTest);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){

        //* click on the ‘Jewelry’ Tab
        clickOnElement(By.linkText("Jewelry"));

        //* Verify the text ‘Jewelry’
        String actualTest = getTextFromElement(By.linkText("Jewelry"));
        String expectedTest = "Jewelry";
        Assert.assertEquals(expectedTest,actualTest);

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){

        //* click on the ‘Gift Cards’ Tab
        clickOnElement(By.linkText("Gift Cards"));

        //* Verify the text ‘Gift Cards’
        String actualTest = getTextFromElement(By.linkText("Gift Cards"));
        String expectedTest = "Gift Cards";
        Assert.assertEquals(expectedTest,actualTest);

    }
    @After
    public void closebrowser(){
        // driver.quit();
    }

}
