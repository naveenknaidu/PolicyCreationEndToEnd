package stepDefs;

import Utility.ReadPropertiesFile;
import Utility.TestBase;

import ie.uat1irishlifehealth.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.qameta.allure.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

@Test
@Feature("This is to validate particular insurance product has correct price attached")
public class TestStepDefinitions {
     WebDriver pDriver;
    ReadPropertiesFile rd = new ReadPropertiesFile();
    TestBase tb = new TestBase();
    Properties prop = rd.getProperty();

    @Test(description = "Invoking the browser")
    @Story("Browser will be invoked and ILH web address is placed in the address bar")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Validating the browser is invoked and ILH url is placed in the address bar")
    @Given("User invokes chrome browser invokes ILH website")
    public void user_invokes_chrome_browser_invokes_ilh_website() throws InterruptedException {
        pDriver = TestBase.openBrowser(pDriver, prop.getProperty("browser"), prop.getProperty("baseURL") );
        Thread.sleep(3000);

    }
    @Test(description = "Scroll Down")
    @Story("Webpage will be scroll down until next step button is visible")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validating the webpage is scrolled down until next step button is visible")
    @When("User scrolls down the webpage")
    public void user_scrolls_down_the_webpage() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) pDriver;
        jsExecutor.executeScript("window.scrollBy(0,800)");

    }
    @Test(description = "Click on next step button")
    @Story("The next step button should be enabled and clickable")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validating the next step button is enabled and clickable")
    @When("User clicks on  next step button")
    public void user_clicks_on_next_step_button() {
        new HomePage(pDriver).clickOnNextStep();

    }
    @Test(description = "Click on compare plans button")
    @Story("The compare plans button should be enabled and clickable")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validating the compare plans button is enabled and clickable")
    @When("User clicks on compare plans button")
    public void user_clicks_on_compare_plans_button() throws InterruptedException {
        new ComparePlans(pDriver).clickOnCompareStep();
        Thread.sleep(2000);

    }
    @Test(description = "Scroll Down")
    @Story("Webpage will be scroll down until get quote button is visible")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validating the webpage is scrolled down until get quote button is visible")
    @When("User scrolls down the plans page")
    public void user_scrolls_down_the_plans_page() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) pDriver;
        jsExecutor.executeScript("window.scrollBy(0,300)");


    }
    @Test(description = "Click on Respective plan")
    @Story("The get quote button for the respective plan should be enabled and clickable")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validating the get quote button is enabled and clickable")
    @When("User clicks on get quote button number {string}")
    public void user_clicks_on_get_quote_button(String string) throws InterruptedException {
        new SelectPlans(pDriver).clickOnGetAQuote(string);
        Thread.sleep(2000);


    }
    @Test(description = "Populating the policy start date")
    @Story("User entering the policy start date")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validating the user is able to enter the policy start date")
    @When("User enters date")
    public void user_enters_date_as() throws InterruptedException {
        new PolicyDetailsPage(pDriver).selectStartDate();
        Thread.sleep(3000);
        new PolicyDetailsPage(pDriver).selectDate();

    }
    @Test(description = "Populating the saluation of policy holder")
    @Story("User selecting the saluation of policy holder")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validating the user is able to select the saluation of the policy holder")
    @When("User enters title as {string}")
    public void user_enters_title_as(String string) {
        new PolicyDetailsPage(pDriver).selectTitle(string);

    }
    @Test(description = "Populating the first name of policy holder")
    @Story("User enetring the first name of the policy holder")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validating the user is able to enter the first name of the policy holder")
    @When("User enters first name as {string}")
    public void user_enters_first_name_as(String string) {
        new PolicyDetailsPage(pDriver).enterFirstName(string);

    }
    @Test(description = "Populating the surname of policy holder")
    @Story("User enetring the surname of the policy holder")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validating the user is able to enter the surname of the policy holder")
    @When("User enters surname as {string}")
    public void user_enters_surname_as(String string) {
        new PolicyDetailsPage(pDriver).enterSurname(string);

    }
    @Test(description = "Populating the email address of policy holder")
    @Story("User enetring the email address of the policy holder")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validating the user is able to enter the email address of the policy holder")
    @When("User enters email address as {string}")
    public void user_enters_email_address_as(String string) {
        new PolicyDetailsPage(pDriver).enterEmailAddress(string);

    }
    @Test(description = "Populating the mobile number of policy holder")
    @Story("User enetring the mobile number of the policy holder")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validating the user is able to enter the mobile number of the policy holder")
    @When("User enters mobile number as {string}")
    public void user_enters_mobile_number_as(String string) {
        new PolicyDetailsPage(pDriver).enterMobileNumber(string);

    }
    @Test(description = "Populating the date of birth of policy holder")
    @Story("User enetring the date of birth of the policy holder")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validating the user is able to enter the date of birth of the policy holder")
    @When("User enters DOB as {string}")
    public void user_enters_dob_as(String string) {
        new PolicyDetailsPage(pDriver).enterDateOfBirth(string);

    }
    @Test(description = "Clicking the No radio button")
    @Story("User selecting the No radio button")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validating the user is able to No radio button")
    @When("User selects no radio button")
    public void user_selects_no_radio_button() {
        new PolicyDetailsPage(pDriver).selectRadioButton();

    }
    @Test(description = "Clicking on the get button")
    @Story("User clicking on the get button")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Validating the user is able to click on the get quote button")
    @When("User clicks on the get quote button")
    public void user_clicks_on_the_get_quote_button() throws InterruptedException {
        new PolicyDetailsPage(pDriver).clickOnGetQuote();
        Thread.sleep(6000);

    }
    @Test(description = "Scroll Down")
    @Story("Webpage will be scroll down until price breakdown is visible")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validating the webpage is scrolled down until price breakdown is visible")
    @When("User scroll down the webpage")
    public void user_scroll_down_the_webpage() throws InterruptedException {
        JavascriptExecutor jsExecutor = (JavascriptExecutor)pDriver;
        jsExecutor.executeScript("window.scrollBy(0,300)");
        Thread.sleep(3000);


    }
    @Test(description = "Clicking on the price breakdown button")
    @Story("User clicking on the price breakdown button")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Validating the user is able to click on the price breakdown button")
    @When("User clicks on the plus sign")
    public void user_clicks_on_the_plus_sign() {
        new PaymentDetailsPage(pDriver).clickOnPriceButton();
        JavascriptExecutor jsExecutor = (JavascriptExecutor)pDriver;
        jsExecutor.executeScript("window.scrollBy(0,200)");

    }

    @Test(description = "Take screenshot and save the screen shot")
    @Story("Webpage will be scroll down until next step button is visible")
    @Severity(SeverityLevel.NORMAL)
    @Description("Validating the webpage is scrolled down until next step button is visible")
    @Then("User takes the screenshot saves the {string}")
    public void user_takes_the_screenshot(String string) throws IOException, InterruptedException {
       tb.takeScreenShot(string,pDriver);
       Thread.sleep(3000);


    }

    @Then("User enters account name {string}")
    public void user_enters_account_name(String string) {
        new PaymentDetails(pDriver).enterAccountName(string);

    }

    @Then("user enters IBAN details {string}")
    public void user_enters_IBAN_details(String string) {
        new PaymentDetails(pDriver).enterIbanDetails(string);

    }

    @Then("User enters payment date {string}")
    public void user_enters_payment_date(String string) {
        new PaymentDetails(pDriver).enterPaymentDate(string);

    }

    @Then("User enters address one {string}")
    public void user_enters_address_one(String string) {
        new PaymentDetails(pDriver).enterAddressOne(string);

    }

    @Then("User enters towncity {string}")
    public void user_enters_towncity(String string) {
        new PaymentDetails(pDriver).enterTownCity(string);

    }

    @Then("User selects the county {string}")
    public void user_selects_the_county(String string) {
        new PaymentDetails(pDriver).enterSelectCounty(string);

    }

    @Then("User clicks on checkbox one")
    public void user_clicks_on_checkbox_one() {
        new PaymentDetails(pDriver).clickCheckBoxOne();

    }

    @Then("User clicks on checkbox two")
    public void user_clicks_on_checkbox_two() {
        new PaymentDetails(pDriver).clickCheckBoxTwo();

    }

    @Then("User clicks on checkbox three")
    public void user_clicks_on_checkbox_three() {
        new PaymentDetails(pDriver).clickCheckBoxThree();

    }

    @Then("User clicks on continue to review")
    public void user_clicks_on_continue_to_review() throws InterruptedException {
        new PaymentDetails(pDriver).clickContinueToReview();
        Thread.sleep(4000);

    }
    @Then("User click on confirm purchase")
    public void user_click_on_confirm_purchase(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor)pDriver;
        jsExecutor.executeScript("window.scrollBy(0,800)");
        new PaymentDetails(pDriver).clickConfirmPurchase();
    }


}
