package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class Homepages {
    public Homepages() {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(25)), this);


    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Vos titres de transport\n" +
            "où et quand vous voulez !']")
    public MobileElement textTitresDeTransport;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Plus tard']")
    public MobileElement btnPlusTard;


    @AndroidFindBy(xpath = "//android.widget.Image[@text='checked CGU/CGV']")
    public MobileElement btnChecked;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OK']")
    public MobileElement btnOK;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Vous pouvez effectuer des achats jusqu'à 50€, mais pour enregistrer une carte il vous faudra créer un compte.\"]")
   public MobileElement getTextCGU;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pourquoi activer la géolocalisation? ']")
    public WebElement textGeolocalisation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"OK, j'ai compris !\"]")
    public WebElement btnOKJ;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public MobileElement btnAutoriser;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[1]")
    public MobileElement btnReseau;

    @AndroidFindBy(className = "android.widget.EditText")
    public MobileElement searchReseau;


}
