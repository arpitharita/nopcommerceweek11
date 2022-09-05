package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitis.Utility;

public class LoginTest extends Utility {
    String baseUrl =  "https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openbrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        //* click on the ‘Login’ link
        clickOnElement(By.xpath("//a[@class='ico-login']"));

        //* Verify the text ‘Welcome, Please Sign In!’
        String actualtest = getTextFromElement(By.xpath("//div[@class='page-title']"));
        String expectedtest = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedtest,actualtest);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

       //* click on the ‘Login’ link
        clickOnElement(By.xpath("//a[@class='ico-login']"));

        //* Enter valid username
        sendKeysToElement(By.xpath("//input[@class='email']"),"hari@23gmail.com");

        //* Enter valid password
        sendKeysToElement(By.xpath("//input[@class='password']"),"12345@");

        //* Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));

        //* Verify the ‘Log out’ text is display
        String actualtest = getTextFromElement(By.xpath("//a[@class='ico-logout']"));
        String expectedtest = "Log Out";
        Assert.assertEquals(expectedtest,actualtest);
    }
    @Test
    public void verifyTheErrorMessage(){

        //* click on the ‘Login’ link
        clickOnElement(By.xpath("//a[@href='/login?returnUrl=%2F']"));

        //* Enter invalid username
        sendKeysToElement(By.xpath("//input[@class='email']"),"abcd@gmail.com");

        //* Enter invalid password
        sendTextToElement(By.xpath("//input[@class='password']"),"12345");

        //* Click on Login button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));

        //* Verify the error message
        String actualtest = getTextFromElement(By.xpath("/div[@class='message-error validation-summary-errors']"));
        String expectedtest = "Login was unsuccessful. Please correct the errors and try again.";
        Assert.assertEquals(expectedtest,actualtest);
    }
    @After
    public void closebrowser(){
        // driver.quit();
    }
}
