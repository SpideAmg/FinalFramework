package SwaggaPages;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PhonesPage extends CommonAPI {



    public PhonesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement UnlockedPhones;
    @FindBy(css = "#secondaryNav > nav > div > ul > li:nth-child(2) > a")
    WebElement Phones;
    @FindBy(css = "#section_billboard > div:nth-child(1) > div.row.row-cols-1.row-cols-md-2.row-cols-lg-3.row-cols-xl-4.justify-content-center > div:nth-child(1) > div > div.card-body.text-center > div > div:nth-child(1) > a > img")
    WebElement UnlockedIphones ;
    @FindBy(css = "#section_billboard > div:nth-child(5) > div.row.row-cols-1.row-cols-md-2.row-cols-lg-3.row-cols-xl-4.justify-content-center > div:nth-child(2) > div > div.card-body.text-center > div > div:nth-child(1) > a > img")
    WebElement UnlockedSamsung;
    @FindBy(css = "#section_billboard > div:nth-child(2) > div.row.row-cols-1.row-cols-md-2.row-cols-lg-3.row-cols-xl-4.justify-content-center > div:nth-child(2) > div > div.card-body.text-center > div > div:nth-child(1) > a > img")
    WebElement UnlockedGoogle;
    @FindBy(css = "#section_billboard > div:nth-child(4) > div.row.row-cols-1.row-cols-md-2.row-cols-lg-3.row-cols-xl-4.justify-content-center >\n" +
            "    div:nth-child(2) > div > div.card-body.text-center > div > div:nth-child(1) > a > img")
    WebElement UnlockedMotorola;
    @FindBy(css = "#section_billboard > div:nth-child(6) > div.row.row-cols-1.row-cols-md-2.row-cols-lg-3.row-cols-xl-4.justify-content-center > div:nth-child(2) > div > div.card-body.text-center > div > div:nth-child(1) > a > img")
    WebElement UnlockedOnePlus;
    @FindBy(css = "#section_billboard > div:nth-child(3) > div.row.row-cols-1.row-cols-md-2.row-cols-lg-3.row-cols-xl-4.justify-content-center > div:nth-child(2) > div > div.card-body.text-center > div > div:nth-child(1) > a > img")
    WebElement UnlockedLG;




    public void SelectUnlockedIPhone(WebDriver driver){

        hoverOver(driver,Phones);
        click(UnlockedPhones);
        click(UnlockedIphones);

    }
    public void ScrollToView(WebElement element,WebDriver driver) {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }
    public void ScrollDownAndSelectUnlockedSamsung(WebDriver driver){

        hoverOver(driver,Phones);
        click(UnlockedPhones);
        ScrollToView(UnlockedSamsung,driver);
        waitFor(5);
        click(UnlockedSamsung);
    }

    public void ScrollDownAndSelectUnlockedGoogle(WebDriver driver){

        hoverOver(driver,Phones);
        click(UnlockedPhones);
        ScrollToView(UnlockedGoogle,driver);
        waitFor(5);
        click(UnlockedGoogle);

    }

    public void ScrollDownAndSelectUnlockedMotorola(WebDriver driver){

        hoverOver(driver,Phones);
        click(UnlockedPhones);
        ScrollToView(UnlockedMotorola,driver);
        waitFor(5);
        click(UnlockedMotorola);

    }

    public void ScrollDownAndSelectUnlockedOnePlus(WebDriver driver){

        hoverOver(driver,Phones);
        click(UnlockedPhones);
        ScrollToView(UnlockedOnePlus,driver);
        waitFor(5);
        click(UnlockedOnePlus);

    }
    public void ScrollDownAndSelectUnlockedLG(WebDriver driver){

        hoverOver(driver,Phones);
        click(UnlockedPhones);
        ScrollToView(UnlockedLG,driver);
        waitFor(5);
        click(UnlockedLG);

    }
}
