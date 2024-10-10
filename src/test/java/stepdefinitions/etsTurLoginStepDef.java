package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.etsTurLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class etsTurLoginStepDef {

    etsTurLoginPage page = new etsTurLoginPage();
    String expectedURL = "";
    @Given("Ets sitesine gidilir")
    public void etsSitesineGidilir() {


        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        Driver.getDriver().get(ConfigReader.getProperty("etstur"));

        expectedURL = Driver.getDriver().getCurrentUrl();
    }

    @When("Giris butonuna basilir")
    public void girisButonunaBasilir() {

        page.loginButton.click();
        ReusableMethods.waitFor(1);

    }

    @And("E-posta girilir")
    public void ePostaGirilir() {

        page.emailInput.sendKeys(ConfigReader.getProperty("userMail"));
        ReusableMethods.waitFor(1);
    }

    @And("Sifre girilir")
    public void sifreGirilir() {

        page.passwordInput.sendKeys(ConfigReader.getProperty("userPassword"));
        ReusableMethods.waitFor(1);
    }

    @When("Giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() {


        page.submitButton.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Sayfaya gidilemedigi gorulur")
    public void sayfayaGidilemedigiGorulur() {

        page.inputInfoText.getText();
        String actualURL = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedURL,actualURL);
        Driver.quitDriver();
    }

    @When("Uye ol butonuna tiklanir")
    public void uyeOlButonunaTiklanir() {

        page.registerButton.click();
        ReusableMethods.waitFor(1);
    }

    @And("Isim girilir")
    public void isimGirilir() {
        page.nameInput.sendKeys(ConfigReader.getProperty("isim"));
        ReusableMethods.waitFor(1);
    }

    @And("Soyisim girilir")
    public void soyisimGirilir() {
        page.surnameInput.sendKeys(ConfigReader.getProperty("soyisim"));
        ReusableMethods.waitFor(1);
    }

    @And("Uyelik sebebiyle e-posta girilir")
    public void uyelikSebebiyleEPostaGirilir() {
        page.registerEmailInput.sendKeys(ConfigReader.getProperty("email"));
        ReusableMethods.waitFor(1);
    }

    @And("Tel No girilir")
    public void telNoGirilir() {
        page.phoneInput.sendKeys(ConfigReader.getProperty("phone"));
        ReusableMethods.waitFor(1);
    }

    @And("Alan Kodu degistirilir")
    public void alanKoduDegistirilir() {
        page.numberListBox.click();
        ReusableMethods.waitFor(1);
        page.selectedNumberInList.click();
        ReusableMethods.waitFor(1);

    }

    @And("Uyelik sebebiyle sifre girilir")
    public void uyelikSebebiyleSifreGirilir() {
        page.password1.sendKeys(ConfigReader.getProperty("sifre"));
        ReusableMethods.waitFor(1);
    }

    @And("Sifre tekrarı girilir")
    public void sifreTekrarıGirilir() {
        page.password2.sendKeys(ConfigReader.getProperty("sifre"));
        ReusableMethods.waitFor(1);
    }

    @And("Checkbox lar tiklanir")
    public void checkboxLarTiklanir() {
        page.acceptAllowMarketingCheckBox.click();
        ReusableMethods.waitFor(1);
        page.acceptKvkCheckBox.click();
        ReusableMethods.waitFor(1);

    }

    @When("Uye olmak icin ileri butonuna basilir")
    public void uyeOlmakIcinIleriButonunaBasilir() {
        page.getRegisterButton.click();
    }


}
