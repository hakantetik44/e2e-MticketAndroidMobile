package stepdefinitions;


import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Homepages;
import utils.Driver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;


public class HomeStepdefs {

    Homepages elements = new Homepages();


    @Given("Anasayfaya git ve kontrol et")
    public void anasayfayaGitVeKontrolEt() throws InterruptedException {


        String ExpectedText = "Vos titres de transport\n" +
                "où et quand vous voulez !";

        assertTrue(elements.textTitresDeTransport.getText().contains(ExpectedText));

    }


    @When("Plus tard butonuna tikla")
    public void plusTardButonunaTikla() {

        elements.btnPlusTard.click();


    }

    @And("Accepter CGU kontrol et")
    public void accepterCGUKontrolEt() {


        String exptectedTextCGU = "Vous pouvez effectuer des achats jusqu'à 50€, mais pour enregistrer une carte il vous faudra créer un compte.";

        assertThat(elements.getTextCGU.getText(), containsString(exptectedTextCGU));


    }


    @And("Accepter CGU tikla")
    public void accepterCGUTikla() {

        elements.btnChecked.click();

        if (elements.btnOK.isDisplayed()) {
            elements.btnOK.click();
        }

    }


    @And("Geolocationu kontol et Ok butonuna tikla")
    public void geolocationuKontolEtOkButonunaTikla() {

        if (elements.textGeolocalisation.isDisplayed()) {

            elements.btnOKJ.click();
        }


    }

    @And("Harita kullanimina izin ver")
    public void haritaKullaniminaIzinVer() {

        String exptectedTextAutoriser = "Lorsque vous utilisez l'appli";
        assertTrue(elements.btnAutoriser.getText().contains(exptectedTextAutoriser));
        elements.btnAutoriser.click();
    }


    @And("Daha sonra bak butonuna tikla")
    public void dahaSonraBakButonunaTikla() {

        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
        PointOption point = PointOption.point(620, 2150);
        touchAction.tap(point).perform();


    }

    @Then("Bir hat ekle")
    public void birHatEkle() throws InterruptedException {

        elements.searchReseau.click();
        elements.searchReseau.sendKeys("Atoumod");


    }
}
