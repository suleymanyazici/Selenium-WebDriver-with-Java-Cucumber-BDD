package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class etsTurLoginPage {

    public etsTurLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//*[@id='__next']/div[4]/div[3]/div[1]/div/button[1]")
    public WebElement loginButton;


    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailInput;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//p[@data-test-id='input-info-text']")
    public WebElement inputInfoText;

    @FindBy (xpath = "//*[text()='Üye Ol']")
    public WebElement registerButton;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy (xpath = "//input[@name='surname']")
    public WebElement surnameInput;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement registerEmailInput;

    @FindBy (xpath= "//*[@placeholder='Telefon Numarası']")
    public WebElement phoneInput;

    @FindBy (xpath = "//*[@aria-haspopup='listbox']")
    public WebElement numberListBox;

    @FindBy (xpath = "//*[@data-value='+27']")
    public WebElement selectedNumberInList;

    @FindBy (name = "password")
    public WebElement password1;

//    @FindBy (xpath = "//*[@autocomplete=\'new-password\']")
//    public WebElement password1;

//    @FindBy (id= "/:rf/:")
//    public WebElement password2;

    @FindBy (name = "rePassword")
    public WebElement password2;


    @FindBy (name= "acceptKvk")
    public WebElement acceptKvkCheckBox;

    @FindBy (name="allowMarketing")
    public WebElement acceptAllowMarketingCheckBox;

    @FindBy (xpath= "//*[@type='submit']")
    public WebElement getRegisterButton;


}
