package ie.uat1irishlifehealth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentDetails {

    WebDriver pDriver;

    public PaymentDetails(WebDriver pDriver){
        this.pDriver = pDriver;
        PageFactory.initElements(pDriver,this);
    }

    @FindBy(xpath = "//*[@id=\"p_lt_ctl00_pageplaceholder_p_lt_ctl00_F_02PaymentDetails_accHoldersName\"]")
    WebElement accountName;

    @FindBy(id = "accHolderIBAN")
    WebElement ibanDetails;

    @FindBy(xpath = "//*[@id=\"p_lt_ctl00_pageplaceholder_p_lt_ctl00_F_02PaymentDetails_monthlyPaymentDdl\"]")
    WebElement paymentDate;

    @FindBy(xpath = "//*[@id=\"p_lt_ctl00_pageplaceholder_p_lt_ctl00_F_02PaymentDetails_addressLine1\"]")
    WebElement addressOne;

    @FindBy(xpath = "//*[@id=\"p_lt_ctl00_pageplaceholder_p_lt_ctl00_F_02PaymentDetails_townCity\"]")
    WebElement townCity;

    @FindBy(xpath = "//*[@id=\"p_lt_ctl00_pageplaceholder_p_lt_ctl00_F_02PaymentDetails_countyDdl\"]")
    WebElement selectCounty;

    @FindBy(xpath = "//*[@id=\"form\"]/div[4]/div[4]/article/div/section[3]/div[1]/label")
    WebElement checkBoxOne;

    @FindBy(xpath = "//*[@id=\"form\"]/div[4]/div[4]/article/div/section[3]/div[2]/label")
    WebElement checkBoxTwo;

    @FindBy(xpath = "//*[@id=\"form\"]/div[4]/div[4]/article/div/section[3]/div[3]/label")
    WebElement checkBoxThree;

    @FindBy(xpath = "//*[@id=\"p_lt_ctl00_pageplaceholder_p_lt_ctl00_F_02PaymentDetails_ContinueToReview\"]")
    WebElement continueToReview;

    @FindBy(xpath = "//*[@id=\"p_lt_ctl00_pageplaceholder_p_lt_ctl00_M_08ReviewList_Purchase\"]")
    WebElement confirmPurchase;

    public void enterAccountName(String enterAccountName) {
        accountName.sendKeys(enterAccountName);
    }

    public void enterIbanDetails(String enterIBANDetails) {
        ibanDetails.sendKeys(enterIBANDetails);
    }

    public void enterPaymentDate(String enterPaymentDate) {
        Select select = new Select(paymentDate);
        select.selectByVisibleText(enterPaymentDate);
    }

    public void enterAddressOne(String enterAddressOne) {
        addressOne.sendKeys(enterAddressOne);
    }

    public void enterTownCity(String enterTownCity) {
        townCity.sendKeys(enterTownCity);
    }

    public void enterSelectCounty(String enterCounty) {
        Select select = new Select(selectCounty);
        select.selectByVisibleText(enterCounty);
    }

    public void clickCheckBoxOne() {
        checkBoxOne.click();
    }

    public void clickCheckBoxTwo() {
        checkBoxTwo.click();
    }

    public void clickCheckBoxThree() {
        checkBoxThree.click();
    }

    public void clickContinueToReview() {
        continueToReview.click();
    }

    public void clickConfirmPurchase(){
        confirmPurchase.click();
    }
}
