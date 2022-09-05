package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilitis.Utility;

public class RegisterTest extends Utility {

    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openbrowser(BaseUrl);

    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

        //* click on the ‘Register’ link
        clickOnElement(By.xpath("//a[@class='ico-register']"));

        //* Verify the text ‘Register’
        String actualTest = getTextFromElement(By.xpath("//a[@class='ico-register']"));
        String expectedTest = "Register";
        Assert.assertEquals(expectedTest,actualTest);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){

        //* click on the ‘Register’ link
        clickOnElement(By.xpath("//a[@class='ico-register']"));

        //* Select gender radio button
        clickOnElement(By.xpath("//input[@id='gender-male']"));

        clickOnElement(By.xpath("//input[@id='gender-female']"));

        //* Enter First name
        sendKeysToElement(By.xpath("//input[@id='FirstName']"),"webdrive");

        //* Enter Last name
        sendKeysToElement(By.xpath("//input[@id='LastName']"),"xyzp");

        //* Select Day Month and Year
        sendKeysToElement(By.xpath("//select[@name='DateOfBirthDay']"),"11");

        sendTextToElement(By.xpath("//select[@name='DateOfBirthMonth']"),"Jun");

        sendTextToElement(By.xpath("//select[@name='DateOfBirthYear']"),"1925");

        //* Enter Email address
        sendKeysToElement(By.xpath("//input[@id='Email']"),"web11@gmail.com");

        //* Enter Password
        sendKeysToElement(By.xpath("//input[@name='Password']"),"12345@");

        //* Enter Confirm password
        sendKeysToElement(By.xpath("//input[@id='ConfirmPassword']"),"12345@");

        //* Click on REGISTER
        clickOnElement(By.xpath("//button[@name='register-button']"));

        //* Verify the text 'Your registration completed’
        String actualTest = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedTest = "Your registration completed";
        Assert.assertEquals(expectedTest,actualTest);
    }
    @After
    public void closebrowser(){
        // driver.quit();
    }
}
